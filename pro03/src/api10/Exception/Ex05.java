package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - NullPointerException
 */

public class Ex05 {
	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("값을 입력하세요");
		}

	}
}