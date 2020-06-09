package quiz.Interface;

interface Soundable {
	public String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}

public class Quiz08 {
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}