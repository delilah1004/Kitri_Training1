package quiz.network.quiz04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;

		try {
			
			serverSocket = new ServerSocket(5000);
			
			System.out.println("서버 준비 중입니다.");
			
			socket = serverSocket.accept();
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()),512);
			
			String msg = null;
			
			while(true) {
				
				msg = br.readLine();
				
				if(msg.equalsIgnoreCase("Q")) break;
				
				System.out.println("전송받은 메시지 : " + msg);
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			
			try {
				
				if(socket!=null) socket.close();
				
				if(br!=null) br.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}