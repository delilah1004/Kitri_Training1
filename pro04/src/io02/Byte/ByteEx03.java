package io02.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 이미지 파일 입/출력
 * 
 * 엑셀, 동영상 모두 가능
 */

public class ByteEx03 {

	public static void main(String[] args) {

		try {
			// 파일 가져올 경로
			File infile = new File("C:\\Delilah\\java\\fileUpDown\\input\\dress.jpg");
			FileInputStream fis = new FileInputStream(infile);
			
			// 파일 내보낼 경로
			File outfile = new File("C:\\Delilah\\java\\fileUpDown\\output\\dress.jpg");
			FileOutputStream fos = new FileOutputStream(outfile);

			while (true) {
				// 파일 바이너리 읽어오기
				int count = fis.read();

				// 파일의 마지막 바이너리까지 읽어왔으면 while문 종료
				if (count == -1)
					break;
				
				// 읽어온 바이너리 저장
				fos.write(count);
			}
			
			fos.flush();		// 저장된 바이너리 한번에 출력 -> 이미지 파일 내보내기
			fos.close();		// 출력스트림 종료
			fis.close();		// 입력스트림 종료
			
			System.out.println("파일 입/출력");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}