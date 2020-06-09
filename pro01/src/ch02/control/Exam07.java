package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 제어문 - 반복문(for, 다중 for)
 */

public class Exam07 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println("How are you?");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t");
		}

		for (int i = 10; i >= 0; i--) {
			// System.out.println("How are you?");
			System.out.println(i + "\t");
		}
		System.out.println();

		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "\t");
			}
		}
		System.out.println();

		
		int hap = 0;
		for (int i = 1; i <= 10; i++) {
			hap += i;
		}
		System.out.println(hap);
		System.out.println();
		
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println(i + "\t" + j);
			}
			System.out.println();
		}
		
	}
}