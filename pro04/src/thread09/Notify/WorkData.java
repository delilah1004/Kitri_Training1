package thread09.Notify;

public class WorkData {
	
	public synchronized void method() {		// 동기화 메소드 출력
		System.out.println(Thread.currentThread().getName() + " method() 작업실행");
	
		notify();
		
		try {
			wait();		// 일시정지
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void sub() {			// 동기화 메소드 입력
		System.out.println(Thread.currentThread().getName() + " sub() 작업실행");
		
		notify();
		
		try {
			wait();		// 일시정지
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}