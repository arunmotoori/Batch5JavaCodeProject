package overloadingpack;

public class Sample {
	
	public void add(int a,int b) {
		System.out.println("Adding Two numbers");
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Adding Three numbers");
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println("Adding Four numbers - 1");
		System.out.println(a+b+c+d);
	}
	
	public void add(int a,int b,int c,double d) {
		System.out.println("Adding Four numbers - 2");
		System.out.println(a+b+c+d);
	}

}
