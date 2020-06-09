package network07.GroupChat;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : 클라이언트 - 단체 채팅
 */

import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		try {
			Socket socket = new Socket("192.168.0.19", 7575);
			
			ClientSender sender = new ClientSender(socket, "다은");
			sender.start();
			
			ClientReceiver receiver = new ClientReceiver(socket);
			receiver.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}