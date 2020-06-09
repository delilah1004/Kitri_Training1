package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : 메모리
 * 
 * new를 통해 변수를 생성하면 새로운 주소에 생성
 * 대입연산자를 통해 변수를 생성하면 주소 공유
 * 
 * 객체를 지역변수 또는 매개변수로 사용 : Dependency (의존관계)
 */

class BB {
	public int x;
	public void disp() {
		x = 50;
		System.out.println(x);
	}
}

class CC {
	private int su;
	public void fun(BB b) {		// b = 0x100
		b.x = 77;
		System.out.println(b.x);
		
		b.disp();
		
		method(b);
		
		b = null;
	}
	
	public void method(BB b) { }
	
	public void sub() {
		// b.x = 99; - ERROR
		
		BB b = new BB();				// b != 0x100		: 위의 b와 다름
		b.disp();
	}
}


public class Exam35 {
	public static void main(String[] args) {
		BB b = new BB();
		CC c= new CC();
		c.fun(b);
		c.sub();
		
		b=null;
		c=null;
	}
}
