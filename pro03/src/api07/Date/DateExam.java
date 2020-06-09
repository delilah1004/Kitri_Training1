package api07.Date;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : 날짜 함수 (Date)
 * 
 * (Date - SimpleDateFormat)
 * 간단하게 날짜를 출력할 수 있지만 날짜 연산이 어렵다.
 * Date 클래스의 메소드들 : Deprecated. 
 */

public class DateExam {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date.toString());
		
		// Date 클래스를 사용하여 현재 날짜 출력 - 오류 - Deprecated 함수 사용
		System.out.print(date.getYear() + "년도\t");
		System.out.print(date.getMonth() + 1 + "월\t");		// getMonth()는 0부터 시작해서 +1 해줘야함
		System.out.print(date.getDate() + "일\t");
		System.out.print(date.getHours() + "시\t");
		System.out.print(date.getMinutes() + "분\t");
		System.out.print(date.getSeconds() + "초\t");
		
		System.out.println("\n");
		
		// SimpleDateFormat + Date 클래스를 사용하여 현재 날짜 출력 - 성공
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(date);
		System.out.println(str);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		String str1 = sdf1.format(date);
		System.out.println(str1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		String str2 = sdf2.format(date);
		System.out.println(str2);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("올해의 D번째 날");
		String str3 = sdf3.format(date);
		System.out.println(str3);
		
		System.out.println();
		
		// 문자를 날짜로 바꾸기
		String birth = "1996-10-21";
		Date dateStr = sdf.parse(birth);
		System.out.println(dateStr.toString());		// toString() 생략가능

		
	}
}