package quiz.Class1;

class Plus {
	public int x;
	public int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y =y;
	}
	
	public String getX() {
		x++;
		return ("x:" + x);
	}
	
	public String getY() {
		y++;
		return ("y:" + y);
	}
}

public class Quiz14 {
	public static void main(String[] args) {
		Plus p = new Plus();
		p.setX(10);
		p.setY(20);
		
		System.out.println(p.getX() + "," + p.getY());
	}
}