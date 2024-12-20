package exceptionhandlingpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoSix {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\arunm\\Downloads\\TutorialsNinja.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int a = 10/1;
			fis.read();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			System.out.println("fis got closed");
		}
		System.out.println("End of this program");

	}

}
