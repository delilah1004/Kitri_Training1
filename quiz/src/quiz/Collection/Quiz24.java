package quiz.Collection;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Vector;

public class Quiz24 {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<Double>();
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat d = new DecimalFormat("0.0");
		double su;
		double max = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print((i+1) + "번째 수를 입력하세요 : ");
			su = sc.nextDouble();
			vector.add(su);
		}
		
		sc.close();
		
		for(int i = 0; i < vector.size(); i++) {
			if(vector.get(i)>max) {
				max = vector.get(i);
			}
		}
		
		System.out.print("가장 큰 수는 : " + d.format(max));
	}
}