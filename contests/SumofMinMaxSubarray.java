package contest2;

import java.util.Scanner;

public class SumofMinMaxSubarray {
	static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			int Test = scn.nextInt();
		
			while (Test>0) {

				int n = scn.nextInt();
				int m = scn.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = scn.nextInt();
				}
				int res = maxminSubArraySum(arr,m);
				System.out.println(res);
				Test--;
			}
		}
		public static int maxminSubArraySum(int[] arr,int m) {
			int sum=0,min,total=0;
			int max;
			for(int i=0;i<arr.length;i++) {
				sum=0;
				min=Integer.MAX_VALUE;
				max=Integer.MIN_VALUE;
				if((i+m)>arr.length) 
				{
					return total;
				}
				for(int j=i,k=0;k<m && (i+m)<=arr.length;j++,k++) {
					if(arr[j]<min)
						min=arr[j];
					if(arr[j]>max)
						max=arr[j];
				}
				sum=(max+min);
				total+=sum;
				
			}
			
			
			return total;
		}
}
