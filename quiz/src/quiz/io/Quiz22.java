package quiz.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quiz22 {
	public static void main(String[] args) {

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		int i = 0;

		try {

			file = new File("C:\\Delilah\\java\\fileUpDown\\quiz\\quiz22.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			while (true) {
				String msg = br.readLine();
				if (msg == null)
					break;

				System.out.println((++i) + "\t" + msg);

			}

		} catch (Throwable e) {

			e.printStackTrace();

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}

// C:\Delilah\java\fileUpDown\quiz