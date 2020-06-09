package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 6.
 * @Description : 함수
 * 
 * public void
 * public static void
 * public final void
 * public static
 */

class KK {
	public void aa() {
		bb();
		this.bb();
		
		cc();
		KK.cc();
		
		dd();
		KK.dd();
	}
	
	public final void bb() {
		
	}
	
	public static void cc() {
		// aa();			// ERROR
		// bb();		// ERROR
		dd();
		ee();
	}
	
	public static void dd() {
		
	}
	
	public static final void ee() {
		
	}
	
}

public class Exam32 {
	public static void main(String[] args) {
		
		
		
	}
}