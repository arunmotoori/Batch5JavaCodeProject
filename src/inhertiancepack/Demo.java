package inhertiancepack;

public class Demo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.eat();
		animal.sleep();
		
        Animal a = new Dog();
		
		a.eat();
		a.sleep();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sleep();

	}

}
