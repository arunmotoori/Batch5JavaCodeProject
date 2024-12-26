package filehandlingpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class SampleTwo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\sone.txt");
	
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String s = br.readLine();
		
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();

		
//		FileInputStream fis = new FileInputStream(file);
//		
//		int n = fis.read();
//		
//		while(n!=-1) {
//			System.out.print((char)n);
//			n = fis.read();
//		}
//		
//		fis.close();
		
//		FileReader fr = new FileReader(file);
//		
//		int n = fr.read();
//		
//		while(n!=-1) {
//			System.out.print((char)n);
//			n = fr.read();
//		}
//		
//		fr.close();
		
	}

}
