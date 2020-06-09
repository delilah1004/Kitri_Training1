package api03.String;

import java.util.Date;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 12.
 * @Description : String 메소드
 * 
 * 원본데이터에 영향을 주지 않는 메소드
 */

public class String02 {
	public static void main(String[] args) {
		
		System.out.println("[ 대소문자 구분 ]");
		
		String a = "apple";
		String b = "Apple";
		System.out.println("대소문자구분 : " + a.equals(b));
		System.out.println("대소문자구분안함 : " + a.equalsIgnoreCase(b));
		
		System.out.println("-------------------");
		
		String subject = "Java Programming";
		System.out.println("소문자:" + subject.toLowerCase());
		System.out.println("대문자:" + subject.toUpperCase());
		
		System.out.println("원본데이터 : " + subject);
		
		System.out.println("-------------------");
		
		String oldStr = "자바는 객체지향적 언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println("문자열 변환 : " + newStr);
		System.out.println("원본데이터 : " + oldStr);
		
		System.out.println("-------------------");
		
		String str = "How are you?";
		System.out.println("문자열 잘라내기 : " + str.substring(2));	// 2번지부터 끝까지
		System.out.println("문자열 잘라내기 : " + str.substring(2, 9));	// 2번지 ~ 8번지
		System.out.println("원본데이터 : " + str);
		
		System.out.println("-------------------");
		
		String t = "          자바          프로그램         ";
		System.out.println("앞뒤 공백문자 제거 : " + t.trim());
		System.out.println("원본데이터 : " + t);
		
		System.out.println("-------------------");
		
		// 숫자 --> 문자, 날짜 --> 문자
		String value = "10";
		Scanner sc = new Scanner(value);
		System.out.println(sc.next());
		
		// int r = Integer.parseInt(value);
		// System.out.println(++r);
		
		int x = Integer.parseInt(value);
		System.out.println(++x);
		
		System.out.println("-------------------");
				
		// 숫자, 날짜 --> 문자
		
		System.out.println("기본타입 자료형을 문자열로 변환");
		
		String ivar = String.valueOf(10);
		String fvar = String.valueOf(24.5f);
		String bvar = String.valueOf(true);
		
		System.out.println(ivar + "\t" + fvar + "\t" + bvar);
		
		System.out.println("-------------------");
		
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date);
		
		sc.close();
		
		
	}
}
