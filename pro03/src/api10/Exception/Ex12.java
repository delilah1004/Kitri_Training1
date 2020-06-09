package api10.Exception;

import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 메시지
 */

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수를 입력하세요 : ");
			int x = sc.nextInt();

			System.out.print("정수를 입력하세요 : ");
			int y = sc.nextInt();
			
			int div = x / y;

			System.out.print("나눗셈 : " + div);

		} catch (Exception e) {

			System.out.print("에러 발생");			// 사용자에게 알림 (View에 표시됨)
			System.out.println(e.getMessage());		// 개발자에게 알림 (View에 표시되지 않음), 메시지가 간단하게 출력
			e.printStackTrace();
		}
		
		sc.close();
	}
}