package thread01.Basic;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : 
 */

public class Ex02 {
	public static void main(String[] args) {
		
		InputThread it = new InputThread();
		it.start();
		
		SubThread sub = new SubThread();
		sub.start();

	}
}