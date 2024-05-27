package logic.testif;

import java.util.Scanner;

public class MultiIfSample {
	/* if(조건식1){
	 * 			   	조건식1이 true 일 때 실행할 구문들
	 * }else if(조건식2){
	 * 				조건식1이 false이고, 조건식2가 true 일 때 실행할 구문들
	 * }else if(조건식3){
	 * 				조건식1이 false이고, 조건식2가 false이고, 조건식3이 true일 때 실행할 구문들
	 * }else if(조건식4){
	 * 				조건식1이 false이고, 조건식2가 false이고, 조건식3이 false이고, 조건식4가 true일 때 실행할 구문들
	 * }else if(조건식5){
	 * 				조건식1이 false이고, 조건식2가 false이고, 조건식3이 false이고, 조건식4도 false이고, 
	 * 				조건식 5가 true 일 때 실행할 구문들
	 * }else {
	 * 		위의 제시한 모든 조건이 false이면 실행할 구문
	 * } */
	public void testThreeMax() {
		//3개의 정수를 입력받아서, 세 수중에서 가장 큰 값을 알아내어 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요. : ");
		int a= sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요. : ");
		int b= sc.nextInt();
		System.out.print("세 번째 정수를 입력해 주세요. : ");
		int c= sc.nextInt();
		
		int max;
		if(a>b&&a>c) {
			max=a;
		}else if(b>c) {
			max=b;
		}else {
			max=c;
		}
		System.out.println("max : "+max);
	}
	public void testScoreGrade() {
		//키보드로 점수(int)를 입력받아, 점수에 대한 등급(char)을 부여해서 출력
		//단, 점수는 반드시 0이상의 값이어야 한다.
		//다중 if문으로 
		//점수가 90이상이면 'A'
		//점수가 80이상이면 'B'
		//점수가 70이상이면 'C'
		//점수가 60이상이면 'D'
		//점수가 60미만이면 'F'
		//점수와 등급을 출력 처리함
		//점수가 0미만이면 "잘못 입력하셨습니다." 출력
		System.out.print("점수를 입력해 주세요 : ");
		int score = new Scanner(System.in).nextInt();
		if(score<0||score>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			char grade;
			if(score>=90) {grade = 'A';}
			else if(score>=80) {grade = 'B';}
			else if(score>=70) {grade = 'C';}
			else if(score>=60) {grade = 'D';}
			else {grade= 'F';}
			System.out.println("점수 : " + score + "\n" + "등급 : " + grade);
		};
	}
	public void testCharacter() {
		//문자를 하나 입력받아서,
		//영문대문자이면 "upper" 라고 출력하고,
		//영어소문자이면 "lower" 라고 출력하고,
		//숫자문자이면 "digit" 라고 출력하고,
		//한글문자이면 "korean" 라고 출력하고,(한글의 범위 : '가'~'힝')
		//그 외의 문자이면 "others"라고 출력되게 함
		System.out.print("문자를 하나 입력해주세요 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		String category;
		if(ch>='A'&&ch<='Z') {category = "upper";}
		else if(ch>='a'&&ch<='z') {category = "lower";}
		else if(ch>='0'&&ch<='9') {category = "digit";}
		else if((ch>='ㄱ'&&ch<='ㅣ')||(ch>='가'&&ch<='힣')) {category = "korean";}
		else {category = "others";}
		System.out.println("입력하신 문자의 종류는 " + category + " 입니다.");
	}
	
	public void testTwoMaxEqual() {
		//두 개의 정수를 입력받아, 두 수를 비교해서 
		//A가 B보다 크다.
		//A가 B와 같다.
		//B가 A보다 크다. 중에서 하나가 출력 되게
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해 주세요 : ");
		int A = sc.nextInt();
		System.out.print("두 번째 정수를 입력해 주세요 : ");
		int B = sc.nextInt();
		if(A>B) {System.out.println(A+"가 "+B+"보다 크다."); }
		else if(A==B) {System.out.println(A+"와 "+B+"는 같다.");}
		else {System.out.println(B+"가 "+A+"보다 크다.");}
	}
}
