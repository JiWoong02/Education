package inherit.model.dto;

import java.util.Objects;

//dto(Data Transfer Object) == vo(Value Object) == do(Domain Object) == entity == bean
//값을 저장하는 목적의 클래스

//작성규칙 : 
//1. 반드시 캡슐화할 것 : 모든 필드가 private 일 것
//2. 기본생성자와 매개변수 있는 생성자를 가지고 있어야 함
//3. 모든 필드에 대한 getters and setters 가 있어야 함
//4. toString(), equals() 등에 대한 오버라이딩해야 함 (선택사항임)
//5. 반드시 직렬화할 것 : 네트워크 입출력을 위해 객체 인스턴스를 1바이트 크기로 일렬로 나열하는 것
//   => 직렬화 처리는 java.io.Serializable 인터페이스를 상속받으면 됨
public class Person implements java.io.Serializable {
	//Field
	private String name;
	private int age;
	private char gender;
	private String email;
	private String phone;
	
	//상속시 초기화블럭과 생성자는 후손에게 상속되지 않는다
	//초기화블럭 : 필드 = 초기값; 처리하는 블럭
	//기본값 >> 명시된 초기값 >> 초기화블럭 >> 생성자
	{
		name = "이름없음";
		email = "미정";
		phone= "010-0000-0000";
		gender = '0';
	}
	
	static {
		//static 이 표기된 정적 필드(클래스변수) 초기화 처리
	}
	
	//Constructor
	
	public Person() {
//		super(); //부모의 기본생성자 실행구문, 생성자 안 첫줄에만 작성함
		this("noname", 0, ' ', "nomail","000-0000-0000"); //같은 클래스의 다른 생성자 실행 구문임
		//생성자 안에서 첫 줄에만 작성함. 즉, 부모생성자와 this 둘 중 하나만 가능함
	}

	public Person(String name, int age, char gender, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	
	//Getters and Setters
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && gender == other.gender
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	//오버라이딩 : 부모가 제공하는 메소드를 후손이 다시 만들기 하는 것 (재작성)
	//규칙 1. 부모메소드의 반환형 메소드명(매개변수) 그대로 사용해야 함 : 변경 불가능임, 변경시 에러임
	//규칙 2. 접근제어자는 부모것보다 더 넓은 범위의 것으로 변경 가능함
	//             public > protected > default(package private) > private
	//규칙 3. 부모가 가진 예외를 갯수를 줄일 수 있음 : 0개까지 가능
	@Override
	public Object clone(){
		return new Person(this.name, this.age, this.gender, this.email, this.phone);
	} //다형성
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
