package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 이미지를 읽어와서 저장하기
 */

public class ByteEx04 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			File infile = new File("C:\\Delilah\\java\\fileUpDown\\input\\dress.jpg");
			fis = new FileInputStream(infile);

			File outfile = new File("C:\\Delilah\\java\\fileUpDown\\output\\dress.jpg");
			fos = new FileOutputStream(outfile);

			while (true) {
				int count = fis.read();
				if (count == -1)
					break;

				fos.write(count);
			}

			fos.flush();
			System.out.println("파일 입/출력");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {	// 나중에 클래스로 빠진다.
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}