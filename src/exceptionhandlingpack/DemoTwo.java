package exceptionhandlingpack;

public class DemoTwo {
	
	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 7;
		
		try {
			ar[3] = 11;  
		}catch(Throwable e) {
			System.out.println("Exception got handled here");
		}
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
	}

}
