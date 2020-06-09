package api08.Collection.List.ArrayList;

import java.util.ArrayList;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - ArrayList
 * 
 * 컬렉션은 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
 * java.util 패키지 관련된 인터페이스와 클래스를 포함시켜 놓은 것이다.
 * 이를 총칭해서 컬렉션 프레임워크라고 부른다.
 * 
 * Collection의 3가지 방식 - List, Set, Map
 * 1) List - ArrayList, Vector, LinkedList, Stack, Queue ...
 * 2) Set - HashSet, TreeSet, ...
 * 3) Map - HashMap, HashTable, TreeMap, Properties, ...
 * 
 * Stack - FILO - 웹사이트 뒤로가기 기능, ctrl+z 기능
 * Queue - FIFO - 프린터기
 * 
 */

public class ArrayList01 {
	public static void main(String[] args) {
		String a = "apple";
		String b = "banana";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		list.add("JSP");
		list.add("Oracle");
		
		System.out.println("저장개수 : " + list.size());
		System.out.println("2번지 객체 얻기 : " + list.get(2));
		System.out.println();
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		
		System.out.println();
		
		
		// 추가
		list.add("마지막");
		list.add(1, "pineapple");
				
		// 특정번지 추가
		list.add(1, "바나나");
		
		
		System.out.println();
		
		
		// 교체
		list.set(3, "안녕하세요");
		System.out.println(list.toString());		// toString() 생략가능
		
		
		System.out.println();
		
		
		// 삭제
		list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list);
		
		
		System.out.println();
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();		// ArrayList에 정수를 넣으려면 int가 아니라 Integer로 넣어야한다.
		arr.add(10);			// 10 정수 -> new Integer(10) : AutoBoxing
		arr.add(20);
		System.out.println(arr);
		
		
		System.out.println();
		
		
		ArrayList<Object> brr = new ArrayList<Object>();	
		brr.add(22.2);		
		brr.add(10);	
		brr.add("apple");	
		brr.add('A');	
		
		System.out.println(brr);
		
		
		System.out.println();
		
		
		
		
		
	}
}