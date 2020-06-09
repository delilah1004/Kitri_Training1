package ch01.dataType;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 27.
 * @Description : 연산자 우선순위
 * 		1) 최우선 연산자 : ., [], ()
 * 		2) 단항 연산자 : !, ~, +/-, ++/--(전위형 증감 연산자), (cast) 또는 (자료형)
 * 		3) 산술 연산자 : *, /, %, +, -
 * 		4) 시프트 연산자 : <<, >>, >>>
 * 		5) 비교 연산자 : <, >, <=, >=, ==, !=
 * 		6) 논리 연산자 : &, ^, |, &&, ||
 * 		7) 삼항 연산자 : 조건식 ? 참 : 거짓
 * 		8) 대입 연산자 : =, *=, /=, %=, +=, -=, ...
 * 		9) 후위형 증감 연산자 : ++/--
 * 		10) 순차연산 : ,
 */

public class Exam02 {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = !a;		// 일반 부정
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		int c= ~10;					// 이진 부정
		int d= ~-15;					// 이진 부정
		
		int x = 100;
		int y = 200;
		
		// 출력시 부호를 바꿔도 원본 데이터에 영향을 주지 않는다.
		System.out.println(x + "\t" + y);
		System.out.println(-x + "\t" + y);
		System.out.println(x + "\t" + -y);
		
	}

}
