package org.ict.test_security.security.jwt.filter;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.ict.test_security.member.model.dto.CustomUserDetails;
import org.ict.test_security.member.model.dto.MemberDto;
import org.ict.test_security.security.jwt.util.JWTUtil;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.PrintWriter;

@Slf4j      //Lombok의 Slf4j 어노테이션 사용해서 로깅 기능을 자동 추가함
//Spring Security의 OncePerRequestFilter를 상속받음
//모든 요청에 대해 한번씩 실행되는 필터가 됨
public class JWTFilter extends OncePerRequestFilter {
    //JWT 관련 유틸리티 메서드를 제공하는 JWTUtil 의 인스턴스를 멤버로 선언함
    private final JWTUtil jwtUtil;
    
    //생성자를 통해 멤버변수 의존성 주입함
    public JWTFilter(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
    //필터의 주요 로직을 구현하는 메서드임
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //요청(request)에서 'Authorization' 헤더를 추출함
        String authorization = request.getHeader("Authorization");
        String requestURI = request.getRequestURI();    //누구한테로 요청이 가는 서비스인지 /boards or /members ?
        if("/logout".equals(requestURI)) {
            //찾아갈 대상으로 그대로 넘김
            filterChain.doFilter(request, response);
            return;
        }//토큰 확인이 필요없는 요청(로그인하지 않고 이용하는 서비스 url)은 그대로 다음 단계로 넘김
        
        //'Authorization' 이 헤더에 없거나 Bearer토큰이 아니면 요청을 계속 진행함
        if (authorization == null || !authorization.startsWith("Bearer")){
            filterChain.doFilter(request, response);
            return;
        }

        // Bearer 토큰에서 JWT를 추출함 (토큰 정보가 request헤더에 있는 경우)
        String token = authorization.split(" ")[0];
        
        //토큰 만료 여부 확인, 만료시 다음 필터로 넘기지 않음
        try{
            jwtUtil.isTokenExpired(token);
            }
        catch(ExpiredJwtException e){
        //response body
        PrintWriter writer = response.getWriter();
        writer.println("access token expired");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return;
        }

        //token 에서 category (access, refresh) 추출
        String category = jwtUtil.getCategoryFromToken(token);
        //토큰 category 가 access 가 아니라면 만료된 토큰으로 판단함
        if(!category.equals("access")){
            //response body
        PrintWriter writer = response.getWriter();
        writer.println("invalid token expired");
        //response status code
        //응답 코드를 front와 맞추는 부분 401 에러 외 다른 상태코드로 맞추면
        //리프레시 토큰 발급 체크를 좀 더 빠르게 할 수 있음
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return;
        }
        
        //위의 조건들에 해당되지 않으면, 정상적인 만료되지 않은 access 토큰으로 요청이 왔다면
        //사용자 아이디(또는 이메일), 관리자 여부 추출함
        String userId = jwtUtil.getUserIdFromToken(token);
        String adminYN = jwtUtil.getAdminFromToken(token);
        
        //인증에 사용할 임시 User객체를 생성하고, 추출한 정보 저장함
        MemberDto user = new MemberDto();
        user.setUserId(userId);
        user.setAdminYN(adminYN);
        user.setUserPwd("temp");      //실제 인증에서는 사용되지 않는 임시 비밀번호를 설정함
        //아래 Authentication 객체에 password가 들어가야함

        //인증에 사용할 user 를 기반으로 한 CustomUserDetail 객체가 필요함
        CustomUserDetails userDetails = new CustomUserDetails(user);



        //Spring Security 의 Authentication 객체를 생성하고, SecurityContext 에 등록 설정함
        //이것으로 해당 요청에 대한 사용자 인증이 완료됨
        Authentication authToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authToken);
        
        //필터 체인을 계속 진행함
        filterChain.doFilter(request, response);


    }
}