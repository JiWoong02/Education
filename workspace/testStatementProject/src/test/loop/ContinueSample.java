package test.loop;

public class ContinueSample {
		//continue 문 : 반복문 안에서만 사용할 수 있음
		//if(조건식) continue;
		//반복할 내용을 중간 생략시킬 때 주로 사용함
	
		public void testContinue() {
			//1부터 100까지의 정수들의 합계를 출력
			//단, 5의 배수는 제외함
			int sum=0;
			for(int k = 1; k<101; k++) {
				if(k%5==0) {
					continue;
				}
				sum += k;
				if(k!=99)
				{System.out.print(k + " + ");}
				else { System.out.print(k);}
			}
			System.out.println(" = " + sum);
		}
		public void testContinueChangeWhile() {
			
			int sum=0;
			//for 문을 while 문으로 변경한다면
			//for(int k = 1; k<101; k++) {
			int k =1;
			while(k<101) {
				if(k%5==0) {
					k++;
					continue;
				}
				sum += k;
				if(k<99)
				{System.out.print(k + " + ");}
				else { System.out.print(k);}
				
				k++;
			}
			System.out.println(" = " + sum);
		}
		
public void testContinueChangeDoWhile() {
			
			int sum=0;
			int k =1;
			do {
				if(k%5==0) {
					k++;
					continue;
				}
				sum += k;
				if(k<99)
				{System.out.print(k + " + ");}
				else { System.out.print(k);}			
				k++;
			}while(k<101);
			System.out.println(" = " + sum);
		}
}
