package io02.Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 텍스트 파일 입력
 * 
 *              파일 입/출력 - 바이트 기반 스트림
 * 
 *              그림, 멀티미디어, 문자 종류의 데이터를 보낼 수 있다.
 * 
 *              바이트 기반, 문자 기반 스트림으로 나눈다.
 * 
 *              바이트 기반 : 그림, 멀티미디어, 문자의 모든 종류의 데이터를 보내고 받는다.
 */

public class ByteEx01 {
	public static void main(String[] args) {

		byte[] data = new byte[] { 'a', 'p', 'p', 'l', 'e' };

		try {

			File file = new File("C:\\Delilah\\java\\fileUpDown\\ex01.txt");
			FileOutputStream fos = new FileOutputStream(file);

			for (int i = 0; i < data.length; i++) {
				fos.write(data[i]);
			}

			fos.flush(); // 버퍼에 잔류하고 있는 데이터를 강제로 출력한다.
			fos.close(); // 시스템자원 반납하고 출력스트림 닫는다. (close 안할 경우 데이터 손실)

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}