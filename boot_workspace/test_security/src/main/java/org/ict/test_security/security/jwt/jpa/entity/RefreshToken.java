package org.ict.test_security.security.jwt.jpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ict.test_security.member.jpa.entity.MemberEntity;

import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="refreshTokens")
public class RefreshToken {
    @Id
    @Column(length = 36)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userid", referencedColumnName = "id", nullable = false)
    private MemberEntity user;

    @Column(name="token_value", nullable = false, length = 255)
    private String tokenValue;

    @Column(name="issued at", nullable = false)
    private LocalDateTime issuedAt;

    @Column(name="expires_in", nullable = false)
    private Long expiresin;

    @Column(name="expiration_date", nullable = false)
    private LocalDateTime expirationDate;

    @Column(name="user_agent")
    private String userAgent;

    @Column(length = 50)
    private String status;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();// 현재시간 얻어옴
        if(issuedAt == null) {
            issuedAt = now;
        }
        if(expiresin == null) {
            expirationDate = now.plusSeconds(expiresin/1000);
        }
    }




}
