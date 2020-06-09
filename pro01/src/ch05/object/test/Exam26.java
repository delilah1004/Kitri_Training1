package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 함수중복 - Overload / Overloading
 * 
 * 함수명은 같지만 파라미터 타입이나 개수가 달라야 한다.
 */

class FF {
	public void disp(int x) {
		System.out.println(x);
	}
	
	public void disp(int x, float y) {
		System.out.println(x + "\t" + y);
	}
	
	public void disp(String str) {
		System.out.println(str);
	}
	
	public int hap(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
	
	public float hap(float x, float y) {
		System.out.println(x + y);
		return x + y;
	}
}

public class Exam26 {
	public static void main(String[] args) {
		FF f = new FF();
		f.disp(10);
		f.disp("apple");
		f.disp(77, 88.8f);
		
		System.out.println(f.hap(5, 6));
		System.out.println(f.hap(66.7f, 99.8f));
	}
}