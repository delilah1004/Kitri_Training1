package thread10.Notify;

public class Manager extends Thread {
	
	private AutoMachine machine;
	
	public Manager(AutoMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void run() {
		
		for(int i =0;i<=10;i++) {
			
			machine.setDrink(i + "번 음료수");
			
			try {
				sleep(2000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}