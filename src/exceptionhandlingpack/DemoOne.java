package exceptionhandlingpack;

public class DemoOne {

	public static void main(String[] args) {
		
		try {
			int a = 5/0;   // new ArithmeticException();
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception got handled here");
		}catch(Exception e) {
			System.out.println("Exception got handled here");
		}catch(Throwable e) {
			System.out.println("Exception got handled here");
		}
	
		System.out.println("Arun");
		System.out.println("Motoori");
		System.out.println("Selenium Java Training");
		
	}

}
