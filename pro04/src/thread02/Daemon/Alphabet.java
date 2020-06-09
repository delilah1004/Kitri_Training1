package thread02.Daemon;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description :
 */

public class Alphabet extends Thread{
	public void run() {

		for (char i = 'A'; i < 'Z'; i++) {
			System.out.print(i + "\t");

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println();
	}
}