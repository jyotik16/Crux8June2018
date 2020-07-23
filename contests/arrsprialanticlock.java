package contest;

import java.util.Scanner;

public class arrsprialanticlock {
	
		public static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
					
			int r = scn.nextInt();
			int c = scn.nextInt();
			int[][] arr=takeinput(r,c);
			display(arr,r,c);
			spiralPrint(r,c,arr);
		}
		public static int[][] takeinput(int n,int m) {

			int[][] ar = new int[n][m];
			for (int i = 0; i <n; i++) {
				for(int j=0;j <m; j++)
					{
					ar[i][j] = scn.nextInt();
				}
			}
			return ar;
		}

	static void spiralPrint(int r, int c, int a[][])
	{
		int i, k = 0, l = 0;
		 while (k < r&& l < c) {
			
		for (i = k; i < r; ++i) {
				System.out.print(a[i][k] + ", ");
			}
			l++;

			
			for (i = l; i < c; ++i) {
				System.out.print(a[r-1][i] + ", ");
				}
			r--;
			
			
			if (l < c) { 
			for (i = r - 1; i >= k; --i) {
				System.out.print(a[i][c-1] + ", ");
					}
			c--;
			}
			
			if (k < r) {
				for (i = c - 1; i >= l; --i) {
					System.out.print(a[k][i] + ", ");
				}
				k++;
			}
		 }					
		 System.out.print("END");						
	}
	public static void display(int[][] arr,int n,int m) {
		for (int i = 0; i <n; i++) {
			for(int j=0;j <m; j++)
				{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
