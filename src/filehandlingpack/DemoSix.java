package filehandlingpack;

import java.io.File;

public class DemoSix {
	
	public static void main(String[] args) {
		
		File file = new File(System.getProperty("user.dir")+"\\Motoori");
		
		boolean a = file.isFile();
		System.out.println(a);
		
		boolean b = file.isDirectory();
		System.out.println(b);
		
		if(file.exists()) {
			file.delete();
		}
		
	}

}
