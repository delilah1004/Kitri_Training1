package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : while, do ~ while - break, continue
 */

public class Exam10 {
	public static void main(String[] args) {

		int i = 1;
		
		while(i <= 10) {
			if(i == 5) break;	// break를 continue로 바꾸면 무한 루프에 빠진다.
			
			System.out.println(i);
			++i;
		}
		
		
		int j =0;
		while(j <= 10) {
			++j;
			if(j == 5) continue;
			
			System.out.println(j);
		}
		
		
		int k = 0;
		do {
			++k;
			
			if(k==5) continue;		// break;
			
			System.out.println(k);
		} while(k <= 10);

	}
}