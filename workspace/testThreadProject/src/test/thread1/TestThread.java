package test.thread1;

public class TestThread {

	public static void main(String[] args) {
		// multi thread test
		// Thread 를 상속받은 경우
//		MyThread1 t1 = new MyThread1();
//		MyThread2 t2 = new MyThread2();
		
		//Runnable 을 상속받은 경우
//		Runnable r1 = new MyThread1();
//		Runnable r2 = new MyThread2();
//		Thread th1 = new Thread(r1);
//		Thread th2 = new Thread(r2);
		Thread th1 = new Thread(new MyThread1());
		Thread th2 = new Thread(new MyThread2());
		
		//스래드의 우선순위 확인 : 1부터 10까지 정수로 지정되어 있음											
//		System.out.println(th1.getPriority()); //5
//		System.out.println(th2.getPriority()); //5
		
		//우선 순위 변경 가능함
		//th1.setPriority(Thread.MIN_PRIORITY); // 값 지정시 상수필드 이용해도 됨
		//th2.setPriority(Thread.MAX_PRIORITY); // 정수 사용해도 됨

	
		th1.start();
		th2.start();
	}

}
