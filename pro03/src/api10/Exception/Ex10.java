package api10.Exception;

import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 발생 - 예외 처리
 */

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("수를 입력 (숫자 5는 입력불가) : ");
			int su = sc.nextInt();

			if (su == 5) {
				NumberFormatException ex = new NumberFormatException();
				throw ex; // 예외를 발생시킨다.
			}

			System.out.println(su);
			
		} catch (NumberFormatException e) {
			
			System.out.println("5는 입력할 수 없습니다.");
			
		} finally {
			
			sc.close();
			
		}
	}
}