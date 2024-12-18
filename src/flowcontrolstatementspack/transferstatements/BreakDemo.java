package flowcontrolstatementspack.transferstatements;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i); // 1 2 3 4 
		}

	}

}
