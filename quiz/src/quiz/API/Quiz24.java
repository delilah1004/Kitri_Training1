package quiz.API;

import java.util.StringTokenizer;

public class Quiz24 {
	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		
		String[] strArr = str.split(", ");
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println();
		
		StringTokenizer stoken = new StringTokenizer(str, ", ");
		while(stoken.hasMoreTokens()) {
			String string = stoken.nextToken();
			System.out.println(string);
		}
	}
}