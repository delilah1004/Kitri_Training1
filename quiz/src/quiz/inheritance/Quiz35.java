package quiz.inheritance;

abstract class Figure {
	public abstract void area();
	public abstract void around();
}

class Rectangular extends Figure {
	private double width;
	private double height;
	
	public Rectangular(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("사각형의 면적:" + (width*height));
	}

	@Override
	public void around() {
		System.out.println("사각형의 둘레:" + ((width * 2) + (height * 2)));
	}
}

class Circle extends Figure {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public void area() {
		System.out.println("원의 면적:" + (Math.pow(r, 2) * 3.141592));
	}

	@Override
	public void around() {
		System.out.println("원의 둘레:" + (2 * 3.141592 * r));
	}
}

public class Quiz35 {
	public static void main(String[] args) {
		Figure f =new Rectangular(2.3, 3.7);
		f.area();
		f.around();
		
		Figure i = new Circle(3.6);
		i.area();
		i.around();
	}
}