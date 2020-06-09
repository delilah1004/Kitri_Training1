package ch01.dataType;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 27.
 * @Description : 자료형
 */

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("하하하");
		System.out.println("호호호");
		System.out.println("월요일\n");
		System.out.println("화요일 \t 수요일\n");

		// 숫자(정수, 실수)
		// 정수 - byte, short, int, long
		byte a = 10; 					// 1byte, byte : -128 ~ +127
		short b = 129; 				// 2byte, short : -32768 ~ +32767
		int c = 1000; 					// 4byte, int : -2147483648 ~ +2147483647
		long d = 6580L; 			// 8byte, long : -2^63 ~ +2^63-1

		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		System.out.println("d:" + d);
		
		// 실수 - float, double
		float e = 45.5f;				// 4byte, float : 4 e-45 ~ 3.4082 e38
		double f = 123.40;		// 8byte, double : 4.92 e-324 ~ 1.8 e308
		
		System.out.println("e:" + e);
		System.out.println("f:" + f);

		// 문자(문자, 문자열)		
		// 문자 - char
		char ch ='A';					// 2byte, char :
		char h = '가';
		
		System.out.println("ch:" + ch);		// 아스키 코드값
		System.out.println("h:" + h);		// 문자셋 (UTF-8)
		
		// 문자열 - String : 무한참조형
		String str1 = "Hello java";		// 2byte 이상 참조형 자료형, String
		String str2 = "안녕하세요. 자바";
		String str3 = "How are you";
		
		/* Stack 영역 */
		String str4 = "Hello java";
		
		// 주소값 비교 - T
		if(str1==str4) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		// 데이터 비교 - T
		if(str1.equals(str4)) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		
		/* Heap 영역*/
		String aa = new String("hi");
		String bb = new String("hi");
		
		// 주소값 비교 - F
		if(aa==bb) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		// 데이터 비교 - T
		if(aa.equals(bb)) {
			System.out.println("T");
		} else {
			System.out.println("F");
		}
		
		// 논리형 자료형 T(1), F(0) 1byte
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1:" + b1);
		System.out.println("b2:" + b2);
	}
}
