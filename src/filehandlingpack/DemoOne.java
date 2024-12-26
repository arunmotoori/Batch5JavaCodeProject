package filehandlingpack;

import java.io.File;

public class DemoOne {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\arunm\\Downloads\\abc.txt");
		boolean b = file.exists();
		System.out.println(b);
		
	}

}
