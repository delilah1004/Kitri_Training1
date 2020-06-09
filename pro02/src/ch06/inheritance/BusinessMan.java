package ch06.inheritance;

public class BusinessMan extends BMan{
	private String company;
	private String position;
	
	public BusinessMan() { }
	
	public BusinessMan(String name, String company, String position) {
		super.name = name;
		this.company = company;
		this.position = position;
	}
	
	public void info() {
		empName();		// super, this 생략가능
		System.out.println("회사이름:" + company);
		System.out.println("직급:" + position);
	}
}