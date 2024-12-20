package exceptionhandlingpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoFive {
	
	public static void main(String[] args)  {
		
		File file = new File("C:\\Users\\arunm\\Downloads\\abc\\TutorialsNinja.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			//System.out.println("FileNotFoundException got handled here");
		}
		System.out.println("End of this program");
		
	}

}
