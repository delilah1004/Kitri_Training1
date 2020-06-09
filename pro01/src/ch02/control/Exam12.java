package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : Scanner Quiz - 구구단을 입력받아서 출력하기 (입력 여부 체크)
 */

import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = 0;
		
		do {
			System.out.println("구구단 출력\n숫자를 입력하세요 : ");
			int dan = sc.nextInt();
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			System.out.println();
			
			System.out.println("중지하려면 n을 입력, 계속하려면 아무키나 입력하세요.");
			System.out.println("입력 : ");
			String str = sc.next();
			ch = str.charAt(0);
			
		} while(ch != 'n');
		
		System.out.println("끝");
		
		sc.close();

	}
}