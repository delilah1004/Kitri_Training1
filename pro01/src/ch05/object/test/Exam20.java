package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 
 * 
 * 하나의 클래스의 두 개의 클래스를 선언할 때, public 함수를 두 개 이상 만들어주면 모호성 오류가 생긴다.
 * 실무에서는 무조건 하나의 클래스 파일에 하나의 클래스만 선언해야 한다.
 * 
 * this : 
 */

class AA{				// this = 객체(a)
	private int x;		// 멤버 변수
	private int y;		// 멤버 변수
	
	public void input(int x, int y) {	// 지역 변수
		x = x;
		y = y;
		
		System.out.println(x);			// 지역 변수
		System.out.println(this.x);	// 멤버 변수
		
		System.out.println(y);			// 지역 변수
		System.out.println(this.y);	// 멤버 변수
	}
	
	public void sub() {
		System.out.println(this.x);			// this 생략 가능
	}
}


public class Exam20 {
	public static void main(String[] args) {
		AA a = new AA();	// 객체(a)
		a.input(10,  20);		

	}
}