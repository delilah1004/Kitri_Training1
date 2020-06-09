package quiz.Collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat d = new DecimalFormat("#,###");
		String country;
		int population;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("나라 : ");
			country = sc.next();
			
			System.out.print("인구 수 : ");
			population = sc.nextInt();
			
			map.put(country, population);
			
			System.out.println();
		}

		System.out.print("검색할 나라의 이름을 입력하세요 : ");
		country = sc.next();
		System.out.print(country + "의 인구는 " + d.format(map.get(country)) + "명 입니다.");
		
		sc.close();
	}
}