package quiz.Collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		ArrayList<Character> array = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat d = new DecimalFormat("0.0");
		double score = 0;
		char grade;
		
		for(int i = 1; i <= 5; i++) {	
			System.out.print(i + "번째 학점 입력 : ");
			grade = (sc.next()).charAt(0);
			array.add(grade);
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {	
			if(array.get(i) == 'A') {
				score = 4.0;
			} else if(array.get(i) == 'B') {
				score = 3.0;
			} else if(array.get(i) == 'C') {
				score = 2.0;
			} else if(array.get(i) == 'D') {
				score = 1.0;
			} else if(array.get(i) == 'F') {
				score = 0;
			}
			System.out.println((i+1) + "번째 학점 : " + array.get(i) + " = " + d.format(score));
		}
		
		sc.close();
	}
}