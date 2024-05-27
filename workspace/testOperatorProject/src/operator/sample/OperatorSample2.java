package operator.sample;


public class OperatorSample2 {
		public void 반올림테스트() {
			float fnum = 1.23456789f;
			
			System.out.println("fnum : " + fnum);
			//소수점 아래 둘째자리까지 표시한다면
			System.out.println("fnum : " + (int)(fnum*100)/100f);
			System.out.printf("fnum : %.2f\n" , fnum);
		}
		public void 복합대입연산자테스트() {
			//= 대입연산자와 산술, 쉬프트, 비트논리연산자와 함께 사용하는 경우 : = 은 오른쪽에 표기함
			//산술대입연산자 : +=, -=, *=, /=, %=
			//쉬프트대입연산자 : <<=, >>=, >>>=
			//비트논리대입연산자 : &=, ^=, |=
			int k = 10;
			System.out.println("k : " + k);//10
			
			k += 2; //k = k + 2; 보다 연산속도가 빠름		
			System.out.println("k : " + k); //12
			
			k -= 3; //k = k - 3; 
			System.out.println("k : " + k); //9
			
			k *= 4; //k = k * 4;
			System.out.println("k : "+ k); // 36
			
			k /= 4; //k = k/4;
			System.out.println("k : " + k);//9
			
			k %= 2; //k = k%2;
			System.out.println("k : " + k);//1
			
			k <<= 2; //k = k << 2; 왼쪽으로 2번 이동해라 즉, 2의 2제곱을 곱연산 해라
			System.out.println("k : " + k); //4
			
			k >>= 2; // k = k >> 2; 오른쪽으로 2번 이동해라 즉, 2의 2제곱을 나눠라
			System.out.println("k : " + k); //1
			
			//쉬프트 <<, >> 는 비트값 이동이지만 실질적으로 자바에서는 2제곱 연산을 할때만 사용		
		}
}
