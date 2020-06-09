package api08.Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Collection - Set - HashSet, TreeSet
 * 
 * List : Index값 / 중복값 처리 가능, 저장 순서 유지된다.
 * Set : 수학에서의 집합 / 중복값 처리 불가능, 저장 순서 유지되지 않는다.
 * Map : Key, Value / 중복값 처리 가능, 중복 키 불가능, 저장 순서 유지되지 않는다.
 */

public class SetEx01 {
	public static void main(String[] args) {
		
		// 중복값은 무시한다.
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("strawberry");
		set.add("apple");
		System.out.println(set);
		
		System.out.println();
		
		// 특정값 삭제
		set.remove("apple");
		System.out.println(set);
		
		System.out.println();
		
		// 전체 삭제
		set.clear();
		System.out.println(set);
		
		System.out.println();
		
		// 다양한 객체로 이루어진 HashSet
		HashSet<Object> obj = new HashSet<Object>();
		obj.add(10);
		obj.add(24.5f);
		obj.add("apple");
		System.out.println(obj);
		
		System.out.println();
		
		
		// 순차 접근해서 객체를 리턴하는 클래스 (반복자) : Iterator
		Iterator<Object> it = obj.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");		// Object로 출력
		}
		
		System.out.println("\n");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("melon");
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + "\t");
		}
		
		System.out.println("\n");
		
	}
}