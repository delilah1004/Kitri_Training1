package ch06.phoneinterface;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 구현 클래스 - 스마트폰(LPhone)
 */

public class LPhone implements Phone {
	
	@Override
	public void productName() {
		System.out.println("[ Lphone ]");
	}

	@Override
	public void callSend() {
		System.out.println("전화 송수신이 가능합니다.");
	}

	@Override
	public void canData() {
		System.out.println("3G 가능합니다.");
	}

	@Override
	public void tvRemote() {
		System.out.println("리모컨이 탑재되어 있습니다.");
	}
}