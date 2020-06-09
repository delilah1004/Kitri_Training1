package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 생성자 접근법
 * 
 * 변수명 : 명령어 불가능, 숫자로 시작 불가능, 32자 넘어가면 안됨, 특수문자는 _ (언더바)만 허용
 */

class BB {
	private int x;
	private int y;
	private int z;
	
	public BB(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void disp() {
		System.out.println(x + "\t" +  y + "\t" + z);
	}
}

public class Exam21 {
	public static void main(String[] args) {
		

	}
}