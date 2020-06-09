package quiz.inheritance.quiz21;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 
 */

abstract class Study {
	public abstract void printMsg();
}

class Study_Sub extends Study {

	@Override
	public void printMsg() {
		System.out.print("Java는 참 재미있습니다.");
	}
}

public class ABC {
	public static void main(String[] args) {
		Study s = new Study_Sub();
		s.printMsg();
	}
}