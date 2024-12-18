package arryaspack;

public class SampleSix {
	
	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 7;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		int sum = 0;
		for(int i=0;i<ar.length;i++) {
			sum = sum + ar[i];
		}
		
		System.out.println(sum);
		
	}

}
