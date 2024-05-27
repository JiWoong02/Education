package org.ict.boot_react.security.jpa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ict.boot_react.member.jpa.entity.MemberEntity;

import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="refresh_Tokens")
public class RefreshToken {
    @Id
    @Column(length = 36)
    private UUID id;


    @Column(name="user_id")
    private String userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name="MEMBER", joinColumns = {
            @JoinColumn
                    (name="user_id", referencedColumnName = "USERID", nullable = false)
    })
    private MemberEntity member;


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
