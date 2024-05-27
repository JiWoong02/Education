package test.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataIO {

	public static void main(String[] args) {
		// 값을 자료형별로 입출력 처리하는 보조(처리) 스트림 : DataInputStream, DataOutStream
		TestDataIO test = new TestDataIO();
		test.fileSave();
		test.fileRead();
	}

	public void fileSave() {
		// 보조 스트림 클래스는 단독으로 생성 못 함
		// 연결할 다른 스트림이 필요함
//		FileOutputStream fout = null;

		try (FileOutputStream fout = new FileOutputStream("member.dat");
				DataOutputStream dout = new DataOutputStream(fout);) {
			// 외부자원과 직접 연결하는 스트림을 기본 스트림이라고 함
//			FileOutputStream fout = new FileOutputStream("member.dat");
//			dout = new DataOutputStream(fout);

			String name = "홍길동";
			char gender = '남';
			int age = 28;
			double weight = 78.3;

			// 값 종류별로 파일에 기록 처리
			dout.writeUTF(name);
			dout.writeChar(gender);
			dout.writeInt(age);
			dout.writeDouble(weight);

			dout.flush(); // 스트림 비우기 : 남아있는 데이터를 밀어내기함

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public void fileRead() {
//		FileInputStream fin = null;

		try (DataInputStream din = new DataInputStream(new FileInputStream("member.dat"));){
//			fin = new FileInputStream("member.dat");
			// 파일 입력 스트림 생성시에는 대상 파일이 없으면 예외 발생함(주의할 것)

			// 주의 : 파일에 기록된 데이터 종류 순서대로 읽어야 함
			String name = din.readUTF();
			char gender = din.readChar();
			int age = din.readInt();
			double weight = din.readDouble();

			System.out.println(name + ", " + gender + ", " + age + ", " + weight);

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
