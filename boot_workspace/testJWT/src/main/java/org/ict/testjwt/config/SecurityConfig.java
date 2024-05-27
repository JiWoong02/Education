package org.ict.testjwt.config;

import jakarta.security.auth.message.AuthException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@Slf4j
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        //권한에 따라 허용하는 url 설정
        httpSecurity
                .authorizeRequests()
                .requestMatchers("/","/boards","/btop3").permitAll()
                .requestMatchers("/notices","/ntop3").permitAll()
                .requestMatchers("/members","/login").permitAll()
                .anyRequest().authenticated();


                return httpSecurity.build();
//                .and()
//                .logout().logoutUrl("/logout")
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .logoutSuccessHandler((request, response, authentication) -> {
//                    //refreshToken (db / redis 에 저장되어 있음) 제거 처리함
//                });

    }
}
