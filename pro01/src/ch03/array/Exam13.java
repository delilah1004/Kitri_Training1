package ch03.array;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 배열
 * 
 * 변수는 한 개의 데이터만 저장하지만, 배열은 같은 타입의 데이터를 연속된 공간에 저장하므로 속도면에서 좋다.
 * 각 데이터는 인덱스를 부여한다.
 */

import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		
		char[] ch = new char[] { 'A', 'B', 'C' };

		for (int i = 0; i < 3; i++) {
			System.out.print(ch[i] + "\t");
		}
		System.out.println("\n");

		System.out.println(ch.length);
		
		System.out.println();

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println("\n");

		int[] b = new int[5]; // 20byte
		System.out.print(b[1]);

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}

		sc.close();
		
	}
}