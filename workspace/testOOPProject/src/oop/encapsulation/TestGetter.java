package oop.encapsulation;

public class TestGetter {

	public static void main(String[] args) {
		// getter 메소드 사용 테스트
		Student s1 = new Student(10, "김하나", 21, "010-1234-5678", '남', "응용통계", "kimone@naver.com", "서울시 서초구 신논현동 77",
				99.21);
		Student s2 = new Student(15, "김두리", 22, "010-2345-6789", '남', "경찰행정", "kimtwo@naver.com", "서울시 마포구 오동 12",
				80.65);
		Student s3 = new Student(20, "김세시", 23, "010-3456-7890", '여', "철학", "kimthree@naver.com", "서울시 광진구 나나동 44",
				66.73);
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		//수강생 3명의 시험성적의 합계를 구하고 평균을 계산 출력
		double total = s1.getScore() + s2.getScore() + s3.getScore() ;
		int ageAvg =(s1.getAge() + s2.getAge() +s3.getAge())/3;
		System.out.println("점수 총점 : " + total);
		System.out.println("평균 점수 : " + total/3);
		System.out.println("평균 나이 : " + ageAvg);
		System.out.println();

	}

}
