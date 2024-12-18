package modifierspackb;

import modifierspacka.Animal;

public class DemoB {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.name = "Rocky";
		System.out.println(animal.name);
		animal.eat();

	}

}
