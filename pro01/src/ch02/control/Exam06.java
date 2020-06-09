package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 제어문 - 조건문(switch ~ case)
 */

public class Exam06 {
	public static void main(String[] args) {
		int su = 2;

		switch (su) {
		case 1:
			System.out.println("hahaha");
			break;
		case 2:
			System.out.println("hohoho");
			break;
		case 3:
			System.out.println("hihihi");
			break;
		default:
			System.out.println("기타등등 그외");
		}

		char a = 'B';

		switch (a) { 				// if(a='W' || a='w') { case 'W' : case 'w' : System.out.println("White"); }

		case 'W':
		case 'w':
			System.out.println("White");
			break;
		case 'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case 'B':
		case 'b':
			System.out.println("Blue");
			break;
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		}

	}
}