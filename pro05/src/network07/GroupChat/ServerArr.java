package network07.GroupChat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerArr extends Thread {

	private Socket socket;
	private PrintWriter pw;
	public static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());

	public ServerArr(Socket socket) { // [0] pw 홍길동 / [1] pw 김길동 / [9]
		this.socket = socket;
		sendArr();
	}

	public void sendArr() {

		try {

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);

			list.add(pw);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void sendPrintAll(String str) {
		for (PrintWriter pw : list) {
			pw.println(str);
			pw.flush();
		}
	}

	@Override
	public void run() {

		BufferedReader br = null;
		String nickName = null;

		try {

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			nickName = br.readLine();

			sendPrintAll("#" + nickName + "님이 들어오셨습니다.");

			while (true) {
				String msg = br.readLine();

				if (msg.equalsIgnoreCase("Q")) {
					sendPrintAll("#" + nickName + "님이 채팅방을 나갔습니다.");
					list.remove(pw);
					break;
				}

				sendPrintAll("#" + nickName + ">>" + msg);
			}

		} catch (SocketException | NullPointerException e) {

			sendPrintAll("#" + nickName + "님이 채팅방을 나갔습니다.");
			list.remove(pw);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}