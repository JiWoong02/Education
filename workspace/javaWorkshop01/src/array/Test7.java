package array;

public class Test7 {

	public static void main(String[] args) {
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
		
		double sum = 0.0;
		
		for(int a:array) {
			if((a%2)!=0) {
				System.out.println(a);
				sum += a;
			}
		}
		System.out.println("합계 : " + sum);

	}

}
