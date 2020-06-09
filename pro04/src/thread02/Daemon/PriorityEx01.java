package thread02.Daemon;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description :
 * 
 *              동시성(Concurrency) : 하나의 코어에서 멀티 스레드가 번갈아가면서 실행하는 것 어떤 순서에 의해
 *              							동시성으로 실행할 것인가를 결정하는 것은 스케줄링이라고 한다.
 * 
 *              병렬성(Parallelism) : 멀티 코어에서 멀티 작업을 동시에 실행하는 것
 */

class Example extends Thread {
	
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
			
		}
	};
	
}

public class PriorityEx01 {
	public static void main(String[] args) throws InterruptedException {

		// 쿼드 코어일 경우 스레드가 병렬성으로 실행될 수 있기때문에 4개 이하의 스레드를 실행할 경우
		// 우선순위 영향을 크게 받지 못한다. 그러므로 4개 이상으로 테스트한다.
		
//		Example a = new Example();
//		Example b = new Example();
//		Example c = new Example();
//		Example d = new Example();
//		Example e = new Example();
//		Example f = new Example();
//		Example g = new Example();
//		Example h = new Example();
//		Example i = new Example();
//		Example j = new Example();
		
		

		for (int i = 0; i <= 10; i++) {
			Example example = new Example();
			example.setName("thread : " + i);

			if (i == 5) {
				example.setPriority(Thread.MAX_PRIORITY); // 10~1
			}

			if (i == 3) {
				example.setPriority(Thread.MIN_PRIORITY); // MIN_PRIORITY == 1
			}

			if (i == 10) {
				example.setPriority(5);
			}

			example.start();
			Thread.sleep(1000);

			System.out.println(example.getName());
		}

	}
}