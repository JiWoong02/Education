package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	static Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		// 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
		char ch = 's';
		while (ch != '0') {
			System.out.print("문자를 하나 입력해 주세요. (0을 입력하면 종료됩니다.): ");
			ch = sc.next().charAt(0);
			System.out.println(ch + "의 유니코드는" + (int) ch + "입니다.");
		}

	}

	public void sum1To100() {
		// 1~100까지 정수들의 합계 출력하기(while 문으로 작성)
		int num = 1, sum = 0;
		while (num < 100) {
			sum += num;
			System.out.print(num + " + ");
			num++;
		}
		sum += 100;
		System.out.print("100" + " = " + sum);
	}

	public void numberGame() {
		// 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
		int num = (int) (Math.random() * 100);
		int answer = 101;
		int count = 0 ;
		
		while (num != answer) {
			count += 1;
			System.out.print("1~100사이 숫자를 입력해주세요 : ");
			answer = sc.nextInt();
			if(num>answer) {System.out.println("더 큰 숫자를 입력해 주세요");}
			else if(num<answer) {System.out.println("더 작은 숫자를 입력해 주세요");}
		}
		System.out.println("축하합니다 정답입니다.\n" + count + "번 만에 맞추셨습니다");

	}

	public void countCharacter() {
		// 문자열을 입력받아, 글자 갯수 알아내어 출력하기
		System.out.println("문자열을 입력해 주세요.");
		String str = sc.next();
		System.out.println("글자 갯수는 " + str.length() + "개 입니다.");
		

	}

	public void countInChar() {
		// 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
		System.out.println("문자열을 입력해 주세요.");
		String str = sc.next();
		System.out.println("갯수를 셀 문자를 입력해 주세요");
		char ch = sc.next().charAt(0);
		int count =0,ea=0;
		while(str.length()!=count) {
			if(str.charAt(count)==ch) {
				ea +=1;
			} count +=1;
		}System.out.println("문자열 " +str+"에 포함된 " + ch + "의 갯수는" 
			+ ea + "개 입니다.");
	}

}
