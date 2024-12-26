package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class DemoFive {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\Motoori");
		File fi = new File(f,"Arun.txt");
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		if(!fi.exists()) {
			fi.createNewFile();
		}
	}

}
