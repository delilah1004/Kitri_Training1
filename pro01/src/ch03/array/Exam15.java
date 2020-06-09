package ch03.array;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 배열 - 메모리
 * 
 * Ds에서 heap의 데이터는 stack을 참조하고 있으면 소멸되지 않는다.
 * stack은 블럭단위로 데이터가 생성, 소멸된다.
 */

public class Exam15 {
	public static void main(String[] args) {

		int su = 10;

		{
			int value = 20;
			System.out.println(su);
			System.out.println(value);
		}
		
		System.out.println(su);
		// System.out.println(value);
		
		// int su = 20;
		int value = 30;
		
		// 배열 선언 방법
		char[] a = new char[] { 'A', 'B', 'C' };
		char b[] = new char[] { 'A', 'B', 'C' };
		char[] c = { 'A', 'B', 'C' };
		
		// char[] d = new char[]; -- Error new char[5]
		
		
		
	}
}