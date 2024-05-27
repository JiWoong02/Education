package test.objectio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MemberManager {
	private Scanner sc = new Scanner(System.in);
	private Member[] mArray;

	public MemberManager(Member[] array) {
		mArray = array; // 배열의 주소 복사
	}

	public void fileSave() {
		System.out.print("저장할 파일명 (파일명.dat) : ");
		String fileName = sc.next();

		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(fileName))) {
			for (Member m : mArray) {
				objOut.writeObject(m);
			}
			System.out.println("\n" + fileName + " 파일에 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {
		System.out.print("읽을 파일 명 : ");
		String fileName = sc.next();

		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))) {
			//읽어들일 객체 저장할 객체 배열 선언 및 할당함
			Member[] members = new Member[mArray.length];
			
			for(int i=0; i<mArray.length;i++) {
				members[i]=(Member)objIn.readObject();
				System.out.println(members[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
