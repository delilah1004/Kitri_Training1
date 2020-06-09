package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 
 * 
 * super, this 는 함수내의 맨 윗줄에 위치해야 한다.
 */

public class DSon extends DParents {
	
	public DSon() {
		super(50);
		System.out.println("DSon 기본생성자");
	}
	
	public DSon(int x) {
		super(x);
	}
	
	public DSon(int x, int y) {
		super(x, y);
	}
	
	public void showPoint() {
		System.out.println(x + "\t" + y);
	}

}
