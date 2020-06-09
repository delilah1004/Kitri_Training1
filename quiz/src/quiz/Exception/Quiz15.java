package quiz.Exception;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("수를 입력하세요 : ");

			int su = sc.nextInt();
			String str = Integer.toString(su);

			if (str.length() != 10) {
				IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
				throw ex;
			}
			
			System.out.println("입력하신 수는 " + su + "입니다.");

		} catch (IndexOutOfBoundsException e) {
			System.out.print("에러발생!! 정확히 10자리만 입력 가능합니다.");
		} finally {
			sc.close();
		}

	}
}