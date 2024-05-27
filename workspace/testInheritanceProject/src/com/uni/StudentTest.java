package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student[] sArray = new Student[] {
				new Student("홍길동", 15, 171, 81, "201101", "영문"),
				new Student("한사람", 13, 183, 72, "201102", "건축"),
				new Student("임걱정", 16, 175, 65, "201103", "무영")
		};
		for(int i=0; i<sArray.length;i++) {
			System.out.println(sArray[i].printInformation());
		}
		for(Student s: sArray) {
			System.out.println(s.printInformation());
		}
	}

}
