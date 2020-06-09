package quiz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Quiz23 {
	public static void main(String[] args) {
		File file = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			file = new File("C:\\Delilah\\java\\fileUpDown\\quiz\\quiz23.txt");
			fis = new FileInputStream(file);

			byte[] data = new byte[65535];
			fis.read(data);
			
			String txt = new String(data);
			
			data = txt.toUpperCase().getBytes();
			
			fos = new FileOutputStream(file);
			
			fos.write(data);
			fos.flush();			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}