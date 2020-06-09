package ch06.inheritance;

public class FAccumulator {		// 계산, 누적
	private int initValue;
	public static int totalValue;
	
	protected FAccumulator() { }
	
	protected FAccumulator(int initValue) {
		this.initValue = initValue;
		totalValue += initValue;
	}
	
	protected void setAccumulator(int money) {
		if(money < 0) return;
		
		initValue += money;
		totalValue += money;
	}
	
	protected int getAccumulation() {
		return initValue;
	}
}
