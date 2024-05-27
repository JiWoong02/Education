package cast.sample;


//형변환 연습용
public class CastingSample {

	public void autoCasting() {
		//자동형 변환 확인용
		
		int num = 125;
		double dnum = 3.5;
		
		//원칙 1. 같은 종류끼리만 계산할 수 있음
		System.out.println("계산 결과: " + (num + dnum)); //128.5
		//계산 결과가 double 이면, double +double 이라는 뜻임
		//즉, int 가 double 로 자동형변환되었음
		
		//원칙 2. 같은 종류끼리만 대입할 수 있음.
		double pay = 345000; // int => double 로 자동형변환됨
		//345000.0
		System.out.println("pay : " + pay);
	}
	
	public void testCasting() {
		//강제형변환(명시적 형변환) 테스트
		int a = Integer.MAX_VALUE; //2147483647
		int b = Integer.MAX_VALUE; //2147483647
		
		//원칙 3. 계산의 결과값도 같은 타입이어야 함
		int result = a + b ;
		System.out.println("result :" + result); // 결과값이 int 범위를 벗어난 값임
		
		long result2 = a+ b; //int + int =>결과가 int 이거를 그냥 롱에 넣음 => long 그렇기 때문에 -2가 그대로 출력
		
		System.out.println("result2 :" + result2);
		
		long result3 = (long)a + b; //long+ int => long + long 자동형변환 => 결과형 long
		
		System.out.println("result3 :" + result3);
		
		int inum = (int)123.5;
		//크기가 큰 자료형 값이 작은 크키의 자료형 변수에 대입될 때, 형변환 명시가 필요함
		System.out.println("inum : " + inum);
	
	}
	
	
}
