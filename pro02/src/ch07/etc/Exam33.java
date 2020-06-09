package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : final 메소드
 * 
 * 상속받은 부모 클래스의 final 메소드는 자식 클래스에서 재정의할 수 없다.
 * 오직 참조만 가능
 */

class Test {
	protected final double PI = 3.141592;
	protected static final int VALUE = 20;		// 상수
	
	public double getPI() {
		return PI;
	}
	
	public void setPI(double PI) {
		// Setter가 존재할 수 없음
		// this.PI = PI; // ERROR
	}
	
	public final void abc() { }
	
	public static final void xyz() { }
	
	public void sub() { }
	
	public static void func() { }
 }

class Son extends Test {
	// public final void abc() { } - ERROR : 함수 재정의 불가능
	// public static final void xyz() { } - ERROR : final 메소드 재정의 불가능
	
	public void sub() {
		System.out.println("함수 재정의 가능");
		
		this.abc();		// final 함수 참조
		Test.xyz();		// static final 함수 참조
	}
	
	public static void func() {
		System.out.println("함수 재정의 가능");
	}
}

public class Exam33 {
	public static void main(String[] args) {
		
	}
}