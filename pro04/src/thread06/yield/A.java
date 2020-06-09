package thread06.yield;

public class A extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		
		while(!stop) {		// stop == true -> 종료
			
			if(work) {			// work == true -> 실행한다.
				try {
					sleep(500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("A 작업내용");
			} else {			// work == false -> 다른 스레드에게 실행을 양보한다.
				
				Thread.yield();
				
			}
			
		}
		
		System.out.println("A 종료");
	}
	
}