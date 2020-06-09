package quiz.Class1;

class ABS {
	public int value;
	public int result;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void resultAbs() {
		result = Math.abs(value);
	}
	
	public void disp() {
		System.out.println("result:" + result);
	}
}

public class Quiz13 {
	public static void main(String[] args) {
		ABS abs = new ABS();
		abs.setValue(-10);
		abs.resultAbs();
		abs.disp();
	}
}