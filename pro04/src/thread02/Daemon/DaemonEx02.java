package thread02.Daemon;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Daemon
 * 
 * DaemonEx02 클래스 실행시 10초간 AutoSave 실행
 */

public class DaemonEx02 {
	public static void main(String[] args) {
		
		AutoSave autoSave = new AutoSave();
		autoSave.setDaemon(true);		// setDaemon : 주 쓰레드 종료시 부 쓰레드 종료
		autoSave.start();

		try {
			
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
}