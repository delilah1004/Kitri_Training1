package thread02.Daemon;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Daemon
 */

public class DaemonEx01 {
	public static void main(String[] args) {
		
		Alphabet al = new Alphabet();
		al.setName("알파벳 쓰레드");
		al.setDaemon(true);		// 주 쓰레드가 종료되면 자식 스레드도 모두 종료시켜주는 역할
		al.start();

		Digit digit = new Digit();
		digit.setName("디지털 쓰레드");
		digit.setDaemon(true);
		digit.start();
		
		System.out.print("Main Start\t");

		for (int i = 65; i <= 70; i++) {
			System.out.print(i + "\t");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
}