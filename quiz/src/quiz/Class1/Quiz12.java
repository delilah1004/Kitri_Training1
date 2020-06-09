package quiz.Class1;

class Circle {
	public double radius;
	public float area;
	
	public void getRadius(double radius) {
		this.radius = radius;
	}
	
	public void findArea() {
		this.area = (float) (Math.pow(radius, 2) * Math.PI);
	}
	
	public void disp() {
		System.out.print("원의 면적:" + area);
	}
	
}

public class Quiz12 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.getRadius(4.0);
		c.findArea();
		c.disp();
		
	}
}