package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : Static
 * 
 * 접근제한 : private / public
 * 지정예약어 : static
 */

class YY {
	private int x;
	public int y;
	
	private static int a;
	public static int b;
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sub(int a, int b) {
//		this.a = a;
//		this.b = b;
		// 클래스변수는 this로 접근 불가
		
		YY.a = a;
		YY.b = b;
	}
}

public class Exam29 {
	public static void main(String[] args) {
		YY y = new YY();
//		y.y = 70;
//		y.b = 20;
		// 클래스 변수는 객체로 접근 불가
		
//		YY.a = 70;
		// private 변수 접근 불가
		YY.b = 20;
		// public 클래스 변수 클래스로 접근
		
	}
}