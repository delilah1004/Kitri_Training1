package thread01.Basic;

import javax.swing.JOptionPane;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 20.
 * @Description : Ex02 - 화면 띄워주는 자식 스레드
 */

public class InputThread extends Thread {

	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("10초안에 값을 입력하세요.");
		
		if(input!=null) 
			SubThread.inputCheck = true;
		
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
	
}