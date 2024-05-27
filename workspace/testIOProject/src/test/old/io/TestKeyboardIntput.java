package test.old.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestKeyboardIntput {

	public static void main(String[] args) {
		// 자바에서 1.5버전 이후부터는 키보드를 통한 자료형 종류별로 입력받을 때
		// 주로 java.util.Scanner 가 제공하는 메소드 사용함
		// 1.5버전 이전에는 java.io 패키지의 클래스를 이용해서 키보드 입력 처리함
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {		System.out.println("문자 하나 입력 :");
		
			int ch = br.read();
			System.out.println((char)ch + " is unicode" + ch);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
