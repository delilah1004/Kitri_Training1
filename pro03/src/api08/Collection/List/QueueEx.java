package api08.Collection.List;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - Queue/LinkedList
 */

import java.util.Queue;
import java.util.LinkedList;

public class QueueEx {
	public static void main(String[] args) {
		// Queue
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll() + "   " + queue.size());
		}
		
		System.out.println();
		
		// LinkedList
		LinkedList<Integer> link = new LinkedList<Integer>();
		
		link.offer(77);
		link.offer(88);
		link.offer(99);
		link.offer(100);
		
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		
		System.out.println();

		link.addFirst(1);
		link.addFirst(2);
		System.out.println(link.toString());
		
		System.out.println();
		
		link.removeFirst();
		link.removeLast();
		System.out.println(link.toString());
		

		
	}
}