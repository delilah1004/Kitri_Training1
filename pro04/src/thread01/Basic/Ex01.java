package thread01.Basic;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : 멀티 태스킹 / 멀티
 * 
 * Processor는 하나의 CPU를 의미한다. (두 개 이상은 Multiprocessor)
 * 
 * 두 개 이상의 Processor(CPU)를 동시에 실행하는 것을 멀티 프로세싱이라고 한다.
 * 
 * Process는 Processor에 의해 실행중인 프로그램을 의미한다. 
 * 
 * 하나의 Processor에서 여러 개의 Process(프로그램)를 교대로 실행하는 것을 멀티 프로그래밍이라고 한다.
 * 하나의 Processor에서 여러 개의 Process(프로그램)를 동시에 실행하는 것처럼 교대로 실행하는 것을 멀티 태스킹이라고 한다.
 * 
 * Thread는 Process 내에서 실행되는 하나의 작업(실행 주체)을 의미한다.
 * 
 * 하나의 Processor(프로그램)에서 두 개 이상의 Thread(작업)를 수행하는 것을 멀티 스레딩라고 한다.
 * 
 * CallBack 함수 : 개발자가 직접 호출하지 않아도 프로그램 로직에 의해 호출되는 함수
 */

public class Ex01 {
	public static void main(String[] args) {			// 부모 Thread (주 Thread)
		
		Digit01 digit = new Digit01();
		digit.start();				// start() 메소드가 run() 메소드를 호출해준다 : CallBack 함수 
		
		for(int i =0; i<=200;i++) {
			System.out.print("main function" + "\t");
		}
		
		Alphabet01 alphabet = new Alphabet01();
		alphabet.start();
		
	}
}