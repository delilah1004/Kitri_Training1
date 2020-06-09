package ch06.phoneinterface;

 /**
 * @Author : 이다은
 * @Date : 2020. 5. 8.
 * @Description : 실행 클래스 - 스마트폰
 * 
 * 시나리오
 * 1) 스마트폰의 모델 스펙은 제품명, 전화송수신, 3G&LTE&5G, TV리모컨기능 이 있다.
 * 2) Lphone은 (Lphone, 가능, 3G, 탑재)
 * 2) Sphone은 (Sphone, 가능, LTE, 탑재)
 * 2) Iphone은 (Iphone, 가능, 5G, 미탑재)
 */

public class PhoneMain {
	public static void main(String[] args) {
		Phone[] array = new Phone[3];
		
		array[0] = new LPhone();
		array[1] = new SPhone();
		array[2] = new IPhone();
		
		for(int i = 0; i < array.length; i++) {
			array[i].productName();
			array[i].callSend();
			array[i].canData();
			array[i].tvRemote();
			System.out.println();
		}
	}
}