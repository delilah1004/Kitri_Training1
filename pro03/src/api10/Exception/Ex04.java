package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - ArrayIndexOutOfBoundsException
 */

public class Ex04 {
	public static void main(String[] args) {
		try {
			String su = args[0];
			String value = args[1];

			System.out.println(su);
			System.out.println(value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열수가 제대로 입력되지 않았습니다.");
		}
	}
}