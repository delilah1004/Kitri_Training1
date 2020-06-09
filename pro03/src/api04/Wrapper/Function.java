package api04.Wrapper;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : Integer, 문자-숫자 변환
 */

public class Function {
	public static void main(String[] args) {
		int intMax = Integer.MAX_VALUE;
		int intMin = Integer.MIN_VALUE;
		int byteCount = Integer.BYTES;
		int size = Integer.SIZE;
		
		System.out.println("int의 Max값 : " + intMax);
		System.out.println("int의 Min값 : " + intMin);
		System.out.println("byte 수 : " + byteCount);
		System.out.println("int의 크기 : " + size);
		
		System.out.println();
		
		String binary = Integer.toBinaryString(10);
		String ortal = Integer.toOctalString(10);
		String hex = Integer.toHexString(10);
		
		System.out.println("10의 2진수 표현 : " + binary);
		System.out.println("10의 8진수 표현 : " + ortal);
		System.out.println("10의 16진수 표현 (소문자) : " + hex);
		System.out.println("10의 16진수 표현 (대문자) : " + hex.toUpperCase());
		
		System.out.println();
		
		// 문자를 숫자로 바꾸기
		String su = "10";
		int value = Integer.parseInt(su);
		byte bValue = Byte.parseByte(su);
		long lValue = Long.parseLong(su);
		
		System.out.println(su + "\t" + value + "\t" + bValue + "\t" + lValue);
		
		// 숫자를 문자로 바꾸기
		int i = 10;
		String str = String.valueOf(i);
		System.out.println(i + "\t" + str);
		
		System.out.println();		
		
	}
}