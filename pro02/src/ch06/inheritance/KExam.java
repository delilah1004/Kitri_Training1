package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 추상 클래스/함수
 * 
 * 추상 함수를 하나라도 가지고 있는 클래스라면 추상 클래스이다.
 * 추상 클래스를 상속받으면 상속받은 추상 클래스에 속한 추상 함수는 무조건 모두 오버라이딩 해야한다.
 */

abstract class KParents {		//  추상 함수를 하나라도 가지고 있으면 추상클래스로 표시해야함
	protected int x, y;
	
	public void msg() {
		System.out.println("Msg 함수입니다.");
	}
	
	public abstract void disp();
}

 class KSon extends KParents {
	@Override
	public void disp() {
		System.out.println("재정의했어!!");
	}
 }

public class KExam {
	public static void main(String[] args) {
		
		// KParents a = new KParents();
		
		KParents b = new KSon();
		b.disp();
		
		KSon c = new KSon();
		c.disp();
		
		
	}
}