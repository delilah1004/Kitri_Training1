package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 
 */

class HParents {
	protected int x;
	protected int y;
	
	public HParents() { }
	
	public HParents(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void yonsan() {
		System.out.print("hap:" + (x+y));
	}
}

class HSon extends HParents {
	
	public HSon() { }
	
	public HSon(int x, int y) {
		super.x = x;
		super.y = y;
	}

	public void yonsan() {
		System.out.println("cha:" + (x-y));
	}
	
	public void disp() {
		System.out.println("HSon");
	}

}

public class HExam {
	public static void main(String[] args) {
		HParents h = new HParents(77, 88);
		h.yonsan();
		
		HParents s = new HParents(100, 200);
		s.yonsan();
		
		// HSon a = new HParents(1, 2); 		: ERROR 자식은 부모클래스를 담을 수 없다.
		
		HSon r = new HSon(1, 2);		// upCasting
		r.yonsan();		//	: 함수 재정의 - 자식함수를 사용할 수 있다.
		// r.disp();			: ERROR
		
		HSon a = (HSon) r;		// downCasting 명시적
		a.yonsan();
		
		HSon b = (HSon) new HParents(1, 2);		// upCasting 한 자식 클래스만 다시 downCasting 할 수 있다.
		b.disp();							// ERROR

		byte x = 10;
		int y = x;
		
		
		
	}
}