package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 상속성
 * 
 * 클래스 3대 특징 : 은닉화, 중복성, 상속성
 * 자바에서 만들어진 모든 클래스는 Object 클래스를 상속받는다.
 */

public class AExam {

	public static void main(String[] args) {
		AParents ap = new AParents();
		ap.sub();
		
		ASon as = new ASon();
		as.setData(10, 20, 30, 40);
		as.disp();
	}
}