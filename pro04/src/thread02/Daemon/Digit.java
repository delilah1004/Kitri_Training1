package thread02.Daemon;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : 
 */

public class Digit extends Thread {	
	public void run() {
		
		System.out.println(getName());		// 스레드 이름 출력

		for (int i = 1; i <= 50; i++) {
			System.out.print(i + "\t");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println();

	}
}