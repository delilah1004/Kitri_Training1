package quiz.Class1;

class Printer {
	
	public void println(int x) {
		System.out.println(x);
	}
	
	public void println(boolean x) {
		System.out.println(x);
	}
	
	public void println(double x) {
		System.out.println(x);
	}
	
	public void println(String x) {
		System.out.println(x);
	}
}

public class Quiz15 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}