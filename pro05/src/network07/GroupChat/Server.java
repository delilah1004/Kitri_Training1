package network07.GroupChat;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 25.
 * @Description : 서버 - 단체 채팅
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
	public static void main(String[] args) {

		ServerSocket ss = null;
		
		try {
			
			ss = new ServerSocket(7575);
			
			System.out.println("서버 채팅 대기중...");
			
			while(true) {		// while 조건절에 채팅방 인원 설정 가능 (true : 제한 없음)
				
				Socket socket = ss.accept();
				
				ServerArr arr = new ServerArr(socket);
				arr.start();
			}

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