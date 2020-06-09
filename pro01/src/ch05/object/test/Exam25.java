package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 생성자 this()
 */

class EE {
	private int x, y, z;
	private int a;
	
	public EE() {						// EE e = new EE();
		x = 100;
		y = 200;
		z = 300;
		a = 400;
		// e.x = 10, e.y = 200, e.z = 300, e.a = 400
	}
	
	public EE(int x) {				// EE f = new EE(10);
//		this.x = x;
//		y = 77;
//		z = 88;
//		a = 99;
		// f.x = 10, f.y = 77, f.z = 88, f.a = 99
		
		this();								// 생성자를 찾아간다.
		// f.x = 100, f.y = 200, f.z = 300, f.a = 400
		this.x = x;
		// f.x = 10, f.y = 200, f.z = 300, f.a = 400
	}
	
	public EE(int x, int y) {		// EE g = new EE(77, 88);
//		this.x = x;
//		this.y = y;
//		z =300;
//		a = 400;
		// g.x = 77, g.y = 88, g.z = 300, g.a = 400
		
//		this();
		// EE() 호출
//		this.x = x;
//		this.y = y;
		// g.x = 77, g.y = 88
		
		// 생성자 호출 코드를 먼저 작성해야 한다.
		this(x);
		this.y = y;
		// g.x = 77, g.y = 88, g.z = 300, g.a = 400
	}
	
	public void disp() {
		System.out.println(x + "\t" + y + "\t" + z + "\t" + a);
	}
}

public class Exam25 {
	public static void main(String[] args) {
		EE e = new EE();
		EE f = new EE(10);
		EE g = new EE(77, 88);
		
		e.disp();
		f.disp();
		g.disp();
	}
}