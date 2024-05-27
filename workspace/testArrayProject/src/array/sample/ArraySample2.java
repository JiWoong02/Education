package array.sample;

public class ArraySample2 {
	
	//생성자(Constructor) : 기본생성자(매개변수 없는 생성자)와 매개변수 있는 생성자 작성해야 함
	//jvm에 의해서 생성자가 없는 클래스를 컴파일할 때 기본생성자를 자동 추가함
	
	//배열을 초기화하는 메소드
	public void arrayInit(int[] ar) {
		//전달받은 ar 을 초기화 처리함
		ar = new int[] {10, 20, 30, 40, 50}; //초기화 할당을 했음 => 주소 저장됨
		//return; //생략 가능함. 
		PrintArray(ar);
	}
	
	//배열을 출력하는 메소드
	public void PrintArray(int[] ar) {
		//매개변수 ar 이 null을 받으면, null.length 작동됨 => NullPointerException 발생함
		//배열공간의주소. length 이어야 함
		System.out.println("할당된 방 갯수 : " + ar.length);//원래는 java.lang 패키지의 System클래스를 사용하기때문에 임포트 후 사용해야함	
																				//하지만 컴파일 할때 자동으로 import java.lang.*; 입력.
																				//jvm에 의해 컴파일시 자동 추가됨
		
		for(int i =0;i<ar.length;i++) {
			System.out.println("ar [" + i + "] :" + ar[i]);
		}
	}//void는 컴파일할때 가장 아래 return; 구문이 자동 추가된다.
	//return 반환값; => 생략 못 함. void X
}
