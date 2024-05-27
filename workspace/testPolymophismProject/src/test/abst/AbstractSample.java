package test.abst;

//abstract (추상, 가상) : 미완성을 의미함
//상속을 통해 후손이 미완성 부분을 완성시키도록 할 목적으로 만들어지는 클래스임
//후손에게 추상메소드 오버라이딩 강제화가 목적임

public abstract class AbstractSample {
	// Field
	private int value;

	// 미완성 클래스의 생성자는 후손이 super() 구문으로 사용할 수 있도록
	// protected 접근제어자를 사용함
//	protected AbstractSample() {}

	public AbstractSample() {
	}

	public AbstractSample(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// 미완성 메소드 (abstract method) 를 멤버로 가진 클래스는
	// 무조건 class 앞에 abstract 를 표기해야 함
	// 추상(가상) 메소드 : 메소드 선언만 있고, 메소드 바디가 없는 메소드임
	// 접근제한자 예약어 반환형 메소드명(자료형 매개변수,......);

	public abstract void methodA();
	
//	public void display() {
//		System.out.println("value : " + value);
//	}
	
	
	//메소드 앞에 final이 붙으면 오버라이딩 금지
	public final void display() {
		System.out.println("value : " + value);
	}


}
