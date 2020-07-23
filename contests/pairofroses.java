package contest;
import java.util.Arrays;
import java.util.Scanner;
public class pairofroses {
	
  static Scanner scn = new Scanner(System.in);
  
	public static void main(String[] args) {
		int t = scn.nextInt();
		int i = 1;
		while (i <= t) {
			int N = scn.nextInt();
			int j = 0;
			int[] ar = new int[N];
			// prices of roses
			while (j < N) {
				ar[j] = scn.nextInt();
				j++;
			}
			Arrays.sort(ar);
			// money
			int M = scn.nextInt();
			if(c==0) 
			{
				System.out.println(); check(ar, M); c++; 
			}
			else
				check(ar, M);
			
			i++;
		}

	}
	static int c=0;
	public static void check(int[] ar, int M) {
		int   diff=Integer.MAX_VALUE;
		int[] res=new int[2];
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i + 1; j < ar.length ; j++) {
				
				if ((ar[i] + ar[j]) == M ) {
					if (diff > ar[j] - ar[i]) {
						diff = ar[j] - ar[i];
						res[0] = ar[i];
						res[1] = ar[j];
					}
					
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + res[0] + " and " + res[1]+".");
		
	}
	
}
	
	

