package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 클래스 상속
 * 
 * 부모클래스에서는 자식클래스를 다 가져다 쓸 수 있다.
 */

class Shape { // 부모 클래스 (슈퍼 클래스)
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape { // 자식 클래스 (서브 클래스)
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class JExam {
	public static void main(String[] args) {
		Shape[] array = new Shape[3];

		array[0] = new Line();
		array[1] = new Rect();
		array[2] = new Circle();

		for (int i = 0; i < array.length; i++) {
			array[i].draw();
		}
	}
}