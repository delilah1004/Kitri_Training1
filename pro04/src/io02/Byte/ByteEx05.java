package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 텍스트를 저장하고 읽어오기
 */

public class ByteEx05 {
	public static void main(String[] args) {

		File file = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// 파일 출력
			file = new File("C:\\Delilah\\java\\fileUpDown\\output\\Ex05.txt");
			fos = new FileOutputStream(file);

			// byte 자료형 입출력, 이미지(엑셀, 파워포인트 등등) 입출력, 문자 입출력
			String str = "안녕하세요";			// 문자
			byte[] data = str.getBytes();		// 바이트로 바꿔서 출력
			fos.write(data);
			fos.flush();

			// 파일 입력
			fis = new FileInputStream(file);
			byte[] msg = new byte[65536];
			int count = fis.read(msg);			// 바이트로 읽어오기
			
			String inStr = new String(msg, 0, count);		// 읽어온 바이트를 문자로 바꾸기
			System.out.println(inStr);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}