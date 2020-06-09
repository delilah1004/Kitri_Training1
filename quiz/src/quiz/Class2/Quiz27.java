package quiz.Class2;

import java.util.Scanner;

class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
}

public class Quiz27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] width = new int[4];
		int[] height = new int[4];
		Rect[] rect = new Rect[4];
		
		for(int i = 0; i < 4; i++) {
			System.out.print("너비와 높이>>");
			width[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rect[i] = new Rect(width[i], height[i]);
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + "번째 정사각형의 넓이는 " + rect[i].getArea() + "입니다");
		}
	}
}