package methodspack;

public class MethodsDemoFour {
	
	public static void main(String[] args) {
		sample();
		sampleTwo("Arun Motoori");  // argument
		sampleThree(5,4);
		sampleFour(9,"Varun Dhawan");
	}
	
	public static void sample() {
		System.out.println("Inside sample method");		
	}
	
	public static void sampleTwo(String name) {  // parameter
		System.out.println(name);
	}
	
	public static void sampleThree(int a,int b) {  // 2 parameters
		System.out.println(a+b);
	}
	
	public static void sampleFour(int a,String b) {
		System.out.println(a);
		System.out.println(b);
	}

}
