package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 클래스 배열
 */

class GG {
	private int x;
	private int y;
	
	public GG() {	}
	// 무조건 default 생성자 만들어놓을 것, 변수는 따로 초기화하지 않아도 자동으로 초기화된다.
	
	public GG(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam27 {
	public static void main(String[] args) {
		GG[] array = new GG[5];
		
		array[0] = new GG(10, 20);
		array[1] = new GG(30, 40);
		array[2] = new GG(50, 60);
		array[3] = new GG(70, 80);
		array[4] = new GG(99, 88);

		for(int i = 0; i < array.length; i++) {
			array[i].disp();
		}
	}
}