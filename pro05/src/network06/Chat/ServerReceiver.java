package network06.Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ServerReceiver extends Thread {

	private Socket socket;

	public ServerReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			while (true) {

				String msg = br.readLine();

				if (msg.equalsIgnoreCase("Q")) {
					System.out.println("상대방이 채팅을 종료했습니다.");
					break;
				}

				System.out.println(msg);

			}

		} catch (NullPointerException | SocketException e) {

			System.out.println("채팅이 종료되었습니다."); // 클라이언트에서 socket close null 반환

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (socket != null)
					socket.close();

			} catch (Exception e) {

				e.printStackTrace();

			}
		}
	}
}