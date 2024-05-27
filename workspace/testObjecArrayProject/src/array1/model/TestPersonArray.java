package array1.model;

import java.util.Scanner;

public class TestPersonArray {

	public static void main(String[] args) {
		// 객체배열실습
		// 1. Person 클래스에 대한 객체 배열 5개 선언함
		Person[] objArray = new Person[5];
		Scanner sc = new Scanner(System.in);
		
		// 2.키보드로 5사람의 정보를 입력받아, 각 객체에 기록함
		for(int i=0; i<objArray.length;i++) {
			objArray[i]= new Person(); //객체 생성을 해야함
			
			System.out.println(i+1 +"번째 사람의 정보를 입력하세요");
			System.out.print("이름 : ");
			objArray[i].setName(sc.next());
			System.out.print("성별[남|여] : ");
			objArray[i].setGender(sc.next().charAt(0));
			System.out.print("나이 : ");
			objArray[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			objArray[i].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			objArray[i].setWeight(sc.nextDouble());
		}
		//출력확인
		int agetot =0;
		double heighttot=0.0;
		double weighttot=0.0;
		for(int i =0; i< objArray.length;i++) {
			System.out.println(objArray[i].information());
			agetot +=objArray[i].getAge();
			heighttot +=objArray[i].getHeight();
			weighttot +=objArray[i].getWeight();
		}
//		4. 5명의 나이, 키, 몸무게, 재산의 평균을 구하여 각각 출력함
		//나이 , 키, 몸무게, 재산 평균
		System.out.println("나이 평균 : " + agetot/objArray.length);
		
		//소수점 둘째자리 까지 출력 Case 1 : printf 포맷 이용
		System.out.print("키의 평균(소수점 둘째자리 까지) : ");
		System.out.printf("%.2f",heighttot/objArray.length);
		System.out.println();
		System.out.print("몸무게의 평균(소수점 둘째자리 까지) : ");
		System.out.printf("%.2f",weighttot/objArray.length);
		System.out.println();
		//Case 2 : 곱하고 정수로바꾸고 다시 나누기
		double avgHeight = (int)(heighttot/objArray.length*10)/10;
		double avgWeight = (int)(weighttot/objArray.length*10)/10;
		
		System.out.println("키의 평균(소수점 둘째자리 까지) : " + ((int)(heighttot/objArray.length*10))/10);
		System.out.println("몸무게의 평균(소수점 둘째자리 까지) : " + ((int)(weighttot/objArray.length*10))/10);
	}//main

}//class
