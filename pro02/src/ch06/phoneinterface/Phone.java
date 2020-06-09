package ch06.phoneinterface;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : interface - 스마트폰
 * 
 * interface는 public  키워드를 사용하여 선언한다.
 */

public interface Phone {
	
	// 제품명
	public void productName();
	
	
	// 전화송수신
	public void callSend();
	
	
	// 데이터 전송
	public void canData();
	
	
	// 리모컨 기능
	public void tvRemote();
	
}
