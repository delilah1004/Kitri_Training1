package api10.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 중복 예외 처리 - InputMismatchException,
 * 
 */

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수를 입력하세요 : ");
			int x = sc.nextInt();

			System.out.print("정수를 입력하세요 : ");
			int y = sc.nextInt();
			
			int div = x / y;

			System.out.print("나눗셈 : " + div);

		} catch (ArithmeticException e) {

			System.out.print("0으로 나눌 수 없습니다.");

		} catch (InputMismatchException e) {
			
			System.out.print("정수형만 입력할 수 있습니다.");
			
		}
		sc.close();
	}
}