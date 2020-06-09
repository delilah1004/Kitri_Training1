package api08.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14~15.
 * @Description : Collection - Map - HashMap, Set
 * 
 * 키와 값이 쌍으로 이루어져 있다.
 * AbstractMap - HashMap
 */

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
		
		// key값으로 value값 출력
		System.out.println(map.get("fall"));
		
		System.out.println();
		
		// key 값을 추출해서 Set에 저장 및 출력
		Set<String> set = map.keySet();
		System.out.println(set);
		
		System.out.println();
		
		// Set에 저장된 key값 하나씩 출력
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		// Set에 저장된 key값을 통해 해당 value값 하나씩 출력
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println();
		
		HashMap<Integer, Double> hashMap = new HashMap<Integer, Double>();
		hashMap.put(10, 55.5);
		hashMap.put(20, 66.6);
		hashMap.put(30, 77.7);
		System.out.println(hashMap);
		
		System.out.println();
		
		Set<Integer> s = hashMap.keySet();
		Iterator<Integer> iterator = s.iterator();		// Iterator<Integer> iterator = hashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			double su = hashMap.get(iterator.next());
			System.out.print(su + "\t");
		}
		
		System.out.println("\n");
		
		
		// 추가
		hashMap.put(40, 88.8);
		System.out.println(hashMap);
		
		System.out.println();
		
		// 삭제
		hashMap.replace(10, 1000.0);
		System.out.println(hashMap);
		
		System.out.println();
		
		// 교체
		hashMap.remove(20);
		System.out.println(hashMap);
		
		System.out.println();

	}
}