package thread03.Join;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description :
 */

public class JoinEx01 {
	public static void main(String[] args) {

		Sum sum = new Sum();
		// sum.run(); // 단일 쓰레드

		try {
			
			sum.start();
			sum.join(); // Sum 클래스 스레드가 종료할 때까지 joinEx 스레드를 일시 정지한다.

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}

		System.out.println("Main 합 : " + sum.getSum());

	}
}
