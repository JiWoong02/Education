package Test2.model;

import java.util.Scanner;

public class Student {
	public Student() {}
	public void information() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int cla = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gen = sc.next().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		char gender =(gen=='M')?'남':'여';
		System.out.println(grade+"학년 "+cla+"반 "+ num+"번 "+ gender+"학생 "+name+"는 "+"성적이 "+ score+"점이다.");
	}
}
