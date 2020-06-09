package io05.Serializable;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 사용자 정의 객체 불러오기/출력
 * 
 * ObjectOutputStream
 */

public class SerializableEx04 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("C:\\Delilah\\java\\fileUpDown\\output\\b.dat");
			bis = new BufferedInputStream(fis, 1024);
			ois = new ObjectInputStream(bis);

			Test test = null;
			
			while(true) {
				
				test = (Test) ois.readObject();
				if(test==null) break;
				System.out.println(test.toString());
				
			}
			
		} catch (EOFException e) {		// 파일의 내용을 더이상 읽어올 것이 없을 때
			
			System.out.println("다 읽었습니다");

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