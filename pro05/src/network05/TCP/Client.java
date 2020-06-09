package network05.TCP;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 22.
 * @Description : 클라이언트 - 메시지 송수신 while
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Socket socket = null;

		// 송신
		BufferedWriter bw = null;
		PrintWriter pw = null;
		Scanner sc = null;

		// 수신
		BufferedReader br = null;

		try {
			InetSocketAddress isa = new InetSocketAddress("192.168.0.19", 5000);
			socket = new Socket();
			socket.connect(isa);

			// 송신
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()), 512);
			pw = new PrintWriter(bw);
			sc = new Scanner(System.in);
			
			// 수신
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()), 512);

			String send = null;
			String recieve = null;

			while (true) {
				
				// 송신
				send = sc.nextLine();

				if (send.equalsIgnoreCase("Q")) {
					pw.println(send);
					pw.flush();
					break;					
				}

				pw.println("다은 >> " + send);
				pw.flush();
				
				// 수신
				recieve = br.readLine();
				System.out.println("서버가 보낸 메시지 : " + recieve);
				
			}

		} catch (UnknownHostException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (pw != null)
					pw.close();

				if (sc != null)
					sc.close();

				if (br != null)
					br.close();

				if (socket != null)
					socket.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}
}