package quiz.inheritance;

class Parents {
	protected int x, y;
	
	public Parents(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Son extends Parents {
	
	private int z;

	public Son(int x, int y) {
		super(x, y);
	}
	
	public void disp() {
		System.out.println(x + "," + y + "," + z);
	}
}

public class Quiz22 {

}
