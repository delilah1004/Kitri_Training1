package network02.TCP;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 클라이언트 - 접속
 * 
 *              java.net
 */

public class ClientEx {
	public static void main(String[] args) {

		Socket socket = null;

		try {
			InetSocketAddress isa = new InetSocketAddress("192.168.0.19", 5000); // port번호는 0~65535 중 하나 (0은 제외)

			socket = new Socket(); // Socket 생성
			socket.connect(isa); // 연결 (IP, Port) 요청
			

			System.out.println("클라이언트가 연결을 요청합니다.");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (socket != null)
					socket.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}
}