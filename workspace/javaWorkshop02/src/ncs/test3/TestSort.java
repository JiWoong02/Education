package ncs.test3;

public class TestSort {

	public static void main(String[] args) {
//		10개의 정수 값을 기록할 수 있는 기본 자료형 배열을 선언한다.
//		select sort 알고리즘을 사용하여 내림차순 정렬 처리한 결과를 출력한다.
//		Math 클래스의 random() 메소드를 이용하여 51~100 사이의 
//		임의의 정수값 10개를 발생시켜 기록한다.
//		출력 결과는 다음과 같다.
//		before : 54, 65, 85, 95, 76, 86, 52, 51, 63, 88
//		after : 95, 88, 86, 85, 76, 65, 63, 54, 52, 51
		int [] num  = new int [10];
		int temp = 0;
		for(int i =0;i<num.length;i++) {
			num[i]=(int)(Math.random()*50)+51;
		}
		System.out.print("before : ");
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+ "  ");
		}
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[i]<num[j]) {
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;				
				}
			}
		}
		System.out.println();
		System.out.print("after : ");
		for(int i =0;i<num.length;i++) {
			System.out.print(num[i]+ "  ");
		}
	}

}
