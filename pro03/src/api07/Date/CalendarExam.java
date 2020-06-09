package api07.Date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : 날짜 함수 (Calendar)
 * 
 * (Calendar - Date - SimpleDate)
 * 출력 과정이 Date 클래스보다 복잡하지만 메소드를 사용해 날짜 계산하기 좋다.
 * 날짜를 시간으로 바꿔줘야 함
 */

public class CalendarExam {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		System.out.println();
		
		// 날짜 -> 시간
		Date date = today.getTime();
		System.out.println(date);
		
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println();
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;		// MONTH는 0부터 시작해서 +1 해줘야함
		int day = today.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		System.out.println();
		
		
	}
}