package ch01.dataType;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 27.
 * @Description : 	3) 산술 연산자 : *, /, %, +, -
 * 									5) 비교 연산자 : <, >, <=, >=, ==, !=
 * 									6) 논리 연산자 : &, ^, |, &&, ||
 * 									7) 삼항 연산자 : 조건식 ? 참 : 거짓
 * 									8) 대입 연산자 : =, *=, /=, %=, +=, -=, &=, ^=,...
 * 									10) 순차연산 : ,
 */

public class Exam04 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int sum = x+y;
		int cha = x-y;
		int mul = x*y;
		float div = (float) x/y;
		int rest = x%3;
		
		System.out.println("산술연산자");
		System.out.println("합:" + sum);
		System.out.println("차:" + cha);
		System.out.println("곱:" + mul);
		System.out.println("나누기:" + div);
		System.out.println("나머지:" + rest);
		
		int a = 10;
		int b = 20;
		
		boolean c=a>b;
		boolean d = a<b;
		boolean e = a>=b;
		boolean f = a<=b;
		boolean g = a==b;
		boolean h = a!=b;
		
		System.out.println("\n");
		
		System.out.println("관계연산자");
		System.out.println(c + "\t" + d + "\t" + e + "\t" + f + "\t" + g + "\t" + h);
		
		byte i = 10;
		byte j=2;
		// 0000 1010
		// 0000 0010
		// ------------
		
		// 0000 1000 ^ : 8
		// 0000 1010 | : 10
		// 0000 0010 & : 2
		
		System.out.println("\n");
		
		System.out.println("논리연산자");
		System.out.println("i & j:" + (i&j));		// AND
		System.out.println("i | j:" + (i|j));			// OR
		System.out.println("i ^ j:" + (i^j));		// XOR
		
		int su = 15;
		boolean r = su>10 && su<60;
		boolean rr = su==10 || su==15;
		System.out.println(r + "\t" + rr);		// XOR
		System.out.println("\n");

		System.out.println("삼항연산자");
		int q = 10;
		int w = 20;
		int value = q!=w ? q : w;
		System.out.println(value);
		System.out.println(q==30? "참":"거짓");
		System.out.println("\n");
		
		System.out.println("대입연산자");
		q += 10;
		System.out.println(q);
		q *= 200;
		System.out.println(q);
		System.out.println("\n");
		
		System.out.println("순차연산");
		int ii = 10, jj = 20, kk = 30;
		System.out.println(ii + "\t" + jj + "\t" + kk);
		
	}
}
