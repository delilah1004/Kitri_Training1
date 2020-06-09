package thread05.State;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : getState()
 */

public class StateEx {
	public static void main(String[] args) {

		StateTarget target = new StateTarget();
		
		target.start();
		
		while (true) {
			Thread.State state = target.getState();
			System.out.println("타겟 스레드 상태 : " + state);

			/*
			if (state == Thread.State.NEW) {
			}
			
			if (state == Thread.State.RUNNABLE) {
			}

			if (state == Thread.State.TIMED_WAITING) {
			}
			*/

			if (state == Thread.State.TERMINATED) {
				break;
			}
			
			try {

				Thread.sleep(500);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}
		}

	}
}