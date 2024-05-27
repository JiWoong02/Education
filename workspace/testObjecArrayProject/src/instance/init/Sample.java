package instance.init;

public class Sample {
		//Field (속성 : Property)
		//접근제한자 [예약어] 자료형 변수명 [=초기값];
//		private int num;   //인스턴스변수 new할때 생성, 가비지콜렉터 가동할 때 지워짐
//		private static int snum;    //클래스변수 : 프로그램 실행될 때 생성, 프로그램 종료 시 지워짐
		//초기값이 명시되지 않으면, 준비된 기본값이 초기값이 됨 => 첫번째로 작동됨
		
		//필드 선언시 초기값을 명시할 수 있음 : 명시적 초기화  =>두번째로 작동됨
		private int num = 100;
		private static int snum = 10;
		
		
		
		//초기화블럭을 이용한 초기화 =>세번째로 작동됨
		{
			//인스턴스변수 = 초기값;
			num = 200;
			
		}
		
		static {
			//클래스변수 = 초기값;
			snum=77;
		}
		
		public Sample() {}
		
		//생성자를 이용한 초기화
		public Sample(int num) {
			//네번째로 작동됨
			this.num =num;
		}
		
		public void printSample() {
			System.out.println("num : " + this.num + "\nsnum : " + Sample.snum);
		}
}//class
