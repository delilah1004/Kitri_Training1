package test;

//
class Computer {
	public void disp() {
		System.out.println("Computer Class");
	}
}

class Programmer {
	public void sub() {
		
		// 이 메소드 내부에서만 computer의 레퍼런스를 유지함, 함수 실행이 끝나면 computer의 참조도 사라짐
		Computer computer = new Computer();
		computer.disp();
	}
}

public class Test {
	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		programmer.sub();
	}
}

