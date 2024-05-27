package test.objectio;

import java.io.Serializable;

public class Member implements Serializable {

	// Field
	private String name;
	private int age;
	private char gender;
	private String email;
	private String phone;
	private double point;

	public Member() {
		super();
	}

	public Member(String name, int age, char gender, String email, String phone, double point) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", point=" + point + "]";
	}
	
	
}
