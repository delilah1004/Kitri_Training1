package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 제어문 - 반복문(while, do~while)
 */

public class Exam08 {
	public static void main(String[] args) {
		
		// 반복문은 초기, 증감, 조건값
		int i = 1; 						// 초기

		while (i <= 10) { 		// 조건값
			System.out.println("hahaha" + i);
			++i; 						// 증감
		}
		System.out.println();
		
		
		i =0;
		int hap = 0;
		
		while(i <= 10) {
			hap += i;
			++i;
		}
		
		System.out.println("hap:" + hap);
		System.out.println();
		
		
		int j = 1;
		do {
			System.out.println(j + "\t hahaha");
			++j;
		} while (i <= 10);
		System.out.println();
		
		
		hap = 0;
		i = 0;
		do {
			hap += i;
			++i;
		} while(i <=10);
		System.out.println("hap:" + hap);
		System.out.println();
		

	}
}
