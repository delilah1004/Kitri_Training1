package network07.GroupChat;

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
		
		System.out.println("채팅방에 입장하였습니다.");
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
			
			// 서버에 닉네임부터 넘겨준다.
			pw.println(nickName);
			pw.flush();

			while (true) {
				String msg = sc.nextLine();

				if (msg.equalsIgnoreCase("Q")) {
					pw.print(msg);
					pw.flush();
					break;
				}

				pw.println(msg);
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