package api08.Collection.List;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - Vector
 * 
 * [ ArrayList와 Vector의 차이점 ]
 * ArrayList보다 속도가 빠르고,
 * Vector가 스레드 동기화 처리에 더 적당하지만, ArrayList도 Collections.synchronizedList()로 동기화 처리 가능
 */

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		System.out.println(vector.get(2));
		System.out.println(vector);
		
		System.out.println();
		
		vector.add(50);
		vector.add(2, 77);
		vector.set(1, 99);
		vector.remove(2);
		System.out.println(vector);
		
		for(int i = 0; i < vector.size(); i++) {
			int su = vector.get(i);
			System.out.println(su);
		}
		System.out.println();
		
		for(Integer su : vector) {
			System.out.println(su);
		}
		System.out.println();
		
		
	}
}