package network06.Chat;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : 클라이언트 - 동시 채팅 (메시지 송수신 스레드)
 */

import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("닉네임 하나만 입력하세요");
			return;
		}

		try {
			String nickName = args[0];
			Socket socket = new Socket("192.168.0.19", 8989);
			
			ClientSender sender = new ClientSender(socket, nickName);
			sender.start();
			
			ClientReceiver receiver = new ClientReceiver(socket);
			receiver.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}