package contest;

import java.util.Scanner;

public class rotateimage {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = takeinput(n,m);
		display(arr,n,m);
		display1(arr,n,m);
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
	public static void display(int[][] arr,int n,int m) {
		for (int i = 0; i <n; i++) {
			for(int j=0;j <m; j++)
				{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void display1(int[][] arr,int n,int m) {
		for (int i = n-1; i>=0; i--) {
			
			for(int j=0;j <m; j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
}
