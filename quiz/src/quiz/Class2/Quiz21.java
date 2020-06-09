package quiz.Class2;

class Test {
	private int x, y;
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Quiz21 {
	public static void main(String[] args) {
		Test[] array = new Test[3];
		
		array[0] = new Test(10, 20);
		array[1] = new Test(50, 60);
		array[2] = new Test(80, 90);
		
		for(int i = 0; i < array.length; i++) {
			array[i].disp();
		}
	}
}