package oop.array;

import java.util.GregorianCalendar;

//전화번호부 작성을 위한 개인 연락처 정보 저장용
//필드 모두 캡슐화 할 것
//기본생성자와 매개변수 있는 생성자 반드시 있어야 함
//모든 필드에 대한 getter and setter 있어야 함
//모든 필드값들을 하나의 문자열로 합쳐서 return 하는 메소드
public class Person {
	//Field
	private String name;  //이름
	private String phone; //전화번호
	private String group; //분류그룹명
	private GregorianCalendar birth; //생일
	
	//Constructor
	public Person() {}  //기본생성자

	public Person(String name, String phone, String group, GregorianCalendar birth) {
		super();
		this.name = name;
		this.phone = phone;
		this.group = group;
		this.birth = birth;
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public GregorianCalendar getBirth() {
		return birth;
	}

	public void setBirth(GregorianCalendar birth) {
		this.birth = birth;
	}
	
	//모든 필드값들을 하나의 문자열로 합쳐서 return 하는 메소드
	public String information() {
		return this.name + ", " + this.phone + ", " + this.group + ", " + this.birth;
	}
	
	
	
	
	
	
}
