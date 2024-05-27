package org.myweb.first.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//vo(dto, do, entity, bean) 작성규칙
//1. 반드시 직렬화할 것
//2. 모든 필드는 private : 반드시 캡슐화할 것
//3. 기본생성자, 매개변수 있는 생성자 작성할 것
//4. 모든 필드에 대한 getters and setters 
//5. toString() overriding
//선택 : equals(), clone() 등 오버라이딩, 그 외의 메소드
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member /* implements java.io.Serializable */ {
	/* private static final long serialVersionUID = -4952932019676617041L; */

	private String userId;
	private String userPwd;
	private String userName;
	private String gender;
	private int age;
	private String phone;
	private String email;
	private java.sql.Date enrollDate;
	private java.sql.Date lastModified;
	private String signType;
	private String adminYN;
	private String loginOk;
	private String photoFileName;

}

