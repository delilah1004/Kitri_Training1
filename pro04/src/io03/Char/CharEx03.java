package io03.Char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 19.
 * @Description : 문자 출력 - PrintWriter
 * 
 *              PrintWriter
 */

public class CharEx03 {
	public static void main(String[] args) {

		Scanner sc = null;

		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		PrintWriter pw = null; // 출력을 돕는 프린트 보조 스트림

		try {

			file = new File("C:\\Delilah\\java\\fileUpDown\\output\\CharEx03.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);
			pw = new PrintWriter(bw);

			System.out.println("↓↓↓ 문자열을 입력하세요 ↓↓↓");
			sc = new Scanner(System.in);

			while (true) {

				String msg = sc.nextLine();
				if (msg.equalsIgnoreCase("q"))
					break;

				pw.write(msg + "\r\n"); // \r\n은 줄바꿈을 의미한다.
				pw.flush();
			}

			// 입력
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			while (true) {

				String msg = br.readLine();
				if (msg == null)
					break;

				System.out.println(msg);
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
				
				if (fr != null)
					fw.close();
				if (br != null)
					bw.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}