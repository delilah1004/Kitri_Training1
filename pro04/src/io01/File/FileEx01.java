package io01.File;

import java.io.File;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 파일 정보
 * 
 * 입력 : 키보드, 파일(업로드), 네트워크(채팅)
 * 출력 : 화면, 파일(다운로드), 네트워크(채팅)
 */

public class FileEx01 {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		
		for(int i =0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
		
		System.out.println();
		
		// \t 서식 사용되서 경로변경시 \\ 또는 /
		File file = new File("C:\\Delilah\\java\\workspace\\pro03\\src\\api10\\Exception");
		
		if(file.exists()) {
			String[] str = file.list();
			
			for(int i = 0; i < str.length; i++) {
				System.out.println(str.clone()[i]);
			}
		}
		
		System.out.println();
		
		File temp = new File(file, "Ex04.java");
		
		System.out.println("디렉토리 존재 : " + temp.exists());
		System.out.println(temp);
		
		System.out.println();
		
		if(temp.exists() && temp.isFile()) {
			System.out.println("파일명 : " + temp.getName());		// getName - 파일명 가져오기
			System.out.println("경로명 : " + temp.getParent());		// getParent - 파일이 속한 폴더의 경로 가져오기
			// getAbsolutePath - 파일의 경로 가져오기 : 매우매우매우매우 중요!!!
			System.out.println("파일&경로명 : " + temp.getAbsolutePath());		
			System.out.println("쓰기 가능 : " + temp.canWrite());
			System.out.println("읽기 가능 : " + temp.canRead());
			System.out.println("파일 크기 : " + temp.length() + "byte");		// 중요
		}
	}
}