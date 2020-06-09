package io03.Char;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 문자 출력 - BufferedWriter
 */

public class CharEx01 {
	public static void main(String[] args) {

		Scanner sc = null;

		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			file = new File("C:\\Delilah\\java\\fileUpDown\\output\\CharEx01.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);

			System.out.println("↓↓↓ 문자열을 입력하세요 ↓↓↓");
			sc = new Scanner(System.in);

			while (true) {

				String msg = sc.nextLine();
				if (msg.equalsIgnoreCase("q"))
					break;

				bw.write(msg + "\r\n");
				bw.flush();
			}

			System.out.println("내용이 출력되었습니다.");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fw != null)
					fw.close();
				if (bw != null)
					bw.close();
				if (sc != null)
					sc.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}