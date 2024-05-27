package var.run;

import var.sample.VariableSample; // cntl + shift + O

public class TestVariable {
//실행용 클래스임 : main 메소드 가짐
	
	public static void main(String[] args) {
		// 기능제공용 클래스의 기능(method)을 실행하려면
		// 클래스명 레퍼런스변수명 = new 클래스명();
		// 레퍼런스.메소드명();
		VariableSample ref = new VariableSample();
		ref.makeVariable();

	}

}
