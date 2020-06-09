package thread10.Notify;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : 자판기 예제
 */

public class DrinkEx {
	public static void main(String[] args) {
		
		AutoMachine machine = new AutoMachine();		// 공유 객체 (공유 데이터)
		Manager manager = new Manager(machine);				// 생산자
		
		Consumer lee = new Consumer(machine, "이다은");
		Consumer kim = new Consumer(machine, "김기동");
		Consumer park = new Consumer(machine, "박현서");
		
		manager.start();
		
		lee.start();
		kim.start();
		park.start();

	}
}