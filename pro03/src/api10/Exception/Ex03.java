package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : Run Configurations
 */

public class Ex03 {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			// System.out.println(args[i]);
			
			int su = Integer.parseInt(args[i]);
			System.out.println(++su);
		}
	}
}