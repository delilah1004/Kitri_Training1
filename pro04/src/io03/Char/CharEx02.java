package io03.Char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 문자 읽기 - BufferedReader
 */

public class CharEx02 {
	public static void main(String[] args) {

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {

			file = new File("C:\\Delilah\\java\\fileUpDown\\output\\CharEx01.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
			}

			System.out.println("내용이 출력되었습니다.");

		} catch (Throwable e) {

			e.printStackTrace();

		} finally {

			try {

				if (fr != null)
					fr.close();
				if (br != null)
					br.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}