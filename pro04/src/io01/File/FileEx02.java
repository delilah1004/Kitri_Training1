package io01.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 파일/디렉토리 존재여부 확인, 파일/디렉토리 생성
 */

public class FileEx02 {
	public static void main(String[] args) {
		File dir = new File("C:\\MyDirectory/Dir");
		System.out.println(dir.exists()); 		// 디렉토리 존재여부 확인

		if (dir.exists() == false) {
			dir.mkdir(); // 디렉토리(폴더) 생성
			System.out.println("디렉토리가 만들어졌습니다.");
		}

		File file = new File(dir, "abc.txt");
		System.out.println(file.isFile());		// 파일 존재여부 확인

		try {
			if (file.exists() == true && file.isFile() == false) {
				file.createNewFile();		// 파일 생성
				System.out.println("파일이 만들어졌습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n");
		
		if(dir.exists() == true && file.isFile() == true) {
			file.delete();		// 파일 삭제
			dir.delete();			// 디렉토리 삭제
			System.out.println("삭제되었습니다.");
		}
	}
}