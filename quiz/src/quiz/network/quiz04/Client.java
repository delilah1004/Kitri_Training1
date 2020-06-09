package quiz.network.quiz04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Socket socket = null;

		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;

		try {

			socket = new Socket("192.168.0.19", 5000);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);

			String msg = null;

			while (true) {

				System.out.print("전송할 메시지는 : ");
				msg = sc.next();

				pw.println(msg);
				pw.flush();

				if (msg.equalsIgnoreCase("Q"))
					break;
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (socket != null)
					socket.close();

				if (bw != null)
					bw.close();

				if (pw != null)
					pw.close();

				if (sc != null)
					sc.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}