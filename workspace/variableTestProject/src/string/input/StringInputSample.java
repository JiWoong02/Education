package string.input;

import java.util.Scanner;

public class StringInputSample {

	//java.util.Scanner 의 next() 메소드 테스트
	public void testNext() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		//입력되는 문자열 값 사이에 공백 사용 못함
		
		System.out.println("str : " + str);		
		
	}
	
	//java.util.Scanner 의 nextLine() 메소드 테스트
	public void testNextLine() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		//입력되는 문자열 값 사이에 공백 사용함
		//공백 포함 모든 글자들을 읽어들임
		
		System.out.println("str : " + str);		
		
	}
	//java.util.Scanner 의 nextLine() 메소드 사용시 주의사항
	public void testNextLine2() {
		Scanner sc = new Scanner(System.in);
		
		//연속으로 여러 종류의 값을 입력 받을 때
		//nextLine() 은 이전 입력값 뒤에 붙은 엔터키를 값으로 읽어들임 (문제점)
		
		System.out.print("글제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("작성자 입력 : ");
		String writer = sc.next();
		System.out.print("글내용 입력 : ");
		//이전 입력에서 남겨진 엔터키를 읽지 못하게 하려면
		//입력버퍼에서 엔터키를 읽어내서 버림
		sc.nextLine();//읽어내고 보관안하고 해결,,,
		String content = sc.nextLine();

		
		System.out.println("제목 : " + title);		
		System.out.println("작성자 : " + writer);		
		System.out.println("글내용 : " + content);		
		
	}
	
	
}
