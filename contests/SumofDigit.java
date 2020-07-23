package contest1;

import java.util.Scanner;

public class SumofDigit {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int N=scn.nextInt();
		int res = Sum(N);
		System.out.println(res);
		

}
	public static int Sum(int n) {
		int rem;
		 if(n==0)
			 return 0;
		 //self work
		 rem=n%10;
		 //call
		 int rv=rem+Sum(n/10);
		 return rv;
		
		
				 
	}
}