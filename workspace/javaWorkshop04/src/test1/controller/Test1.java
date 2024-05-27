package test1.controller;

import java.util.Scanner;

import test1.model.Score;

public class Test1 {

	public static void main(String[] args) {
		int kor,eng,mat;
		int [] score = new int[3];
		Scanner sc = new Scanner (System.in);
		System.out.print("국어 점수를 입력해주세요 : ");
		score[0]=sc.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		score[1]=sc.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		score[2]=sc.nextInt();
		Score a = new Score();
		a.process(score);
	}

}
