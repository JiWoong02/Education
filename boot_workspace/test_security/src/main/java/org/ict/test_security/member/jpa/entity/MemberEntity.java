package org.ict.test_security.member.jpa.entity;


//테이블 생성에 대한 가이드 클래스임

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ict.test_security.member.model.dto.MemberDto;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="MEMBER")
@Entity
public class MemberEntity {
    @Id
    @Column(name="USERID", nullable = false)
    private String userId;
    @Column(name="USERPWD")
    private String userPwd;
    @Column(name="USERNAME", nullable = false)
    private String userName;
    @Column(name="GENDER", nullable = false)
    private String gender;
    @Column(name="AGE", nullable = false)
    private int age;
    @Column(name="PHONE")
    private String phone;
    @Column(name="EMAIL", nullable = false)
    private String email;
    @Column(name="ENROLL_DATE")
    private Date enrollDate;
    @Column(name="LASTMODIFIED")
    private Date lastModified;
    @Column(name="SIGNTYPE", nullable = false)
    private String signType;
    @Column(name="ADMIN_YN", nullable = false)
    private String adminYN;
    @Column(name="LOGIN_OK", nullable = false)
    private String loginOK;
    @Column(name="PHOTO_FILENAME")
    private String photoFileName;


    public MemberDto toDto(){
        return MemberDto.builder()
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
