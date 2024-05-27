package first.my;
//메인 메소드를 가지고있음 => 실행할 수 있는 클래스다. 이말이야 .

//import java.lang.String; 왜 임포트를 안해도 실행이 될까???? java.lang 패키지는 자동 import처리 된당.
//import java.lang.*; 
//자동으로 추가되는 구문이므로, 표기를 생략해도 됨

public class Profile {
	//실행할 수 있는 클래스임.
	
	public static void main(String[] args) {
		// 실행을 원하는 기능 제공용 클래스 사용법 : 
		//   클래스명 변수명 = new 생성자[클래스명]();  선언함
		Information info = new Information(); //같은 패키지 안의 클래스끼리는 그냥 사용함
		String str = new String();
		//패키지가 다른 클래스를 사용하려면, 반드시 import 선언하고 사용해야 함
		//단, java.lang 패키지는 자바 언어의 기본 패키지이므로, 자동 import 처리됨
		//   => import 선언을 직접하지 않아도 됨
		
		Information info2 = new Information("홍길동", 27, "010-1234-5678");
		info2.print(); //변수.메소드명()
	}

}

