package thread10.Notify;

import java.util.Stack;

public class AutoMachine {
	
	private Stack<String> drinks = new Stack<String>();

	// synchronized 음료수를 채우고 뽑아먹는 메소드를 번갈아가면서 실행한다.

	public synchronized void setDrink(String drink) {
		
		if(!drinks.isEmpty()) {		// 음료가 채워지면 음료수를 꺼내먹을 수 있게 한다.
			notify();
		}
		
		drinks.push(drink);
		
		System.out.println("음료 추가 - 현재 음료수 " + getNumber() + "개");
	}

	public synchronized String getDrink() {
		
		while (drinks.isEmpty()) {		// 음료수가 없으면 채워질 때까지 기다려야 한다.
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return drinks.pop();
	}
	
	public String getNumber() {
		return String.valueOf(drinks.size());
	}

}
