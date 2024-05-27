package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Student;

public class TestStudent2 {
	public static void main(String[] args) {
		// 객체배열 테스트
		Student[] sar = new Student[3];

		sar[0] = new Student("김철수", 28, '남', "kimchul96@naver.com", "010-9876-3632", 12, "유아교육학과", 4.5);
		sar[1] = new Student("김상수", 14, '여', "gamcjjl16@naver.com", "010-9216-1433", 31, "법학과", 3.6);
		sar[2] = new Student("김동수", 26, '남', "kamcqrl56@naver.com", "010-9516-5432", 9, "한의학과", 4.3);

		// 학점 평균을 구한다면
		double totalScore = 0.0;
		for (Student s : sar) {
			System.out.println(s.getScore() + " + ");
			totalScore += s.getScore();
		}
		System.out.println();
		System.out.println("학점 평균 : " + (int) ((totalScore / sar.length) * 10) / 10.0);
		System.out.printf("학점 평균 : %.1f\n", (totalScore / sar.length));

	}
}
