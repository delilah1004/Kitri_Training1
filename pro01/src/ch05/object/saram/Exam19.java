package ch05.object.saram;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 실행 클래스 - 개인정보
 * 
 * 클래스 3대 특징 : 은닉화, 함수중복, 상속성
 * 은닉화(public, private)
 */

public class Exam19 {
	public static void main(String[] args) {
		
		Saram hong = new Saram();
		hong.input("홍길동", "구로구", "010-123-1234", "123456-1234567");
		hong.output();
		
		Saram cho = new Saram();
		// cho.name = "조인성";		-- ERROR
		cho.address = "이태원";
		cho.phoneNumber = "010-222-444-555";
		cho.juminBunho = "123456-1234567";
		
		//	System.out.println(cho.name);		-- ERROR
		System.out.println(cho.address);
		

	}
}