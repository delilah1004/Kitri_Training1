package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 생성자
 */

class HH {
	private int x;
	private int y;
	private static int count;
	
	public void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setCount() {
		System.out.println(++count);
	}
	
	public void disp() {
		System.out.println(x + "\t" + y);
	}
}

public class Exam28 {
	public static void main(String[] args) {
		HH a = new HH();
		a.setData(10, 20);
		a.setCount();
		a.disp();
		
		HH b = new HH();
		b.setData(30, 40);
		b.setCount();
		b.disp();
		
		HH c = new HH();
		c.setData(50, 60);
		c.setCount();
		c.disp();

	}
}