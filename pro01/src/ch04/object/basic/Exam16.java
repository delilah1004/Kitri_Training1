package ch04.object.basic;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 실행 클래스 - 사람과 수
 * 
 * 구현 클래스
 * 실행 클래스 : main 함수를 가지고 있는 클래스
 * - ex) Android에서는 MainActivity, Web에서는 DoGet, DoPost
 * 
 * 추상 클래스 - 상속 : 자신의 객체 발생이 안됨
 * 인터페이스 - 상속 : 자신의 객체 발생이 안됨
 */

public class Exam16 {
	public static void main(String[] args) {
		
		System.out.println("Su Class");
		System.out.println();
		
		Su a = new Su();
		a.x = 10;
		a.y = 20;
		System.out.println(a.x + "\t" + a.y);
		
		Su b = new Su();
		b.x = 77;
		b.y = 88;
		System.out.println(b.x + "\t" + b.y);
		
		System.out.println("\n");
		
		System.out.println("Person Class");
		System.out.println();
		
		Person x = new Person();		// 객체발생
//		x.name = "홍길동";
//		x.age = 25;
//		x.ki = 157.5f;
		x.input("홍길동", 25, 157.5f);
		
//		System.out.println(x.name);
//		System.out.println(x.age);
//		System.out.println(x.ki);
		x.disp();
		
		System.out.println();
		
		Person y = new Person();
//		y.name = "펭수";
//		y.age = 10;
//		y.ki = 210f;
		y.input("펭수", 10, 210f);
		
//		System.out.println(y.name);
//		System.out.println(y.age);
//		System.out.println(y.ki);
		y.disp();
		
	}
}