package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : 메모리 공간 new
 */

class AA {
	private int x, y;
	
	public void fun() {
		x = 10;
		y = 20;
		System.out.println(x + "\t" + y);
	}
}

public class Exam34 {
	public static void main(String[] args) {
		AA a = new AA();
		a.fun();
		
		AA b = a;
		b.fun();
		
		AA c = a;
		c.fun();
		
		AA d = b;
		d.fun();
		
		System.out.println("----------------");
		
		a = null;
		
		// b는 a를 참조하는 것이 아니라 a가 참조하는 new AA() ... 의 주소를 참조하는 것이다.
		// 따라서 a가 null이 되어도 b가 참조하는 주소값은 영향을 받지 않기 때문에 b는 null이 되지 않는다.
		b.fun();
		b = null;
		
		c.fun();
		c = null;
		d = null;
		
		// new AA() ... 의 주소를 참조하는 변수가 모두 null이 되었기 때문에
		// heap 영역의 new AA() ... 의 주소가 가비지컬렉션에 의해 없어진다.
		
		// d.fun(); - NullPointerException ERROR
		
		System.out.println("----------------");
		
		AA x = new AA();
		x.fun();
		
		AA y = x;
		y.fun();
	}
}