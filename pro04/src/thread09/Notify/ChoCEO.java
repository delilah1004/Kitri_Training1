package thread09.Notify;

public class ChoCEO extends Thread {
	
	private WorkData workData;

	public ChoCEO(WorkData workData) {
		this.workData = workData;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			workData.sub();
		}

	}
}
