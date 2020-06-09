package network03.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 서버 - 메시지 수신
 */

public class ServerEx {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket socket = null;

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {

			InetSocketAddress isa = new InetSocketAddress(5000);

			ss = new ServerSocket();
			ss.bind(isa);

			System.out.println("서버가 연결을 기다리고 있습니다.");

			socket = ss.accept();
			
			InetAddress ia = socket.getInetAddress();
			String ip = ia.getHostAddress();

			is = socket.getInputStream();
			isr = new InputStreamReader(is); // msg.getBytes() 랑 똑같은 역할
			br = new BufferedReader(isr, 512);
			
			String msg = br.readLine();
			System.out.println("[ " + ia.getHostAddress() + " ] : "+ msg);
			System.out.println("접속 IP : " + ip);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (ss != null)
					ss.close();
				
				if (socket != null)
					socket.close();
				
				if (is != null)
					is.close();

				if (isr != null)
					isr.close();

				if (br != null)
					br.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}
}