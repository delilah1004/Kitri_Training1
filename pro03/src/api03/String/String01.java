package api03.String;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 12.
 * @Description :
 */

public class String01 {
	public static void main(String[] args) {
		String a = "apple";
		String b = new String("banana");

		System.out.println(a + "\t" + b);

		String subject = "자바프로그래밍";
		char ch = subject.charAt(5);
		System.out.println("문자열추출:" + ch);

		int len = subject.length();
		System.out.println("문자열길이:" + len);

		int i = subject.indexOf("프로"); // 주어진 문자열이 포함되지 않으면 -1 반환
		System.out.println("문자열위치:" + i);
		
		
		System.out.println("--------------");

		String juminBunho = "123456-1234567";
		// 14자리
		// - 가 있는지
		// 남자여자

		int max = juminBunho.length();
		int j = juminBunho.indexOf("-");
		
		if (max == 14) {
			if (j == 6) {
				int sex = juminBunho.charAt(7) - '0';
				
				if (sex%2 == 0) {
					System.out.println("여자");
				} else {
					System.out.println("남자");
				} 
			} else {
				System.out.println("- 에러");
			}
		} else {
			System.out.println("길이 에러");
		}
	}
}