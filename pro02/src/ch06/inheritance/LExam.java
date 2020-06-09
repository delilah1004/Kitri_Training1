package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : interface
 * 
 * 
 * class -> class : extends (class가 class 상속)
 * interface -> interface : extends (interface가 interface 상속)
 * class -> interface : implements (class가 interface 상속)
 * interface -> class : 불가능 (interface가 class 상속 불가능)
 * 
 * interface는 class를 상속받지 못한다.
 * class는 interface를 상속받을 수 있다.
 */

interface LParents {
	public static final int SU = 10;	// final 변수는 대문자
	public abstract  void disp();		// abstract method
}

class LSon implements LParents {
	private int value;

	@Override
	public void disp() {
		System.out.println(SU);
	}
	
	public void output() {
		value = 77;
		System.out.println(value);
	}
}

public class LExam {
	public static void main(String[] args) {
		// LParents l = new LParents();
		
		LParents p = new LSon();
		p.disp();
		
		System.out.println(LParents.SU);
		System.out.println(LSon.SU);
		
		LSon s = new LSon();
		s.disp();
		s.output();
	}
}