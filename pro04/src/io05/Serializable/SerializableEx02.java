package io05.Serializable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 날짜 객체 불러오기/출력
 * 
 * ObjectOutputStream
 */

public class SerializableEx02 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("C:\\Delilah\\java\\fileUpDown\\output\\a.dat");
			bis = new BufferedInputStream(fis, 1024);
			ois = new ObjectInputStream(bis);

			Date date = (Date) ois.readObject();		// 직렬화 : 객체를 파일로 출력

			System.out.println(date);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();
				if (ois != null)
					ois.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}