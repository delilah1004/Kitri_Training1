package thread01.Basic;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Ex01 - Alphabet (자식 스레드)
 */

public class Alphabet01 extends Thread{		// 자식 Thread (부 Thread)
	public void run() {

		for (char i = 'A'; i < 'z'; i++) {
			System.out.print(i + "\t");

			if (i == 'z')
				System.out.println();
		}

		System.out.println();
	}
}