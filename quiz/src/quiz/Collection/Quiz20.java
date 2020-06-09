package quiz.Collection;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		HashMap<String, String> person = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		String name, phone;

		for (int i = 0; i < 5; i++) {
			System.out.print("이름 : ");
			name = sc.next();
			
			System.out.print("전화번호 : ");
			phone = sc.next();
			
			person.put(name, phone);
			
			System.out.println();
		}
		
		System.out.print("전화번호를 검색할 이름을 입력하세요 : ");
		name = sc.next();
		System.out.print(name + "의 전화번호는 " + person.get(name) + " 입니다.");
		
		sc.close();
	}
}