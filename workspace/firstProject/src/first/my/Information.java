package first.my;

//클래스 두 종류 메인을 가지고 있느냐 없느냐 이건 메인메소드가 없움
//main 메소드가 없는 클래스 => 기능 제공용 클래스임 
//실행할 수 없는 클래스임
public class Information {
	//Field : 멤버변수 => 객체지향은 왜 등장 했나? (자바는 객체지향 언어이다.)
	//객체지향의 제 1 목적은 캡슐화임 (EnCapsulation) 아무나 접근못하게 막음. 데이터 보호.
	//접근제한자 자료형 변수명;
	//클래스 밖에서는 접근 할 수 없다. 
	private String name;
	private int age;
	private String phone;
	
	//Constructor : 생성자
	//public 클래스명(){}
	//public 클래스명(자료형 변수명){}
	public Information() {}
	
	public Information(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//Destructor : 소멸자 (자바에는 없어ㅠㅠ)(C++에는 있숨)
	//왜???자바가상기계(jvm : Java Virtual Machine) 가 자동으로 메모리 관리를 해 줌
	//할당된 객체 공간(클래스에 의해 만들어진 공간 : instance) 중에서 사용이 끝난 것들을
	//가비지 컬렉터(Garbage Collector : 쓰레기 수집기)가 찾아내서 소멸 처리함
	
	//Method : 멤버함수
	//접근제한자 반환자료형 메소드명(){}
	public void print() {
		System.out.println(this.name + "," + this.age + "세," + this.phone);
	}
}