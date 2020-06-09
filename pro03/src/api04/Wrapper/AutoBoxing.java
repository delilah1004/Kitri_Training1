package api04.Wrapper;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 13.
 * @Description : Wrapper 클래스
 * 
 * 기본타입(byte ~~ double, boolean) 값을 포장하는 객체
 */

public class AutoBoxing {
	public static void main(String[] args) {
		// 업데이트 이후 Boxing, UnBoxing이 다 Auto로 바뀜
		
		// int : 자료형, Integer : 객체
		
		int su = 10;
		Integer obj = su;			// AutoBoxing
		System.out.println(obj.toString());
		
		int value = obj;				// AutoUnBoxing
		System.out.println(value);
		
		int hap = obj + 100;		// AutoUnBoxing
		System.out.println(hap);
		
		System.out.println("----------");
		
		Integer a = 20;				// AutoBoxing	-128 ~ 127 의 수는 주소를 공유한다.
		Integer b = 20;				// AutoBoxing	Integer b = new Integer(20), a = 0x100, b=0x100
		System.out.println("주소값비교 : " + (a==b));
		System.out.println(a.equals(b));
		
		System.out.println();
		
		Integer c = 300;				// Integer c = new Integer(300)
		Integer d = 300;				// Integer d = new Integer(300)
		System.out.println("주소값비교 : " + (c==d));
		System.out.println(c.equals(d));
		
		System.out.println("----------");
		
		
		if(a==b) {						// AutoBoxing	a==b  ->  a.equals(b)
			System.out.println('T');
		} else {
			System.out.println('F');
		}
		
		if(a.equals(b)) {
			System.out.println('T');
		} else {
			System.out.println('F');
		}
		
		// Boxing - 이제 안씀
		int y = 10;
		Integer x = new Integer(y);		
		int z = x.intValue();

	
	}
}