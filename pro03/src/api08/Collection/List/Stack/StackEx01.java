package api08.Collection.List.Stack;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - Stack
 */

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();			// FILO
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());		// 30
		System.out.println(stack.pop());		// 20
		System.out.println(stack.pop());		// 10
		// System.out.println(stack.pop());		// ERROR
		
		Stack<String> strStack = new Stack<String>();
		strStack.push("사과");
		strStack.push("배");
		strStack.push("바나나");
		
		while(!stack.isEmpty()) {
			System.out.println();
		}
		// System.out.println(stack.pop());		// ERROR

		
	}
}