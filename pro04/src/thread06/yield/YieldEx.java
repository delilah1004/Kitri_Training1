package thread06.yield;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : yield() - work 플래그
 */

public class YieldEx {
	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();				// A, B 실행
		Thread.sleep(1000);
		
		a.work = false;		// A 일시정지
		
		a.work = true;		// A 재실행
		b.work =false;		// B 일시정지
		
		a.stop = true;		
		b.stop = true;
		
	}
}