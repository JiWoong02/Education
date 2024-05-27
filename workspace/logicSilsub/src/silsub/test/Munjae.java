package silsub.test;

import java.util.Scanner;

public class Munjae {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int mat = sc.nextInt();
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		if(kor>=40&&eng>=40&&mat>=40&&avg>=60) {System.out.println(
				"Korean Score : "+kor+"\n"+"English Score : "+eng+"\n"+
				"Mathematics Score : "+mat+"\n"+ "Total Score : " + tot + "\n"+
				"Average : " + avg +"\n" + "축하드립니다. 합격입니다.");}else {
					System.out.println("불합격입니다.");
				}	
	}
	public void test2() {
		System.out.println("*** 초기 메뉴 ***"+"\n"+"1. 입력"+
									"\n"+"2. 수정"+"\n"+"3. 조회"+"\n"+"4. 삭제"+"\n"+"7. 종료");
		System.out.print("메뉴번호 입력 : ");
		int num = new Scanner(System.in).nextInt();
		if(num==1) {System.out.println("입력메뉴가 선택되었습니다.");}
		else if(num==2) {System.out.println("수정메뉴가 선택되었습니다.");}
		else if(num==3) {System.out.println("조회메뉴가 선택되었습니다.");}
		else if(num==4) {System.out.println("삭제메뉴가 선택되었습니다.");}
		else if(num==7) {System.out.println("프로그램이 종료됩니다.");}
		else {System.out.println("번호가 잘못 입력되었습니다."+"\n"+"다시 입력하십시오.");}
	}
	public void test3() {
		System.out.print("정수를 입력해 주세요 : ");
		int num = new Scanner(System.in).nextInt();
		if(num>0) {System.out.println("양수다.");}
		else {System.out.println("양수가 아니다.");}
	}
	public void test4() {
		System.out.print("정수를 입력해 주세요 : ");
		int num = new Scanner(System.in).nextInt();
		String str ;
		if(num>0) {
			if(num%2==0) {str="짝수다.";}
			else {str="홀수다.";};
			System.out.println("당신이 입력한 숫자는 "+str);
		}
	}
	public void inputTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요 : ");
		String name = sc.next();
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력해 주세요 : ");
		double height = sc.nextDouble();
		if(name.length()>0&&name != null&&age>0&&height>0) 
		{System.out.println("이름 : " + name + "\n" +
									"나이 : " + age + "\n" +
									"키 : " + name + "\n" +
									"확인 : " + name + "의 나이는 " +age+"세이고, 키는"+height+" cm 이다."
				);}
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수를 입력해주세요 : ");
		int b = sc.nextInt();
		if(a>0&&b>0) {System.out.println("첫 번째 정수 : "+ a +"\n"+
				                                          "두 번째 정수 : "+ b +"\n"+
				                                           a+" + "+b+" = "+ (a + b) +"\n"+
				                                           a+" - "+b+" = "+ (a - b) +"\n"+
				                                          a+" * "+b+" = "+ (a*b) +"\n"+
				                                          a+" / "+b+" = "+ (a/b) +"\n"+
				                                          a+" % "+b+" = "+ (a%b) +"\n");}
	}
	public void test7() {
		int score;
		char grade;
		System.out.print("점수를 입력해 주세요 : ");
		score = new Scanner(System.in).nextInt();
		
		if(score>=0) {
			if(score>=90) {grade='A';}
			else if(score>=80) {grade='B';}
			else if(score>=70) {grade='C';}
			else if(score>=60) {grade='D';}
			else {grade='F';}
			System.out.println("점수 : " + score + "\n"+ "학점 : " + grade);
		}	
	}
	public void test2Switch() {
		System.out.println("*** 초기 메뉴 ***"+"\n"+"1. 입력"+
									"\n"+"2. 수정"+"\n"+"3. 조회"+"\n"+"4. 삭제"+"\n"+"7. 종료");
		System.out.print("메뉴번호 입력 : ");
		int num = new Scanner(System.in).nextInt();
		switch(num) {
							case 1 : System.out.println("입력메뉴가 선택되었습니다.");
									break;
							case 2 : System.out.println("수정메뉴가 선택되었습니다.");
									break;
							case 3 : System.out.println("조회메뉴가 선택되었습니다.");
									break;
							case 4 : System.out.println("삭제메뉴가 선택되었습니다.");
									break;
							case 7 : System.out.println("프로그램이 종료됩니다.");
									break;
							default : System.out.println("번호가 잘못 입력되었습니다."+"\n"+"다시 입력하십시오.");
									}
	}
}