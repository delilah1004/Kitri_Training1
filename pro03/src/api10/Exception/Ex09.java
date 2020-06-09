package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - Throwable
 * 
 * 자식 클래스의 Exception을 묶어서 처리한다.
 */

public class Ex09 {
	public static void main(String[] args) {

		try {
			int su = Integer.parseInt(args[0]);
			int value = Integer.parseInt(args[1]);

			int div = su / value;
			System.out.println(div);

		} catch (Throwable e) {
			
			System.out.println("(숫자, 0, 배열수확인) 에러가 발생했습니다.");

		} finally {
			
			System.out.println("모든 예외처리를 끝냈습니다.");
			
		}
	}
}