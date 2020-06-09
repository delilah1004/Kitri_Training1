package ch01.dataType;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 27.
 * @Description : 2) 단항 연산자 : !, ~, +/-, ++/--(전위형 증감 연산자), (cast) 또는 (자료형)
 */

public class Exam03 {

	public static void main(String[] args) {
		System.out.println("증감 연산자");
		
		int x = 10;
		++x;
		x++;
		System.out.println(x);
		
		--x;
		x--;
		System.out.println(x);

		int y = 10;
		int z = ++y;
		System.out.println(y + "\t" + z);
		
		int a =10;
		int b = a++;
		System.out.println(a + "\t" + b);
		
		int i=10;
		int j=20;
		int k = ++i + ++j;
		System.out.println(k + "\t" + i + "\t" + j + "\n");
		
		System.out.println("CAST(자료형) 연산자");
		
		byte su = 10;				// 같은 byte형에 담아주는 것이 가장 인상적이지만 byte 보다 큰 자료형에 담아줘도 된다.
		short value = su;		// byte, short, int, long
		
		int r = 77;
		int rr = r;						
		System.out.println(rr);
		
		float su1 = 55.5f;
		int su2 = 66;
		float result1 = su1 + su2;
		System.out.println(result1);
		
		int result2 = (int) su1 + su2;
		System.out.println(result2);
		
		int w = 10;
		int q = 3;
		float result3 = (float)w/q;
		System.out.println(result3);
		
		System.out.println("W:" + w);
		System.out.println(w + q);
		System.out.println(w + " " + q);
		System.out.println("출력 :" + w + q);
		System.out.println("합계:" + (w+q));
		
		int p=10;
		System.out.println("p:" + p++);		// ("p:" + ++p)
		System.out.println(p);
	}
}
