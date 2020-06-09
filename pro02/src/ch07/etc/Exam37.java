package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : 
 */

class DD {
	public int x;
	
	public void disp() {
		System.out.println(x);
	}
}

class EE {
	public DD sub() {
		DD d = new DD();
		return d;
	}
	
	public DD fun(DD d) {
		return d;
	}
}

public class Exam37 {
	public static void main(String[] args) {
		EE e = new EE();
		
		DD d = e.sub();
		
		DD f = e.fun(d);
	}
}