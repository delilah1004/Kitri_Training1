package quiz.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz23 {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 1; i <= 20; i++) {	
			array.add(i);
		}
		
		Iterator<Integer> it = array.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}
}