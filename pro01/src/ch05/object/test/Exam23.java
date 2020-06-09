package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 생성자 중복
 * 
 * 중복은 이름(생성자명 또는 함수명)은 같지만 파라미터 타입이나 개수가 달라야 한다.
 */

class CC {
	private int x;
	private int y;
	
	public CC(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public CC() {
		x = 0;
		y = 0;
	}
	
	public void input(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public void disp() {
		System.out.print(x + "\t" + y);
	}
}

public class Exam23 {
	public static void main(String[] args) {
		CC a = new CC(10, 20);
		a.disp();
		
		// CC 클래스에 생성자가 정의되어 있지 않으면 파라미터를 넣어주지 않아도 자동으로 default 생성자가 만들어진다.
		// 이미 파라미터를 받는 생성자가 CC 클래스에 정의되어 있기 때문에 파라미터를 넣어주어야 한다.
		// 파라미터를 받지 않는 생성자를 CC 클래스에 중복 생성자로 정의해주면 Error 해결
		
		CC b = new CC();		
		b.input(77, 88);
		b.disp();
		
		
		
	}
}