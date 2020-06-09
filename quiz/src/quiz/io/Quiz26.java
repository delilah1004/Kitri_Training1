package quiz.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {

		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		Scanner sc = null;

		try {

			// 입력
			file = new File("C:\\Delilah\\java\\fileUpDown\\quiz\\quiz26.txt");
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw, 1024);
			
			sc = new Scanner(System.in);
			System.out.println("데이터를 입력해주세요. (종료 : Q)");
			
			while(true) {
				String msg = sc.nextLine();
				
				if(msg.equals("Q")) break;
				
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
			System.out.println("종료되었습니다.");
			
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);

			while (true) {
				String msg = br.readLine();

				if (msg == null)
					break;
				
				System.out.println(msg);
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