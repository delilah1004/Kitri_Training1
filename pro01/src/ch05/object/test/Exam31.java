package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : final
 */

class II {
	private int x;
	private static int value;
	private final double PI = 3.141592;
	private static final double RPI = 3.141592;
	
	public void sub() {
		int y = 20;
		// static int su = 100;			// ERROR
		
		System.out.println(x + "\t" + this.x + "\t" + y);
		System.out.println(value + "\t" + II.value);
		
		final int R = 25;		// 값이 바뀌지 않음
		y = 77;
		value = 88;
		
		System.out.println(R + "\t" + PI);
	}
	
	public static void fun() {
		int su = 100;
		
		System.out.println(su);
		// System.out.println(x);	// ERROR - x가 static 변수가 아님
		System.out.println(value);
		// System.out.println(PI);	// ERROR - PI가 static 변수가 아님
		
		System.out.println(RPI);
	}
}

public class Exam31 {
	public static void main(String[] args) {
		II ii = new II();
		ii.sub();
		ii.fun();
		
	}
}