package api03.String;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : split("정규표현식")
 * 
 *  정규표현식을 구분자로 해서 부분 문자열을 분리한 후, 배열에 저장하고 리턴한다.
 */

public class String04 {
	public static void main(String[] args) {
		String str = "홍길동, 이수홍, 박연수, 김자바, 최명호";
		String[] strArr = str.split(",");

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		
		String[] strArrTrim = str.split(", ");
		
		for (int i = 0; i < strArrTrim.length; i++) {
			System.out.println(strArrTrim[i]);
		}

		System.out.println();

		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] textArr = text.split("&|,|-");

		for (int i = 0; i < textArr.length; i++) {
			System.out.println(textArr[i]);
		}
	}
}