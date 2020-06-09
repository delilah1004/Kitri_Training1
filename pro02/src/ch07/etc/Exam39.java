package ch07.etc;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 11.
 * @Description : instanceof - UpCasting 확인 연산자
 */

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
	
	public void sub() { }
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

public class Exam39 {
	public static void main(String[] args) {
		Shape  shape = new Shape();
		Line line = new Line();
		Rect rect = new Rect();
		Circle circle = new Circle();
		
		print(shape);
		print(line);
		print(rect);
		print(circle);
		
	}
	
	// static은 static만 호출하기 때문에 main함수에서 호출할 함수는 static으로 만들어줘야 한다.
	public static void print(Shape shape) {
		shape.draw();
		// shape.sub(); - ERROR : Shape 객체에 sub()라는 함수를 포함하고 있지 않음
		
		if(shape instanceof Line) {
			Line i = (Line) shape;
			i.sub();
			// shape가 Line 클래스의 instance이면 Line으로 다운캐스팅해준다. -> sub() 함수 사용 가능
		}
	}
}