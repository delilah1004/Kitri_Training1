package ch06.bb;

import ch06.aa.AA;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 접근제한자 점연산 - 패키지가 다른 경우
 */

public class DD {
	public static void main(String[] args) {
		AA a = new AA();
		
		// System.out.println(a.x); // private 변수, 점연산자로 접근 불가 - ERROR
		System.out.println(a.z); // public 변수, 점연산자로 접근 가능 (패키지가 달라도 접근 가능)
		// System.out.println(a.y); // protected 변수, 패키지가 다르면 상속받아야 접근 가능
		// System.out.println(a.su); // default 변수, 패키지가 달라지면 접근 불가
	}
}
