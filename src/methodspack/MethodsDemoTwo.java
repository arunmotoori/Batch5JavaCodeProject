package methodspack;

public class MethodsDemoTwo {
	
	public static void main(String[] args) {
		System.out.println("Start of main method");
		sampleOne();
		System.out.println("End of main method");
	}
	
	public static void sampleOne() {
		System.out.println("start of sampleOne method");
		sampleTwo();
		System.out.println("end of sampleOne method");
	}
	
	public static void sampleTwo() {
		System.out.println("start of sampleTwo method");
		sampleThree();
		System.out.println("end of sampleTwo method");
	}
	
	public static void sampleThree() {
		System.out.println("Start of sampleThree method");
		System.out.println("end of sampleThree method");
	}

}
