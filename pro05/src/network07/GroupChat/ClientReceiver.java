package network07.GroupChat;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.Socket;
import java.net.SocketException;

public class ClientReceiver extends Thread {

	private Socket socket;

	public ClientReceiver(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			while (true) {
				String msg = br.readLine();

				if (msg.equalsIgnoreCase("q")) {
					System.out.println("상대방이 채팅을 종료했습니다.");
					break;
				}

				System.out.println(msg);

			}

		} catch (NullPointerException | SocketException e) {

			System.out.println("채팅이 종료되었습니다.");

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