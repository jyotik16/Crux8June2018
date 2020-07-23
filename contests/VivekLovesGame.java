package contest2;

import java.util.Scanner;

public class VivekLovesGame {
	static Scanner scn = new Scanner(System.in);
	    public static void main(String[] args) {
					
			int t = scn.nextInt();
			for (int p = 1; p <= t; p++) {

				int n = scn.nextInt();
				long[] arr = new long[n];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = scn.nextLong();
				}
  
				System.out.println(split(arr,0,n));
			}
			

		}


	public static int split(long[] arr, int lo, int hi) {
		long sum1 = 0; int ans=0;
		long sum2 = 0;
		if(lo > hi)
			return 0;
		for (int i = lo; i < hi; i++) {
				sum1 = 0; sum2 = 0 ;
			for (int j = lo; j <=i; j++)
				sum1 += arr[j];
			
			for (int j = i + 1; j <hi; j++)
				sum2 += arr[j];
			
			if (sum1 == sum2) {
				int ans1 = split(arr, lo, i);
				int ans2 = split(arr, i + 1, hi);

				 return ans = Math.max(ans1, ans2) +1;
			}
			
		}
		return ans;

	}
}

