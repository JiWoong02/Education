package org.ict.test_security.member.model.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ict.test_security.member.jpa.entity.MemberEntity;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data   //@ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
    public class MemberDto {
    private String userId;
    private String userPwd;
    private String userName;
    private String gender;
    private int age;
    private String phone;
    private String email;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enrollDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastModified;
    private String signType;
    private String adminYN;
    private String loginOK;
    private String photoFileName;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .userId(userId)
                .userPwd(userPwd)
                .userName(userName)
                .gender(gender)
                .age(age)
                .phone(phone)
                .email(email)
                .enrollDate(enrollDate)
                .lastModified(lastModified)
                .signType(signType)
                .adminYN(adminYN)
                .loginOK(loginOK)
                .photoFileName(photoFileName)
                .build();
    }

}
