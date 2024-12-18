package stringpack;

public class DemoThree {
	
	 public static void main(String[] args) {
		
		 String str1 = "Arun";
		 String str2 = "Motoori";
		 String str3 = "Arun";
		 String str4 = "           Arun Motoori          ";
		 
		 boolean a = str1.equals(str2);
		 System.out.println(a);
		 
		 boolean b = str1.equals(str3);
		 System.out.println(b);
		 
		 int s = str2.length();
		 System.out.println(s);
		 
		 String m = str1.substring(1);
		 System.out.println(m);
		 
		 String n = str2.substring(2,4);
		 System.out.println(n);
		 
		 System.out.println(str4);
		 
		 String k = str4.trim();
		 System.out.println(k);
		 
	}

}
