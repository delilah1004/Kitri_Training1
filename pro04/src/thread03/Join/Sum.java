package thread03.Join;

public class Sum extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;

			try {
				
				sleep(100);

			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
			
			
		}
		
		System.out.println("Sum Class 합 : " + getSum());
	}

}
