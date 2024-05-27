package test.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {

	public static void main(String[] args) {
		// 다중 catch문 과 finally 사용 확인 테스트
		new TestException2().fileRead();
	}

	public void fileRead() {
		FileReader fr = null;
		try {
			// 파일 읽기용 스트림(통로)이 열림
			// 스트림은 대상 파일과 현재 실행중인 프로세스 사이를 연결하는 통로임
			// 운영체제가 관리하고, 스트림 자원의 수는 제한적임 => 사용이 끝나면 반드시 반납해야 함
			fr = new FileReader("sample.txt");
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			

		} catch (FileNotFoundException e) {
			//파일이 존재하지 않을 때 작동됨
//			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
			//파일 읽는 과정에서 에러가 발생했을 때 작동됨
			e.printStackTrace();
		} catch (Exception e) {
			//나머지 모든 예외상황에서 작동됨
			e.printStackTrace();
		} finally {
			System.out.println("작동 확인!");
			try {
				fr.close();    //스트림 반납
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
