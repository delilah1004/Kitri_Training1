package thread10.Notify;

public class Consumer extends Thread {
	private AutoMachine machine;
	private String name;

	public Consumer(AutoMachine machine, String name) {
		this.machine = machine;
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			
			try {
				sleep(5000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " 소비자가 " + machine.getDrink() + "를 뽑아먹었습니다.");
		
		}
	}

}
