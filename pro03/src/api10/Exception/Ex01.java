package api10.Exception;

import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - ArithmeticException
 * 
 * Exception - 예외 처리, 예외 전가, 예외 발생
 * 
 * 상위 패키지 Exception으로 처리해줘도 된다.
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();
		
		try {
			int div = x/y;
			
			System.out.print("나눗셈 : " + div);
			
		} catch (ArithmeticException e) {			// ArithmeticException : '0으로 나누기'와 같은 산술 조건 Exception 처리
			
			System.out.print("0으로 나눌 수 없습니다.");
			
		}
		sc.close();
	}
}