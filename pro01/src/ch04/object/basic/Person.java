package ch04.object.basic;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 구현 클래스 - 사람
 */

public class Person {
	// instance variable, member variable, field
	public String name;
	public int age;
	public float ki;
	
	// instance function, member function
	public void disp() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(ki);
	}
	
	public void input(String a, int b, float c) {
		name = a;
		age = b;
		ki = c;
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
}