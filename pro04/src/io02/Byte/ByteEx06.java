package io02.Byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : ppt를 저장하고 읽어오기
 * 
 * BufferedInputStream
 * 한글, 엑셀 등등 다 가능
 */

public class ByteEx06 {
	public static void main(String[] args) {

		File inFile = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		File outFile = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			inFile = new File("C:\\Delilah\\java\\fileUpDown\\input\\Class Diagram.pptx");
			fis = new FileInputStream(inFile);
			bis = new BufferedInputStream(fis, 1024);		// 일반 파일 업로드는 1024byte, 네트워크 통신은 512byte 정도밖에 안됨
			
			outFile = new File("C:\\Delilah\\java\\fileUpDown\\output\\Class Diagram.pptx");
			fos = new FileOutputStream(outFile);
			bos = new BufferedOutputStream(fos, 1024);

			byte[] data = new byte[65536]; 			// 바이트 최대 크기
			
			while(true) {
				int count = bis.read(data);
				if(count==-1) break;
				bos.write(count);
			}
			
			bos.flush();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
				if(bis!=null)
					bis.close();
				if(bos!=null)
					bos.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}