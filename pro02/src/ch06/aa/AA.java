package ch06.aa;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 접근제한자
 */

public class AA {
	private int x = 10;		// 점연산자로 접근 불가능
	protected int y = 20;		//
	public int z = 30;			//
	int su = 40;			// 접근제한자 생략 - default (private, protected, public 모두 아님)
	// c++의 경우 접근제한자 생략시 private이 된다.
}