package my.exception;

public class Calculator {
	public Calculator() {}
	public int sum(int a, int b) throws MyException {
		//전달된 두 개의 정수는 모두 1 ~ 100 사이의 값이어야 함, 아니면 예외를 발생
		int result = 0;
		
		if((a>=1&&a<=100)&&(b>=1&&b<=100)) {
			result = a+b;
		}else {
			//예외 발생시킴 : throw new 발생할예외클래스생성자("에러메세지");
			throw new MyException("1부터 100사이의 값만 연산이 가능합니다.");
			
		}
		
		return result;
	}
	
	public int devide(int a, int b) throws NotDivideZeroException {
		//나눌 수 b가 0이면 예외발생시킴
		int result=0;
		
		if(b==0) {
			throw new NotDivideZeroException("0으로 나눌 수 없습니다.");
		}else {
			result = a/b;
		}
		
		
		
		return result;
	}
}









