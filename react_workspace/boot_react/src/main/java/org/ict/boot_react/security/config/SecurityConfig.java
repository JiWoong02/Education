package org.ict.boot_react.security.config;


import jakarta.servlet.http.HttpServletResponse;
import org.ict.boot_react.member.model.service.MemberService;
import org.ict.boot_react.security.handler.CustomLogoutHandler;
import org.ict.boot_react.security.jwt.filter.JWTFilter;
import org.ict.boot_react.security.jwt.filter.LoginFilter;
import org.ict.boot_react.security.model.service.RefreshTokenService;
import org.ict.boot_react.security.jwt.util.JWTUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration      //스프링부트의 설정을 담당하는 클래스임을 나타내는 어노테이션임
@EnableWebSecurity  //스프링 시큐리티 설정을 활성화함
public class SecurityConfig {
    private final AuthenticationConfiguration authenticationConfiguration;
    private final RefreshTokenService refreshTokenService;
    private final MemberService memberService;
    private final JWTUtil jwtUtil;
    
    //생성자를 통한 의존성 주입으로, 필요한 서비스와 설정을 초기화함
    public SecurityConfig(AuthenticationConfiguration authenticationConfiguration, RefreshTokenService refreshTokenService, MemberService memberService, JWTUtil jwtUtil) {
        this.authenticationConfiguration = authenticationConfiguration;
        this.refreshTokenService = refreshTokenService;
        this.memberService = memberService;
        this.jwtUtil = jwtUtil;
    }

    //인증(Authentication) 관리자를 스프링 컨테이너에 Bean으로 등록함. 인증 과정에서 중요한 클래스임
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    //HTTP 관련 보안 설정을 정의함
    //SecurityFilterChain 을 Bean 으로 등록하고, http 요청에 대한 보안을 구성함
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                //csrf(Cross-Site Request Forgery), form login, http basic 인증을 비활성화함
                //예 : <img src='http://kakao.developer.com/login/kakao.png'> 이런 요청을 사용할 수 없음 // 이게 cross site request
                .csrf(AbstractHttpConfigurer::disable)
                .formLogin(AbstractHttpConfigurer::disable)     //form 태그로 submit해서 오는 로그인 사용 못 하게 함
                .httpBasic(AbstractHttpConfigurer::disable)// 시큐리티 제공 로그인을 사용 못하게 함
                //HTTP 요청에 대한 접근 권한을 설정함
                .authorizeHttpRequests(auth -> auth
                                .requestMatchers(HttpMethod.POST, "/notices").hasRole("ADMIN")
                                .requestMatchers(HttpMethod.PUT, "/notices").hasRole("ADMIN")
                                .requestMatchers(HttpMethod.DELETE, "/notices").hasRole("ADMIN")
                                .requestMatchers(HttpMethod.POST, "/boards").hasAnyRole("USER", "ADMIN")
                                .requestMatchers(HttpMethod.PUT, "/boards").hasAnyRole("USER", "ADMIN")
                                .requestMatchers(HttpMethod.DELETE, "/boards").hasAnyRole("USER", "ADMIN")
                                //회원서비스의 마이페이지(GET), 내정보 수정 (PUT), 탈퇴(PUT | DELETE) 로그인해야 접근 가능 => "USER" 를 가짐
                                //전송방식이 POST로 오면 이라는 뜻 즉, INSERT  // Token에 Role이 ADMIN인 사람만 NOTICE INSERT를 할 수 있다는 뜻
                                // '/notice' path로 post 요청에 대해서는 'ADMIN' 롤 정보를 가진 사용자만 가능하다.
                                .requestMatchers("/","/api/auth/login","/reissue","/members/**", "/notices/**","/boards/**","/logout").permitAll()
                                //위의 path들은 인증없이 접근 가능하다.
                        .anyRequest().authenticated())   //그 외의 모든 요청은 인증을 요구한다
                    //JWTFilter 와 LoginFilter를 필터 체인에 등록함 => SecurityConfig 작동 전에 실행되게 등록함
                .addFilterBefore(new JWTFilter(jwtUtil), LoginFilter.class)// security 필터 작동 전에 작동하는 필터로 추가하겠다.
                .addFilterAt(new LoginFilter(memberService, refreshTokenService, authenticationManager(authenticationConfiguration), jwtUtil), UsernamePasswordAuthenticationFilter.class)
                //로그아웃 처리를 커스터마이징함
                .logout(logout -> logout
                        .addLogoutHandler(new CustomLogoutHandler(jwtUtil, memberService, refreshTokenService))
                        .logoutSuccessHandler((request, response, authentication) -> {
                            response.setStatus(HttpServletResponse.SC_OK);
                        }))
                    //세션 정책을 STATELESS 로 설정하고, 세션을 사용하지 않는 것을 명시함
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }
}
