package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 전가
 */

class Sub {
	public void fun() throws Throwable {
		Throwable ex = new Throwable();
		throw ex;
	}
	
	public void method() throws Throwable {
		System.out.println("Sub Method 입니다.");
		
		fun();
	}
}

public class Ex11 {
	public static void main(String[] args) throws Throwable{
		Sub sub = new Sub();
		
		sub.method();
	}
}