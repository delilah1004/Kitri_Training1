package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - NumberFormatException
 */

public class Ex02 {
	public static void main(String[] args) {
		String su = "100";
		String value = "200";

		try {
			int isu = Integer.parseInt(su);
			int ivalue = Integer.parseInt(value);

			int result = isu + ivalue;
			System.out.println("result : " + result);
		} catch (NumberFormatException e) {			// su나 value에 숫자가 아닌 문자가 들어갔을 때 예외 처리
			System.out.println("숫자를 정확히 입력하세요.");
		}
	}
}