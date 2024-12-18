package stringpack;

public class DemoFour {
	
	public static void main(String[] args) {
		
		String str = "I love Java programming.";
		String s = "Python";
		
		if(str.indexOf(s)!=-1) {
			System.out.println(s+" is avaiable in "+str);
		}else {
			System.out.println(s+" is not available in "+str);
		}
		
		
//		int i = str.indexOf('J');
//		System.out.println(i);
//		
//		int a = str.indexOf('b');
//		System.out.println(a);
//		
//		int b = str.indexOf("Java");
//		System.out.println(b);
//		
//		int c = str.indexOf("Python");
//		System.out.println(c);
		
	}

}
