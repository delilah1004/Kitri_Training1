package ch05.object.saram;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 구현 클래스 - 개인정보
 */

public class Saram {
	private String name;
	public String address;
	public String phoneNumber;
	public String juminBunho;
	
	public void input(String a, String b, String c, String d) {
		name = a;
		address = b;
		phoneNumber = c;
		juminBunho = d;
	}
	
	public void output() {
		System.out.println(name + "\t" + address + "\t" + phoneNumber + "\t" + juminBunho);
	}
	
	
	
	
	
	
	
	
	
	
}