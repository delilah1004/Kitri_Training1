package api08.Collection.Map;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 15.
 * @Description : Collection - Map - Properties
 */

public class PropertiesEx {
	public static void main(String[] args) throws Exception {
		
		// src가 아니라 클래스가 위치한 곳에서 data.properties를 가지고 오라는 명령어
		String path = PropertiesEx.class.getResource("data.properties").getPath();
		
		System.out.println(path);
		
		System.out.println();
		
		Properties pro = new Properties();
		pro.load(new FileReader(path));
		
		// Properties는 key값을 Object로 받음
		Iterator<Object> it = pro.keySet().iterator();
		while(it.hasNext()) {
			// System.out.println((String) it.next());  // key값 확인
			String key = (String) it.next();
			System.out.println(pro.get(key));
		}
	}
}