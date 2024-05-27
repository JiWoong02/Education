package oop.method;

public class TestRecursive {

		//재귀적 호출 함수 (Recursive call) : 함수 안에서 함수 자신을 실행함
		//일종의 반복 실행임 => 반복문보다는 성능은 떨어짐
		public int fectorial(int num) {
				if(num>0) {
					System.out.print(num + " * ");
					return num * fectorial(num-1);
				}else {
					System.out.println("1");
					return 1;
				}
		}
//		public int fectorial(int num) {
//				int result = 1;
//				for(int k = num; k>0;k--) {
//					result *= k;
//				}
//				return result;
//		}
	
	public static void main(String[] args) {
		// 재귀적 호출 메소드 실행 테스트
		// 10! =10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 
		int result = new TestRecursive().fectorial(10);
			System.out.println("10! : " + result);
	}

}
