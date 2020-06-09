package quiz.Class2;

class Test24 {
	public int x;
	public String str;
	
	public Test24(int x) {
		this.x = x;
	}
	public Test24(String str) {
		this.str = str;
	}
}

public class Quiz24 {
	public static void main(String[] args) {
		Test24 t = new Test24(10);
		Test24 e = new Test24('A');
	}
}