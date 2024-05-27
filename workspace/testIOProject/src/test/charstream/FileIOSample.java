package test.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOSample {
	private Scanner sc = new Scanner(System.in);

	public void fileSave() {
		System.out.print("저장할 파일명 (파일명.txt) : ");
		String fileName = sc.next();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			//대상 파일이 없으면 파일을 새로 만들어서 스트림을 연결함
			//대상 파일이 있으면 기존의 내용을 모두 지우고 새로 쓰기 상태로 열기함
			
			System.out.println(fileName + "에 저장할 내용을 입력하세요.");
			String data;
			while((data = sc.nextLine()).equals("exit") != true) {
				fw.write(data + "\n");
			}
			System.out.println(fileName + "저장 완료!");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileRead() {
		System.out.print("읽을 파일명 : ");
		String fileName = sc.next();
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			//대상 파일이 없으면 에러 발생함
			
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}
	public void fileAppend() {
		System.out.print("추가 저장할 파일명 (파일명.txt) : ");
		String fileName = sc.next();
		
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName, true); //append 모드를 true로 지정함
			//대상 파일이 없으면 파일을 새로 만들어서 스트림을 연결함
			//대상 파일이 있으면 기존의 내용을 그대로 두고 마지막 끝에 추가 쓰기 상태로 열기함
			
			System.out.println(fileName + "에 추가로 추가할 내용을 입력하세요.");
			String data;
			while((data = sc.nextLine()).equals("exit") != true) {
				fw.write(data + "\n");
			}
			System.out.println(fileName + " 추가 저장 완료!");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
