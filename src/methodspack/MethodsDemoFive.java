package methodspack;

public class MethodsDemoFive {
	
	public static void main(String[] args) {
		int s = sampleOne(5,4);
		System.out.println(s);
		String name = sampleTwo();
		System.out.println(name);
		
		System.out.println(sampleOne(9,3));
		System.out.println(sampleTwo());
	}
	
	public static int sampleOne(int a,int b) {
		int c;
		c = a+b;
		return c;
	}
	
	public static String sampleTwo() {
		return "Arun Motoori";
	}

}
