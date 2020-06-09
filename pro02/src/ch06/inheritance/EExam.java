package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 
 */

public class EExam {
	public static void main(String[] args) {
		EColorPoint a = new EColorPoint();
		EColorPoint b = new EColorPoint(10, 20, "RED");
		
		a.showColorPoint();
		b.showColorPoint();
	}
}