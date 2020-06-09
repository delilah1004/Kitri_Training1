package quiz.Class1;

class Employee {
	public String name;
	public int num;
	public int age;
	public String position;
	public String dept;
	public String level;
	
	public void input() {
		this.name = "홍길동";
		this.num = 123456;
		this.age = 32;
		this.position = "선임연구원";
		this.dept = "IT개발부서";
		this.level = "B";
	}
	
	public void output() {
		System.out.println(name + "\t" + num + "\t" + age + "\t" + position + "\t" + dept + "\t" + level);
	}
}

public class Quiz11 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.input();
		emp.output();
	}
}