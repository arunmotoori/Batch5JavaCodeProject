package filehandlingpack;

import java.io.File;

public class DemoFour {
	
	public static void main(String[] args) {
		
		File folderOne = new File(System.getProperty("user.dir")+"\\Motoori");
		
		if(!folderOne.exists()) {
			folderOne.mkdir();
		}
	}

}
