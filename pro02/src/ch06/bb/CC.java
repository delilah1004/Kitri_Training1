package ch06.bb;

import ch06.aa.AA;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 접근제한자 점연산 - 패키지가 다른 경우 - 상속
 * 
 * 패키지가 다른 클래스를 상속받을 때, 패키지와 클래스를 import 해줘야한다.
 */

public class CC extends AA {
	public void disp() {
		// System.out.println(super.x); // private 변수, 점연산자로 접근 불가 - ERROR
		System.out.println(super.y); // protected 변수, 패키지가 다르면 상속받아야 접근 가능
		System.out.println(super.z); // public 변수, 점연산자로 접근 가능
		// System.out.println(super.su); // default 변수, 패키지가 달라지면 상속받아도 접근 불가
	}
}
