package methodspack;

public class MethodsDemoSix {
	
	static int c = 15;  // global variable
	
	public static void main(String[] args) {
		int a = 5;   // Local variable
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
	
	public static void sampleOne() {
		int b = 10;  // Local variable
		System.out.println(b);
		//System.out.println(a);
		System.out.println(c);
	}

}
