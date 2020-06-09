package api10.Exception;

/**
 * @Author : 이다은
 * @Date : 2020. 5. 18.
 * @Description : 예외 처리 - ClassCastException
 */

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class Ex06 {

	public static void changeAnimal(Animal animal) {
		
		/*
		 * if(animal instanceof Dog) { Dog dog = (Dog) animal; } else if (animal
		 * instanceof Cat) { Cat cat = (Cat) animal; }
		 */
		
		try {
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			System.out.println("다운캐스팅이 잘못되었습니다.");
		}
	}

	public static void main(String[] args) {

		Dog dog = new Dog();
		changeAnimal(dog);

		Cat cat = new Cat();
		changeAnimal(cat);

	}
}