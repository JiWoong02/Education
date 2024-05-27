package test.thread1;

import javax.swing.JFrame;

//public class MyThread2 extends Thread {
public class MyThread2 extends JFrame implements Runnable{
	@Override
	public void run() {
		for(int k = 1; k <=500; k++) {
			System.out.println(k);
			//스래드의 동작시간을 제어하려면
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //밀리초, 단위임, 1000 == 1초임
		}
	}
}
