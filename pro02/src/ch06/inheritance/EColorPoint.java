package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 
 */

public class EColorPoint extends EPoint {
	private String color;
	
	public EColorPoint() { }
	
	public EColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
		showPoint();
		System.out.println(color);
	}
	
}
