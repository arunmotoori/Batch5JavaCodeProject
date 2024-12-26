package filehandlingpack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleOne {

	public static void main(String[] args) throws IOException {

		File file = new File(System.getProperty("user.dir") + "\\sone.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileOutputStream fos = new FileOutputStream(file);
		String text = "My name is Arun Motoori.\nI love Java programming.\nJava is one of the most popular programming languages in the market.";
		fos.write(text.getBytes());
		fos.flush();
		fos.close();

//		PrintWriter pw = new PrintWriter(file);
//		pw.println("My name is Arun Motoori.");
//		pw.println("I love Java programming.");
//		pw.print("Java is one of the most popular programming languages in the market.");
//		pw.flush();
//		pw.close();

//		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//		bw.write("My name is Arun Motoori.");
//		bw.newLine();
//		bw.write("I love Java programming.");
//		bw.newLine();
//		bw.write("Java is one of the most popular programming languages in the market.");
//		bw.flush();
//		bw.close();

//		FileWriter fw = new FileWriter(file);
//		fw.write("My name is Arun Motoori.\n");
//		fw.write("I love Java programming.\n");
//		fw.write("Java is one of the most popular programming languages in the market.");
//		fw.flush();
//		fw.close();

		System.out.println("End of this program");

	}

}
