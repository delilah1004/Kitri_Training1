package thread07.Synchronized;

public class Calculator extends Thread {			// 공유 클래스
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {		// 임의영역 : 단 하나의 스레드만 실행한다.
		this.money = money;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + money);
	}	
}
