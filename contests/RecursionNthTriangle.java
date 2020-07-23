package contest1;

import java.util.Scanner;

public class RecursionNthTriangle {
	 static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
		
			int N = scn.nextInt();
			int res = Sum(N);
			System.out.println(res);

}
		public static int Sum(int n) {
			
			 if(n==0)
				 return 0;
			 
			 //call
			 int rv=n+Sum(n-1);
			 return rv;
			
			
					 
		}
}