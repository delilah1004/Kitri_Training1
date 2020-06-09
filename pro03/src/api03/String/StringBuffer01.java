package api03.String;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : StringBuffer
 * 
 * 속도가 빠르고, 추가/삭제/ 수정을 할 수 있다.
 */

public class StringBuffer01 {
	public static void main(String[] args) {
		
		String s1 = "새천년";
		String s2 = "대한민국";
		String s3 = s1;
		
		System.out.println("s1 hash code : " + s1.hashCode());
		System.out.println("s2 hash code : " + s2.hashCode());
		System.out.println("s3 hash code : " + s3.hashCode());
		
		s1 += s2;
		System.out.println(s1);
		System.out.println("s1 hash code : " + s1.hashCode());
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("우리나라");
		StringBuffer sb2 = new StringBuffer("대한민국");
		System.out.println("sb1 hash code : " + sb1.hashCode());
		System.out.println("sb2 hash code : " + sb2.hashCode());

		// append 문자열 뒤에 문자열 추가
		sb1.append(sb2);
		sb1.append("좋은나라");
		System.out.println(sb1);
		System.out.println("sb1 hash code : " + sb1.hashCode());
		
		StringBuffer str = new StringBuffer("apple");
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("문자열의 용량(byte) : " + str.capacity());		// 5 + 16
		
		
		
	}
}