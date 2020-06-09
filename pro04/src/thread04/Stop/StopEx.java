package thread04.Stop;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : 스레드 종료 stop() / interrupt() - stop 플래그
 * 
 * stop() 은 이제 쓰지 않는다.
 * stop 플래그란 boolean 변수를 뜻한다.
 */

class PrintThread extends Thread {

	public boolean stop = false;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		System.out.println(stop);

		while (!stop) {
			System.out.println("실행중......" + !stop);

			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("자원종료......" + !stop);
			System.out.println("실행종료......" + !stop);
		}
	}
}

public class StopEx {
	public static void main(String[] args) {

		PrintThread print = new PrintThread();
		print.start(); // PrintThread 대기 상태

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			// if(i==3) print.stop(); // 갑자기 종료하게 되면서 사용중인 자원들이 불안전한 상태로 남겨진다.

			if(i==3) {
				print.setStop(true);
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}