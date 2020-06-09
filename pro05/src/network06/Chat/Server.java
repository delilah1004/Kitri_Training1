package network06.Chat;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : 서버 - 동시 채팅 (메시지 송수신 스레드)
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	public static void main(String[] args) {

		ServerSocket ss = null;
		
		try {
			
			ss = new ServerSocket(8989);
			
			System.out.println("서버 채팅 대기중...");
			
			Socket socket = ss.accept();
			
			ServerReceiver reciever = new ServerReceiver(socket);
			reciever.start();
			
			ServerSender sender = new ServerSender(socket);
			sender.start();
			

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (ss != null)
					ss.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}