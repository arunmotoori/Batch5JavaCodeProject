package exceptionhandlingpack;

public class DemoSeven {
	
	public static void main(String[] args) throws Exception {
		
		int age = 15;
		
		if(age<=10) {
			System.out.println("You are allowed to this park");
		}else {
			throw new Exception("Your age is greater than 10. Only children are allowed to this park.");
		}
		
		System.out.println("End of this program");
		
		
	}

}
