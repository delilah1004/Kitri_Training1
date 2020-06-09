package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 함수 재정의 - 오버라이딩
 */

class AA {
	public void aa() { }
	public void bb( ) { }
	public void cc( ) { }
	public void dd( ) { }
	
	public void disp() {		// 함수 선언
		System.out.println("hahahaha");		// 함수 정의
	}
}

class BB extends AA {		// aa(), bb(), cc(), dd()
	public void disp() {		// 함수재정의(Overriding)
		System.out.println("하하하하하");
	}
	
}

class CC extends BB {
	
}

public class GExam {
	public static void main(String[] args) {
		BB b = new BB();
		b.disp();
	}
}