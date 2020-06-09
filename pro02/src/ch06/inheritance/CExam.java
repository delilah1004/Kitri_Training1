package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 
 */

public class CExam {

	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV(true, 11, true);
		ctv.channelUp();
		ctv.display("캡쳐화면을 보여줍니다");
		
		CaptionTV ct = new CaptionTV(true, 7, false);
		ct.channelDown();
		ct.display("캡쳐화면을 보여줍니다");
		
		CaptionTV.su = 77;
		System.out.println(CaptionTV.su);
		System.out.println(++CTV.su);
	}
}