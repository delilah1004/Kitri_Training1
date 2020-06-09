package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : Scanner
 */

import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열입력:");
		String a = sc.next();

		System.out.println("정수입력:");
		int x = sc.nextInt();
		
		System.out.println("실수입력:");
		float y = sc.nextFloat();
		
		System.out.println("문자입력:");
		String str = sc.next();
		char ch = str.charAt(0);
		
		System.out.println("a:" + a);
		System.out.println("x:" + ++x);
		System.out.println("y:" + ++y);
		System.out.println("ch:" + ch);
		
		sc.close();
	}
}