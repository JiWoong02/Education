package test.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TestException1 {

	public static void main(String[] args) {
		//api문서에서 runtime exception이 아니면 예외처리 해야함
		//생성자 확인 후
		TestException1 test = new TestException1();
		try {
			test.methodA();  //반드시 예외처리해야 되는 구문
		} catch (IOException e) {
			// 예외발생
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public void methodA() throws IOException {
		methodB();
	}

	public void methodB() throws IOException {
		methodC();
	}

	public void methodC() throws IOException  {
		FileWriter fw = new FileWriter("sample.txt");
	}

}
