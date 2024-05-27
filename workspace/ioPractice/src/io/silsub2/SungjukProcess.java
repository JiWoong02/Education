package io.silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SungjukProcess sp = new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();
		System.out.println("종료");
	}

	public void sungjukSave() {
		DataOutputStream dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream("score.dat"));
			do {
				System.out.print("국어점수를 입력해주세요 : ");
				int kor = sc.nextInt();
				dout.writeInt(kor);
				System.out.print("영어점수를 입력해주세요 : ");
				int eng = sc.nextInt();
				dout.writeInt(eng);
				System.out.print("수학점수를 입력해주세요 : ");
				int mat = sc.nextInt();
				dout.writeInt(mat);
				int tot = eng + mat + kor;
				dout.writeInt(tot);
				double avg = tot / 3;
				dout.writeDouble(avg);
				System.out.print("계속 저장하시겠습니까?(y/n) : ");
				if (sc.next().toUpperCase().charAt(0) == 'N') {
					System.out.println("score.dat 에 저장 완료.");
					break;
				}
			} while (true);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} finally {
			// 사용이 끝난 스트림은 반드시 반납해야 함
			try {
				if (dout != null)
					dout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void scoreRead() {
		DataInputStream din = null;
		int kor = 0;
		int count = 0;
		int totot=0;
		double totAvg = 0;
		try {
			din = new DataInputStream(new FileInputStream("score.dat"));
			while ((kor = din.readInt()) != -1) {
				count ++;
				int eng = din.readInt();
				int mat = din.readInt();
				int tot = din.readInt();
				double avg = din.readDouble();
				System.out.println("국어점수 : " + kor);
				System.out.println("영어점수 : " + eng);
				System.out.println("수학점수 : " + mat);
				System.out.println("총점 : " + tot);
				System.out.printf("평균 : %.2f ", avg);
				totot += tot;
				totAvg +=avg;
				System.out.println();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽은 횟수 : "+ count);
			System.out.println("전체 총점 : "+ totot/count);
			System.out.printf("전체평균 : %.2f ", totAvg/count);
			System.out.println();
			System.out.println("score.dat 파일 읽기 완료");
			return;
		} finally {
			try {
				if (din != null)
					din.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
