package finalmodifierpack;

public class Sample {
	
	int num = 9;
	static int wheels = 4;
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		System.out.println(sample.num);
		sample.demo();
		
	}
	
	public void demo() {
		System.out.println("Inside demo method");
		System.out.println(num);
		System.out.println(wheels);
		demoTwo();
		demoThree();
	}
	
	public static void demoTwo() {
		System.out.println("Inside demo2 method");
	}
	
	public void demoThree() {
		System.out.println("Inside demo3 method");
	}

}
