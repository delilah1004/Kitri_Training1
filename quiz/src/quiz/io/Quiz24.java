package quiz.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		Scanner sc = new Scanner(System.in);

		try {
			file = new File("C:\\Delilah\\java\\fileUpDown\\quiz\\quiz22.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			System.out.print("문자를 입력 : ");
			String animal = sc.next();

			while (true) {
				String msg = br.readLine();

				if (msg == null) {
					System.out.println("동일한 문자열이 존재하지 않습니다.");
					break;
				}

				if (msg.equals(animal)) {
					System.out.println("동일한 문자열이 존재합니다. [" + msg + "]");
					break;
				}
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
				if (sc != null)
					sc.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}