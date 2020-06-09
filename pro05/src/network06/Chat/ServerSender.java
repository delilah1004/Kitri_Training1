package network06.Chat;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSender extends Thread {

	private Socket socket;

	public ServerSender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;

		try {

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);

			while (true) {

				String msg = sc.nextLine();

				if (msg.equalsIgnoreCase("Q")) {
					pw.println(msg);
					pw.flush();
					break;
				}
				
				pw.println(msg);
				pw.flush();

				System.out.println();
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (pw != null)
					pw.close();

				if (sc != null)
					sc.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}
	}
}
