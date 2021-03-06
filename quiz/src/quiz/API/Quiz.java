package quiz.API;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : 문제 7~13, 15, 16, 20, 22~
 */

public class Quiz {
	public static void main(String[] args) {
		System.out.println("문제 7. 다음 결과값은?");
		
		String str ="How are you?";
		
		System.out.println("정답 : " + (str.indexOf("a")+1));
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 8. 다음에 알맞은 코딩을 완성하세요.");
		
		Integer i = new Integer(12345);
		int su = i;		
		System.out.println("su : " + su);
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 9. 다음 프로그램의 결과값은?");
		
		String a = "JAVA가 너무 재미있습니다.";
		String b = "JAVA";
		
		System.out.println("정답 : " + a.substring(1, 3));
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 10. 다음 중 컴파일 시 오류를 발생시키는 문장을 고르시오");
		
		String s10 = "언어와 ~~";
		String sp10 = "JAVA" + "program";
		// StringBuffer sb = "안녕하세요";
		StringBuffer sb10 = new StringBuffer("안녕하세요");
		
		System.out.println("정답 : ");
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 11. 다음 프로그램의 결과는 false이다. 동일한 문자열 비교 true 나올 수 있게 하려면 어떤 함수를 작성해야 하는가?");
		
		String a11 = "APPLE";
		String b11 = "APPLE";
		if(a11.equals(b11)) 
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("a.equals(b) 일 때 true, a==b 일 때 true");
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 12. 다음 코드의 실행 결과는?");
		
		StringBuffer str12 = new StringBuffer("Hello java");
		
		System.out.println("정답 : " + str12.length());
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 13. 다음 코드의 실행 결과는?");
		
		System.out.println("정답 : " + Math.max(10, 30));
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 15. 다음에 주어진 바이트 배열을 문자열로 변환시켜보세요.");
		
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str15 = new String(bytes);
		
		System.out.println("정답 : " + str15.toString());
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 16. 다음 문자열에서 \"자바\" 문자열이 포함되어 있는지 확인하고 \"자바\"를 Java로 대치한 새로운 문자열을 만들어보세요.");
		
		String str16 = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str16.indexOf("자바");
		if(index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str16 = str16.replace("자바", "Java");
			System.out.println("--->" + str16);
		}
		
		
		System.out.println("-----------------");
		
		
		System.out.println("문제 20. 문자열 \"200\"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드를 작성");
		
		String strData1 = "200";
		int intData1 = Integer.valueOf(strData1);
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);

		
		System.out.println("-----------------");
		
		
		System.out.println("문제 22. Member 클래스를 작성하되, Object의 toString() 메소드를 오버라이딩해서 Quiz15클래스의 실행 결과처럼 나오도록 작성해보세요.");
		
		
		
		System.out.println("정답 : " + Math.max(10, 30));
		
		
	}
}
