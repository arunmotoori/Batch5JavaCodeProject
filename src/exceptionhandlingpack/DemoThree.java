package exceptionhandlingpack;

public class DemoThree {

	public static void main(String[] args) {

		String str = null;
		try {
			System.out.println(str.length());
		} catch (Throwable e) {
			System.out.println("Exception got handled here");
		}

		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");

	}

}
