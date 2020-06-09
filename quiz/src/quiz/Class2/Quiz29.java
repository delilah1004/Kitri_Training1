package quiz.Class2;

import java.util.Scanner;

class Yonsan {
	private int su;
	private int value;
	private char buho;
	private int resultInt;
	private float resultFloat;
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("수를 입력하세요:");
		su = sc.nextInt();
		System.out.print("부호를 입력하세요:");
		buho = sc.next().charAt(0);
		System.out.print("수를 입력하세요:");
		value = sc.nextInt();
	}
	
	public void yonsan() {
		if(buho == '+') {
			resultInt = su + value;
		} else if(buho == '-') {
			resultInt = su - value;
		} else if(buho == '*') {
			resultInt = su * value;
		} else if(buho == '/') {
			resultFloat = (float) su / value;
		} else {
			input();
			yonsan();
		}
	}

	public void disp() {
		if(buho == '/') {
			System.out.println(su + buho + value + "=" + resultFloat);
		} 
		if (buho == '+' || buho == '-' || buho == '*') {
			System.out.println(su + "" +buho + value + "=" + resultInt);
		}
	}
}

public class Quiz29 {
	public static void main(String[] args) {
		Yonsan y=new Yonsan(); 
		y.input(); 
		y.yonsan(); 
		y.disp();
	}
}