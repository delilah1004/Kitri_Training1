package api08.Collection.List.ArrayList;

import java.util.ArrayList;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 14.
 * @Description : Collection - List - ArrayList
 * 
 * 객체를 직접 만들어서 ArrayList에 넣기
 */

public class ArrayList02 {
	public static void main(String[] args) {
		Data a = new Data(10, 20);
		Data b = new Data(30, 40);
		Data c = new Data(50, 60);
		
		ArrayList<Data> list = new ArrayList<Data>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		for(int i = 0; i < list.size(); i++) {
			Data d = list.get(i);
			d.yunsan();
			d.disp();
		}
		
		System.out.println();
		
		System.out.println(list.toString());		// toString() 생략 가능
		
		Data x = new Data(1, 2);
		x.yunsan();
		list.add(x);
		System.out.println(list);
		System.out.println();
		
		Data y = new Data(1000, 2000);
		y.yunsan();
		list.add(y);
		System.out.println(list);
		System.out.println();
		
		list.remove(1);
		System.out.println(list);
		System.out.println();
		
		for(Data data : list) {
			data.disp();
		}
	}
}