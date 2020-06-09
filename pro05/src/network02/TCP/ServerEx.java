package network02.TCP;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 서버 - 접속
 * 
 *              클라이언트와 port번호가 같아야 한다.
 */

public class ServerEx {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket socket = null;

		try {

			InetSocketAddress isa = new InetSocketAddress(5000);

			ss = new ServerSocket();		// 서버소켓 생성
			ss.bind(isa);						// 포트를 열고 있음
			
			System.out.println("서버가 연결을 기다리고 있습니다."); 	// 대기 상태로 클라이언트 연결 기다림

			socket = ss.accept();		// 클라이언트 접속 후 연결 수락
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();
			
			System.out.println("접속 IP : " + ip);
			
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			
			try {
				
				if (ss != null)
					ss.close();
				if (socket != null)
					socket.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}

	}
}