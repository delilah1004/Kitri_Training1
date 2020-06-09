package quiz.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Quiz25 {
	public static void main(String[] args) {

		File file = null;
		FileReader fr = null;
		BufferedReader br = null;

		int index, temp, hap;

		try {

			file = new File("C:\\Delilah\\java\\fileUpDown\\quiz\\quiz25.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			while (true) {
				String num = br.readLine();

				if (num == null)
					break;

				hap = 0;

				for (int i = 0; i < num.length(); i = index + 1) {
					index = num.indexOf(" ", i);

					if (index == -1) {
						temp = Integer.valueOf(num.substring(num.lastIndexOf(" ") + 1));
						hap += temp;
						break;
					}

					temp = Integer.valueOf(num.substring(i, index));
					hap += temp;
				}

				System.out.println("합은 : " + hap);

			}

		} catch (Exception e) {

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