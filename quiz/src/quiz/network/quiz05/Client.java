package quiz.network.quiz05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {

		Socket socket = null;

		OutputStream output = null;

		try {

			socket = new Socket("192.168.0.19", 5000);

			output = socket.getOutputStream();

			byte[] arr = new byte[] { 'A', 'B', 'C', 'D', 'E', 'F' };

			output.write(arr);
			output.flush();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (socket != null)
					socket.close();

				if (output != null)
					output.close();

			} catch (IOException e) {

				e.printStackTrace();

			}
		}
	}
}