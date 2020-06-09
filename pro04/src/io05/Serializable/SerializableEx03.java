package io05.Serializable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 사용자 정의 객체 내보내기
 * 
 * ObjectOutputStream
 */

public class SerializableEx03 {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		Test a = new Test(10, 22.2f, 'A');
		Test b = new Test(20, 33.3f, 'B');
		Test c = new Test(30, 44.4f, 'C');

		try {
			fos = new FileOutputStream("C:\\Delilah\\java\\fileUpDown\\output\\b.dat");
			bos = new BufferedOutputStream(fos, 1024);
			oos = new ObjectOutputStream(bos);

			oos.writeObject(a);
			oos.writeObject(b);
			oos.writeObject(c);
			
			oos.flush();

			System.out.println("출력완료");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();
				if (oos != null)
					oos.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}