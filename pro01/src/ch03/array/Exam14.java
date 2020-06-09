package ch03.array;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 배열 - 배열의 길이
 */

public class Exam14 {

	public static void main(String[] args) {
		int x = 10;
		int y = x;
		int z = y;
		System.out.println(x + "\t" + y + "\t" + z);

		int[] array = new int[] { 1, 2, 3, 4, 5 };
		int a = array[2];
		System.out.println(a);
		System.out.println();
		
		int[] b = array;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "\t");
		}
		
		array = null;
		b = null;
				
	}
}