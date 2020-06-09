package api08.Collection.Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Collection - Map - HashMap
 */

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id", "abc123");
		map.put("pwd", 12345);
		
		Scanner sc = new Scanner(System.in);
		while(true ) {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			int pwd = sc.nextInt();
			
			if(id.equals((String) map.get("id"))) {
				
				if(pwd == (Integer) map.get("pwd")) {
					System.out.print("로그인 성공");
					sc.close();
					break;
				} else {
					System.out.println("비밀번호 확인해주세요\n");
				}
			} else {
				System.out.println("아이디 확인해주세요\n");
			}
		}
	}
}