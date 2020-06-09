package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : super
 * 
 * 상속받은 변수를 this로 내꺼처럼 참조할 수 있지만
 * 구분을 위해 super로 참조할 수도 있다.
 */

public class ASon extends AParents {
	public int su;
	public int value;
	
	public void setData(int x, int y, int su, int value) {
		super.x = x;
		super.y = y;
		
		this.su = su;
		this.value = value;
	}
	
	public void disp() {
		System.out.println(x + "\t" + this.x);
		System.out.println(super.x);
		
		System.out.println(y + "\t" + this.y);
		System.out.println(super.y);
		
		sub();
		this.sub();
		super.sub();
		
		System.out.println(su + "\t" + this.su);
		System.out.println(value + "\t" + this.value);
	}
}