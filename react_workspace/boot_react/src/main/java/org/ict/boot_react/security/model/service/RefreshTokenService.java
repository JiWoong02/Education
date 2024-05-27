package org.ict.boot_react.security.model.service;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.ict.boot_react.security.jpa.entity.RefreshToken;
import org.ict.boot_react.security.jpa.repository.RefreshTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
@Slf4j
public class RefreshTokenService {
    // 의존성 주입 방법 1 :
    //@Autowired
    //private RefreshTokenRepository refreshTokenRepository;

    // 의존성 주입 방법 2: boot 권장
    private final RefreshTokenRepository refreshTokenRepository;
    
    //반드시 매개변수 있는 생성자 작성해야 함
    public RefreshTokenService(RefreshTokenRepository refreshTokenRepository) {
        this.refreshTokenRepository = refreshTokenRepository;
    }
    //방법 2---------------------------------------------------------------------

    public void save(RefreshToken refreshToken) {
        refreshTokenRepository.save(refreshToken);  // insert 실행처리
    }
    
    public Optional<RefreshToken> findByTokenValue(String token) {
        return refreshTokenRepository.findByTokenValue(token);  // select 조회 : 토큰객체 조회 (토큰값)
    }

    public Boolean existsByRefresh(String tokenValue) {
        return refreshTokenRepository.existsByTokenValue(tokenValue); // select 조회 : 토큰객체 존재여부 확인
    }

    public void deleteByRefresh(String tokenValue){
        refreshTokenRepository.deleteByTokenValue(tokenValue);
    }

    public Optional<RefreshToken> findByUserId(String userId) {
        return refreshTokenRepository.findByUserId(userId);
    }

}
