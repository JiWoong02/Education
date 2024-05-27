package test.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TestBufferedIO {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자스트림 기반 버퍼이용하는 보조스트림 사용 테스트
		TestBufferedIO test = new TestBufferedIO();

//		test.fileSave();
		test.fileRead();

	}

	public void fileSave() {
		System.out.print("저장할 파일명 (파일명.txt) : ");
		String fileName = sc.next();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));) {
			System.out.println(fileName + " 기록 저장할 내용 입력하세요");

			// "exit"가 입력되면 종료
			String value = null;
			sc.next();// 엔터키 제거
			while (!(value = sc.nextLine()).equals("exit")) {
				bw.write(value + "\n");
//				bw.newLine();
			}
			System.out.println(fileName + " 읽기 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		System.out.print("읽을 파일 명 : ");
		String fileName = sc.next();
		try (BufferedReader brd = new BufferedReader(new FileReader(fileName));) {
			String readData = null;
			while((readData=brd.readLine())!=null) {
				System.out.println(readData);
			}System.out.println(fileName + " 읽기 종료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
