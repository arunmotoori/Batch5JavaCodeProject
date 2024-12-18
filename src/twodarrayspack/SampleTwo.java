package twodarrayspack;

public class SampleTwo {
	
	public static void main(String[] args) {
		 
		int[][] td = {{9,5,7,2},{6,3,8,1},{9,6,3,5}};
		
		for(int[] sd : td) {
			for(int ae : sd) {
				System.out.println(ae); // 9 5 7 2 6 3 8 1 9 6 3 5
			}
		}
		
		System.out.println("------------------");
		
		for(int r=0;r<3;r++) {  // 3 
			for(int c=0;c<4;c++) { // 4
				System.out.println(td[r][c]); // 9 5 7 2 6 3 8 1 9 6 3 5 
			}
		}
		
	
	}

}
