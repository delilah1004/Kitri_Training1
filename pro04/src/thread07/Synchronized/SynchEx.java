package thread07.Synchronized;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 21.
 * @Description : Synchronized 적용하지 않았을 때
 */

public class SynchEx extends Thread {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();			// 공유객체
		
		Hong hong = new Hong();
		hong.setCalculator(calculator);
		hong.start();
		
		Cho cho = new Cho();
		cho.setCalculator(calculator);
		cho.start();
		
	}
}