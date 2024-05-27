package ncs.test6;

public class StringTest {

	public static void main(String[] args) {
		// 주어진 String 데이터를 “,”로 나누어 
		//5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 
		//단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		String[] st = str.split(",");
		for(String strInteger:st) {
			sum+=Double.parseDouble(strInteger);
		}
		System.out.printf("합계 : %.3f\n",sum);
		System.out.printf("평균 : %.3f",sum/5);

	}

}
