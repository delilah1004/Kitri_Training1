package ch05.object.test;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : Static
 */

class ZZ {
	private String name;
	private int don;
	private static float iyul;
	
	public ZZ() {	}
	
	public ZZ(String name, int don, float iyul) {
		this.name = name;
		this.don = don;
		ZZ.iyul = iyul;
	}
	
	public void disp() {
		System.out.println(name + "\t" + don +"\t" + iyul);
	}
	
	public static void output() {
		// static 함수는 static 변수만 사용 가능
		// System.out.println(name);		// ERROR
		// System.out.println(don);			// ERROR
		System.out.println(iyul);
	}
}

public class Exam30 {
	public static void main(String[] args) {
		ZZ z = new ZZ("홍길동", 100000, 0.7f);
		z.disp();
		
		ZZ.output();
		
		double pi = Math.PI;
		
		PrintStream out = System.out;
		out.println(10);
		// System.out.println();
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);
		// Scanner sc = new Scanner(System.in);
		// Scanner(InputStream source)
		
		int su = Math.abs(-20);
		System.out.println(su);
		
	}
}