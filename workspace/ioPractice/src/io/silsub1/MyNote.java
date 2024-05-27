package io.silsub1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public MyNote() {
		super();
	}

	public void fileSave() {
		System.out.print("파일에 저장할 내용을 입력하시오 : ");
		StringBuilder text = new StringBuilder();
		FileWriter fw = null;
		char ans = '0';
		String fileName = null;
		String str = null;
		try {
			while (!(str = sc.nextLine()).equals("exit")) {
				text.append(str + "\n");
			}
			System.out.print("저장하시겠습니까? (y/n) : ");
			ans = sc.next().charAt(0);
			if (ans == 'y' || ans == 'Y') {
				System.out.print("저장할 파일명(.txt) : ");
				fileName = sc.next();
				fw = new FileWriter(fileName);
				fw.write(text.toString());
				System.out.println(fileName + "파일에 성공적으로 저장하였습니다.");
				return;
			} else {
				return;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void fileOpen() {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();
		try (FileReader fr = new FileReader(fileName)) {
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String fileName = sc.next();
		String str = null;
		char ans = '0';
		FileReader fr = null;
		FileWriter fw = null;

		StringBuilder text = new StringBuilder();
		try {
			int data;
			fr = new FileReader(fileName);
			while ((data = fr.read()) != -1) {
				text.append((char) data);
			}
			fr.close();

			System.out.println("파일에 추가할 내용을 입력하시오.");
			while (!(str = sc.nextLine()).equals("exit")) {
				text.append(str + "\n");
			}

			System.out.print("변경된 내용을 저장하시겠습니까? (y/n) : ");
			ans = sc.next().charAt(0);
			if (ans == 'y' || ans == 'Y') {
				fw = new FileWriter(fileName);
				fw.write(text.toString());
				System.out.println(fileName + "파일의 내용이 변경되었습니다.");
				return;
			} else {
				return;
			}
		} catch (Exception e) {
			try {
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
