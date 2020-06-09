package network03.TCP;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 클라이언트 - 메시지 송신 while
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) {

		Socket socket = null;

		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		Scanner sc = null;

		try {
			while (true) {
				InetSocketAddress isa = new InetSocketAddress("192.168.0.19", 5000);

				socket = new Socket();
				socket.connect(isa);

				System.out.println("클라이언트가 연결을 요청합니다.");

				os = socket.getOutputStream();
				osw = new OutputStreamWriter(os); // msg.getBytes() 랑 똑같은 역할
				bw = new BufferedWriter(osw, 512);
				sc = new Scanner(System.in);

				System.out.print("전송할 문자 : ");
				String msg = sc.nextLine();

				if (msg.equals("exit"))
					break;

				bw.write(msg); // 2byte로 나간다
				bw.flush();
			}

		} catch (UnknownHostException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (socket != null)
					socket.close();

				if (os != null)
					os.close();

				if (osw != null)
					osw.close();

				if (bw != null)
					bw.close();

				if (sc != null)
					sc.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}
	}
}