package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class DemoThree {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\arun.txt");
		
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File got created at the given path");
		}
		
	}

}
