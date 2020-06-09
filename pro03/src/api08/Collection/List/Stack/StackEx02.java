package api08.Collection.List.Stack;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - Stack
 * 
 * 객체를 직접 만들어서 Stack에 넣기
 */

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {
		Stack<Coin> coin = new Stack<Coin>();
		coin.push(new Coin(100));
		coin.push(new Coin(50));
		coin.push(new Coin(70));
		coin.push(new Coin(60));
		
		while(!coin.isEmpty()) {
			Coin c = coin.pop();
			System.out.println(c.getValue());
		}
	}

}
