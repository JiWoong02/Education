package test.synch;

public class Account {
	private static int balance; // 통장 잔액

	public Account() {
	}

	// 예금 인출하는 메소드 : 통장 잔액 차감 처리
	// 동기화 처리 방법 1 : 여러 스래드가 같이 사용하는 메소드에 동기화 처리하는 방법
	// 동기화 : 하나의 스래드가 공유 자원을 점유하고 있는 동안에는 다른 스래드는 대기상태가 됨 (접근못하게 함)

	public /* synchronized */ void withDraw(int money) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 임계영역 : 여러 스래드가 같이 이용하는 코드 부분
		// 동기화 처리 방법 2 : 임계영역에 sychronized 블럭으로 처리하는 방법

		synchronized (this) {
			if (balance >= money) {
				this.balance -= money;
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		}
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

}