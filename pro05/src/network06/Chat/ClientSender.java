package network06.Chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {

	private Socket socket;
	private String nickName;

	public ClientSender(Socket socket, String nickName) {
		this.socket = socket;
		this.nickName = nickName;
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
					pw.print(msg);
					pw.flush();
					break;
				}

				pw.println(nickName + ">>>" + msg);
				pw.flush();
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

			} catch (IOException e) {
				
				e.printStackTrace();

			}
		}
	}
}