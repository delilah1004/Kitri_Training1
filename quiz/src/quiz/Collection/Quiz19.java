package quiz.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		HashSet<String> coffee = new HashSet<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("좋아하는 커피를 3가지 입력하세요 : ");
			coffee.add(sc.next());
		}
		
		sc.close();
		
		System.out.println("\n");
		
		System.out.println("입력하신 커피는 : " + coffee.size());
		Iterator<String> it =coffee.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}