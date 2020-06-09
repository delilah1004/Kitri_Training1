package ch06.aa;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 접근제한자 점연산
 */

public class BB {
	public static void main(String[] args) {
		AA a = new AA();
		
		// System.out.println(a.x); // private 변수, 점연산자로 접근 불가 - ERROR
		System.out.println(a.z); // public 변수, 점연산자로 접근 가능
		System.out.println(a.y); // protected 변수, 동일한 패키지 내에서 점연산자로 접근 가능
		System.out.println(a.su); // default 변수, 동일한 패키지 내에서 점연산자로 접근 가능
	}
}
