package ch05.object.test;

/**
 * @Author : 이다은
 * @Date : 2020. 4. 29.
 * @Description : 
 */

class Birthday {
	private int year;
	private int month;
	private int day;
	private String name;
	
	public Birthday(int year, int month, int day, String name) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.name = name;
	}

	public void disp() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(name);
	}
	
}

public class Exam22 {
	public static void main(String[] args) {
		
		Birthday birthday = new Birthday(2020, 04, 29, "이다은");
		birthday.disp();

	}
}