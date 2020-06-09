package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 상속
 * 
 * interface는 여러 개 상속받을 수 있지만
 * class는 하나만 상속받을 수 있다.
 */

interface AB{ }
interface BC{ }

class DF{ }

class Sub extends DF implements AB, BC {
	
}

public class MExam {
	public static void main(String[] args) {
		
		
		
	}
}