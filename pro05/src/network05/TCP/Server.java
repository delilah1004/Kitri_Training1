package network05.TCP;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 서버 - 메시지 송수신 while
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Server {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket socket = null;

		// 수신
		BufferedReader br = null;

		// 송신
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;

		try {
			InetSocketAddress isa = new InetSocketAddress(5000);
			ss = new ServerSocket();
			ss.bind(isa);
			System.out.println("서버가 연결 대기중");
			
			socket = ss.accept();

			// 수신
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			// 송신
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);

			String send = null;
			String recieve = null;

			while (true) {
				// 수신
				recieve = br.readLine();
				
				if(recieve.equalsIgnoreCase("Q")) break;
				
				System.out.println("클라이언트가 보낸 메시지 : " + recieve);

				// 송신
				System.out.print("답변할 문자 : ");
				send = sc.nextLine();

				pw.println(send);
				pw.flush();
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (bw != null)
					bw.close();

				if (pw != null)
					pw.close();

				if (sc != null)
					sc.close();

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