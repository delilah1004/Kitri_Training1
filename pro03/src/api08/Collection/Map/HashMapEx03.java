package api08.Collection.Map;

import api08.Collection.List.ArrayList.Data;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Collection - Map - HashMap
 * 
 * iterator
 */

public class HashMapEx03 {
	public static void main(String[] args) {
		Data a = new Data(1, 2);
		Data b = new Data(3, 4);
		Data c = new Data(5, 6);
		
		HashMap<String, Data> map = new HashMap<String, Data>();
		map.put("one", a);
		map.put("two", b);
		map.put("three", c);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			Data data = map.get(it.next());
			data.yunsan();
			data.disp();
		}
		
		System.out.println();
		
		map.put("four", new Data(77, 88));
		map.replace("two", new Data(100, 200));
		map.remove("one");
		System.out.println(map);
		
		System.out.println();
		
		it = map.keySet().iterator();
		while(it.hasNext()) {
			Data data = map.get(it.next());
			data.yunsan();
			data.disp();
		}
	}
}