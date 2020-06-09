package ch06.inheritance;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 7.
 * @Description : 오버라이딩
 */

class XX {
	public void disp() {
		System.out.println("disp Function");
	}
	
	@Override
	public String toString() {
		return "집에가자";
	}
}

class YY {
	public void setData(XX x) {
		x.disp();
		System.out.println(x.toString());		// 집에가자
	}
}

class ZZ {
	public void setData(Object obj) {
		// obj.disp();		// ERROR
		System.out.println(obj.toString());		// 집에가자
		
		XX x = (XX) obj;
		x.disp();
		System.out.println(x.toString());			// 집에가자
	}
}

public class IExam {
	public static void main(String[] args) {
		XX x = new XX();
		YY y = new YY();
		ZZ z = new ZZ();
		y.setData(x);
		z.setData(x);
	}
}
