package quiz.Class1;

class Person {
	public int age;
	
	public void input(int age) {
		this.age = age;
	}
}

public class Quiz07 {
	public static void main(String[] args) {
		Person a = new Person();
		a.input(17);
	}
}