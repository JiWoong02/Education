package ncs.test6;

import java.util.Objects;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + "\t" + password + "\t" + name + "\t" + age + "\t" + gender + "\t" + phone;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		User object = (User) obj;
//		if (this.name == object.name && this.password == object.password && this.phone == object.phone
//				&& this.age == object.age && this.gender == object.gender) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}

	public Object clone() {
		return new User(this.id,this.password,this.name,this.age,this.gender,this.phone);
	}
	
}