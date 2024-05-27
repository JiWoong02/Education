package operator.sample;

import java.util.Scanner;

public class BitOperator{
	//비트연산자 테스트용
	//비트연산자 : ~(틸드, Tield), <<, >>, >>>, &, ^, |
	//정수에만 사용함, 정수의 2진수 값(비트 0, 비트 1)을 계산에 사용함
	//실수형은 지수부, 가수부 나누어져 있기 때문에 비트 연산자를 사용해선 안됨
	
	//메모리에 기록된 정수의 2진수값을 출력하는 메소드
	public void  printBits(int num) {  //여기서의 num도 지역변수, 이 메소드를 사용할 때 
													//num에 사용할 변수를 입력해라 (매개변수)
		System.out.print(num + " : ");
		for(int i = 31; i >=0; i--) { //i에 31을 넣음, i가 0보다 크거나 같은지 확인, 참이면 실행 , 그후 i-- 실행
			//해당 자리의 비트가 0이면 정수0으로, 비트 1은 정수 1로 출력 처리 함
			System.out.print(num >> i & 1);//&1 =>정수로 바꾸라는 뜻
		}
		System.out.println();
	}
	
	public void testTield(){
		//~ (tield) : 비트반전연산자, 비트 1-> 0, 비트 0은 1로 바뀌는 연산자임
		int num = 24;
		
		//같은 클래스 안에 있는 메소드끼리는 그냥 사용함
		printBits(num);
		printBits(~num); // 해당 정수의 1의 보수를 구함	
		printBits(~num +1); //해당 정수의 0의 보수를 구함(음수의 비트값 확인시 사용함)
	}
	
	public void testBitLogical() {
		// 정수 & 정수, 정수 ^ 정수, 정수 | 정수
		//두 정수의 각 이진수 자리별로 논리연산을 수행함
		//&(And), ^(XOR), |(OR)
		Scanner sc =new Scanner(System.in	);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		
		printBits(first);
		printBits(second);
		printBits(first & second); //둘다 1이면 1
		System.out.println("--------------------------------------------------------------------------------");
		
		printBits(first);
		printBits(second);
		printBits(first ^ second);// 둘이 다르면 1
		System.out.println("--------------------------------------------------------------------------------");
		
		printBits(first);
		printBits(second);
		printBits(first | second); // 둘중 하나만 1이어도 1
		System.out.println("--------------------------------------------------------------------------------");
	}
	public void testShift() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		System.out.print("자리 이동 칸수 : ");
		int move = sc.nextInt();
		
		printBits(num);
		printBits(num << move);
		printBits(num >> move);
		printBits(num >>> move);
	}
}