package test.thread1;

import javax.swing.JFrame;

//클래스가 하나의 스래드가 되려면, java.lang Thread 상속받으면 됨
//public class MyThread1 extends Thread {
//다른 클래스가 먼저 상속이 되었다면, Thread 를 상속 못 받는 경우에는 Runnable 인터페이스를 상속받음
public class MyThread1 extends JFrame implements Runnable{
	//반드시 run() 메소드 오버라이딩해야 함
	@Override
	public void run() {
		//해당 스래드가 수행할 내용을 작성함
		for(int k=1;k<=500;k++) {
			System.out.println("★");
			//스래드의 동작시간을 제어하려면
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //밀리초, 단위임, 1000 == 1초임
		}
	}
}