package ch04.object.pay;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 구현클래스 - 연봉
 */

public class Pay {
	public String name;
	public int salary;
	public int tax;
	public int net;
	
	public void input(String n, int b) {
		name = n;
		salary = b;
	}
	
	public void cal() {
		tax = (int) (salary*0.045+0.5);
		net = salary - tax;
	}
	
	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("세금 : " + tax);
		System.out.println("실수령액 : " + net + "\n");
	}
}
