package ch04.object.sungjuk;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 실행 클래스 - 성적
 */

public class Exam18 {
	public static void main(String[] args) {
		
		Sungjuk hong = new Sungjuk();
		hong.input("홍길동", 70, 80, 70);
		hong.total();
		hong.average();
		hong.grade();
		hong.disp();
		
		Sungjuk peng = new Sungjuk();
		peng.input("펭수", 100, 99, 100);
		peng.total();
		peng.average();
		peng.grade();
		peng.disp();
		
		
		
		
		
		
	}
}