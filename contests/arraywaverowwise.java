package contest;
import java.util.Scanner;
public class arraywaverowwise {
	public static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			
			int[][] arr = takeinput(n,m);
			display(arr,n,m);
			System.out.println();
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
		}public static void display1(int[][] arr,int n,int m) {
			
			for (int i=0; i < n; i++) {
				if(i%2==0)
				{
					for(int j=0; j <m ; j++)
					{
					System.out.print(arr[i][j]+", ");
					}
					
				}
				else
				{
					for(int j=m-1;j>=0 ; j--)
					{
					
					System.out.print(arr[i][j]+", ");
					}
					
				}
				
			}
			System.out.println("END");
		}
	}



