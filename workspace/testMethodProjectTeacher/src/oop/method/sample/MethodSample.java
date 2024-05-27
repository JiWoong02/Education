package oop.method.sample;

public class MethodSample {
	//Constructor
	public MethodSample() {}
	
	//Method
	//반환값 없고 매개변수도 없는 메소드
	public void hi() {
		System.out.println("안녕!!!");
		return;  //생략 가능
	}	
	
	//반환값 없고 매개변수 있는 메소드
	public void hello(int no) {
		switch(no) {
		case 1:  System.out.println("반갑습니다.");  break;
		case 2:  System.out.println("어서오세요.");  break;
		case 3:  System.out.println("환영합니다.");  break;
		default:  System.out.println("안녕히 가세요.");  
		}
		
		return;
	}
	
	//반환값 있고 매개변수 없는 메소드
	public int randomValue() {
		//return 반환할값;  또는 return 변수;  또는 return 계산식;
		//반환할 값은 1개만 보낼수 있음
		//return 문은 메소드 안에서 맨 마지막에 딱 한번 실행되게 작성해야 함
		return (int)(Math.random() * 100) + 1;
	}
	
	//반환값 있고 매개변수도 있는 메소드
	public int limitRandom(int num1, int num2) {
		//전달받은 두 정수를 큰값, 작은값으로 분류하고
		//작은값에서 큰값 범위 안의 임의의 정수를 발생해서 리턴 처리함
		int max, min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		
		System.out.println(min + " ~ " + max + "사이의 임의의 정수 발생");
		return (int)(Math.random() * (max - min + 1)) + min;
	}
}











