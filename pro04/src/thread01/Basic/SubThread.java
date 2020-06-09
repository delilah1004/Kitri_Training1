package thread01.Basic;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Ex02 - 기능 구현 자식 스레드
 */

public class SubThread extends Thread {
	public static boolean inputCheck = false;

	@Override
	public void run() {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			
			if(SubThread.inputCheck) return;
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.print("제한 시간이 종료되었습니다.");
		System.exit(0);
	}
	
}