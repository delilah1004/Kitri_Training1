package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : 
 */

class Singleton {
	private static Singleton singleton = new Singleton();
	
	public void data() {
		System.out.println("싱글톤 함수");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

public class Exam40 {
	public static void main(String[] args) {
		Singleton a = new Singleton();
		
		Singleton b = new Singleton();
		
		Singleton c = b;
		
		if(a==b) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		if(b==c) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		System.out.println("===================");
		
		Singleton x = Singleton.getInstance();
		x.data();
		
		Singleton y = Singleton.getInstance();
		y.data();
		
		if(x==y) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
	}
}