package thread01.Basic;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Ex01 - Digit (자식 Thread)
 */

public class Digit01 extends Thread {			// 자식 Thread (부 Thread)
	public void run() {

		for (int i = 1; i < 100; i++) {
			System.out.print(i + "\t");

			if (i % 10 == 0)
				System.out.println();
		}

		System.out.println();

	}
}