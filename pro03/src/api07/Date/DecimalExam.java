package api07.Date;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : DecimalFormat
 * 
 * api 참고 : java.text.DecimalFormat - Special Pattern Characters
 */

import java.text.DecimalFormat;

public class DecimalExam {
	public static void main(String[] args) throws Exception {
		double x = 1234567.89;
		
		// 반올림해서 소수점없이 출력
		DecimalFormat d1 = new DecimalFormat("0");
		// DecimalFormat d1 = new DecimalFormat("#");			// 똑같은 결과
		System.out.println(d1.format(x));
		
		// 반올림해서 소수 첫째자리까지 출력
		DecimalFormat d2 = new DecimalFormat("0.0");
		// DecimalFormat d2 = new DecimalFormat("#.#");		// 똑같은 결과
		System.out.println(d2.format(x));
		
		
		// 소수 넷째자리까지 출력, 없는 부분은 0으로 채움
		DecimalFormat d3 = new DecimalFormat("0.0000");
		System.out.println(d3.format(x));
		
		// 소수 넷째자리까지 출력, 없는 부분은 출력하지 않음
		DecimalFormat d4 = new DecimalFormat("#.####");
		System.out.println(d4.format(x));
		
		// 소수점 없이 세자리마다 ,(콤마) 찍어줌
		DecimalFormat d5 = new DecimalFormat("#,###");
		System.out.println(d5.format(x));
		
		// 소수점 없이 네자리마다 ,(콤마) 찍어줌
		DecimalFormat d6 = new DecimalFormat("#,####");
		System.out.println(d6.format(x));
		
		// 소수점 없이 다섯자리마다 ,(콤마) 찍어줌
		DecimalFormat d7 = new DecimalFormat("#,#####");
		System.out.println(d7.format(x));
		
		// 화폐단위(원)로 출력, 소수점 없이 세자리마다 ,(콤마) 찍어줌 - 시스템 설정이 한국이라 $는 안된다.
		DecimalFormat d8 = new DecimalFormat("\u00A4 #,###");
		System.out.println(d8.format(x));

		
		System.out.println();
		
		
		// 문자 -> 숫자
		String str = "1,123,456";
		DecimalFormat df = new DecimalFormat("#,###");
		Number num = df.parse(str);		// 문자 -> DecimalFormat -> Number
		int su = num.intValue();			// Number -> int
		System.out.println(su);
		
		
		
		
	}
}