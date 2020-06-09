package api08.Collection.List.ArrayList;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : ArrayList02를 위한 Data 객체
 */

public class Data {
	private int x;
	private int y;
	private int z;
	
	public Data() { }

	public Data(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void yunsan() {
		z = x + y;
	}
	
	public void disp() {
		System.out.println(x + " " +  y + " " + z);
	}

	@Override
	public String toString() {
		return "{" + x + " " +  y + " " + z + "}";
	}
}
