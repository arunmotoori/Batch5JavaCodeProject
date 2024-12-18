package overloadingpack;

public class Animal {
	
	public Animal() {
		System.out.println("Zero parameters");
	}
	
    public Animal(int a) {
		System.out.println("One parameter of int type");
	}
    
    public Animal(double a) {
		System.out.println("One parameter of double type");
	}
    
    public Animal(int a,int b) {
		System.out.println("Two parameters");
   	}

}
