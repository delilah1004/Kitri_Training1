package thread04.Stop;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description :
 * 
 *              스레드가 실행 대기 또는 실행 상태에 있을 때 interrupt() 메소드가 실행되면 스레드가 미래에 일시정지
 *              상태가 되어 InterruptedException이 발생한다.
 * 
 *              interrupt() 메소드가 호출되었다면 스레드는 interrupted() 메소드는 true를 리턴한다.
 */

class SubThread extends Thread {

	@Override
	public void run() {

		int count = 0;

		while (count < 10) {
			++count;

			System.out.println("실행중......" + count);

			try {

				if (interrupted())
					break;
				
				sleep(300);

			} catch (Exception e) {

				// e.printStackTrace();

				System.out.println("자원종료......");
				System.out.println("실행종료......");
				System.exit(1);

			}
		}

	}
}

public class InterruptEx {
	public static void main(String[] args) {

		SubThread sub = new SubThread();
		// sub.run(); // SubThread의 run() 메소드를 실행하고 종료한 후에 메인 함수의 for문이 실행된다.
		sub.start(); // SubThread의 run() 메소드와 메인 함수의 for문이 번갈아 가면서 동시에 실행된다.

		for (int i = 0; i <= 2; i++) {
			System.out.println("main - " + i);

			if (i == 1)
				sub.interrupt();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}