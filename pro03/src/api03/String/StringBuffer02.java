package api03.String;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : 
 * 
 * insert / setCharAt / replace / deleteCharAt / delete / reverse
 */

public class StringBuffer02 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("** JAVA");
		System.out.println(str);
		
		// insert 문자열 사이에 문자열 추가
		str.insert(3, "Good");
		System.out.println(str);
		
		// setCharAt 문자열에서 특정 위치의 문자 변환
		str.setCharAt(1, '#');
		System.out.println(str);
		
		// replace 문자열에서 문자열의 범위를 잡아 변환
		str.replace(3, 7, "Love");
		System.out.println(str);
		
		// deleteCharAt 문자열에서 특정 위치의 문자 삭제
		str.deleteCharAt(1);
		System.out.println(str);
		
		// delete 문자열에서 문자열의 범위를 잡아 삭제
		str.delete(7, 11);
		System.out.println(str);
		
		// reverse 문자열의 순서 반전
		str.reverse();
		System.out.println(str);
	}
}