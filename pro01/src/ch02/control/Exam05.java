package ch02.control;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 28.
 * @Description : 제어문 - 조건문(if, if~else, if~else if~else)
 * 
 * 제어문 - 조건문(if, if~else, if~else if~else, switch~case)
 * 					반복문(for, 다중 for, while, do~while)
 */

public class Exam05 {
	public static void main(String[] args) {
		
		int x = 20;

		if (x > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}

		int y = 30;
		if (y > 0 && y < 100) {
			y += 200;
		} else {
			y *= 200;
		}

		System.out.println("y:" + y);

		int score = 90;
		
		if (score >= 90) {
			System.out.println("A등급");
		} else if (score >= 80) {
			System.out.println("B등급");
		} else if (score >= 70) {
			System.out.println("C등급");
		} else {
			System.out.println("F등급");
		}
		
		System.out.println();

		String grade = "";

		if (score >= 90) {
			if (score >= 97) {
				grade = "A+";
			} else if (score >= 94) {
				grade = "A0";
			} else {
				grade = "A-";
			}
		} else if (score >= 80) {
			if (score >= 87) {
				grade = "B+";
			} else if (score >= 84) {
				grade = "B0";
			} else {
				grade = "B-";
			}
		}
		
		System.out.println("학점:" + grade);
		
		
		
	}
}