package quiz.network.quiz05;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		Socket socket = null;
		
		InputStream input = null;
		
		try {
			
			ss = new ServerSocket(5000);
			socket = ss.accept();
			
			input = socket.getInputStream();
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if(ss!=null) ss.close();
				
				if(socket!=null) socket.close();
				
				if(input!=null) input.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}