package test.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSample2 {
	private Scanner sc = new Scanner(System.in);

	public void fileSave() {
		System.out.print("저장할 파일명 (파일명.dat): ");
		String fileName = sc.next();

//		FileOutputStream fout = null;
		
		//try with resource 문 : jdk 1.7 부터 제공됨
		//스트림 자동 반납(close()) 처리해 주는 구문임 => finally 의 close() 처리 필요없음
		//사용법 : try(자동 close 처리할 객체 생성 구문) { 예외 처리할 구문 } catch(예외클래스 레퍼런스) { 예외 발생시 처리내용 }
		//예 : try (FileOutputStream fout = new FileOutputStream(파일명);) //따로 안됨
		
		try(FileOutputStream fout = new FileOutputStream(fileName);) {
			//fout = new FileOutputStream(fileName); // 대상 파일과 스트림이 연결됨
			// 대상 파일이 없으면 자동으로 파일을 만들어서 연결함
			// 대상 파일이 있으면 기존의 내용을 지우고 새로쓰기 상태로 열기함

			// 문자열 형태로 파일에 기록값들을 입력받아서 기록해 넣음
			// 반복 처리함, 종료는 "exit" 입력하면 반복이 끝나고 파일 저장을 완료
			System.out.println(fileName + "에 저장할 내용을 입력하세요.");
			String str = null;
			while ((str = sc.nextLine()).equals("exit") != true) {
				// 사용하는 스트림이 바이트 스트림이므로, String => byte[] 로 바꿈
				fout.write(str.getBytes());
				fout.write("\n".getBytes());
			}
			System.out.println(fileName + "저장 완료!");

		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			return;}
//		} finally {
//			// 사용이 끝난 스트림은 반드시 반납해야 함
//			try {
//				fout.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

	public void fileRead() {
		System.out.print("읽을 파일명 : ");
		String fileName = sc.next();

//		FileInputStream fin = null;
		try(FileInputStream fin = new FileInputStream(fileName);) {
//			fin = new FileInputStream(fileName); // 대상 파일과 스트림 연결
			// 대상 파일이 없으면 에러 발생함
//			int data;
//			while((data = fin.read()) != -1) {
//				System.out.print(data);
//			}
			// 입력받은 파일명으로 File 클래스 객체를 만듦
			File readFile = new File(fileName);
			System.out.println("파일 용량 : " + readFile.length() + " 바이트");
			byte[] readDatas = new byte[(int) readFile.length()];

			fin.read(readDatas);
			System.out.println(new String(readDatas));

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
//		} finally {
//			// 사용이 끝난 스트림은 반드시 반납해야 함
//			try {
//				if (fin != null)
//					fin.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}}
