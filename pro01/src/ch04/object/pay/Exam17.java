package ch04.object.pay;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 실행 클래스 - 연봉
 */

public class Exam17 {
	public static void main(String[] args) {
		
		Pay hong = new Pay();
		hong.input("홍길동", 2000000);
		hong.cal();
		hong.output();
		
		Pay cho = new Pay();
		cho.input("조인성", 2500000);
		cho.cal();
		cho.output();
		
		
		
		
		
		
	}
}