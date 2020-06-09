package io04.Console;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 
 */

public class ConsoleEx01 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		BufferedInputStream bis = new BufferedInputStream(is);
		
		byte[] data = new byte[20];
		
		System.out.print("문자열입력 : ");
		int count = bis.read(data);
		System.out.println(count);
		
		String str = new String(data, 0, count-2);
		System.out.println(str);
		
		byte[] suData = new byte[20];
		
		System.out.println("숫자입력 : ");
		int cnt = bis.read(suData);
		
		String suStr = new String(suData, 0, cnt-2);
		int value = Integer.parseInt(suStr);
		System.out.println(++value);
		
	}
}