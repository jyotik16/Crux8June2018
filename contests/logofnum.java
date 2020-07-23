package contest;

import java.util.Scanner;

class logofnum 
{
	static int Logn(int n, int b)
	{
		return (n > b - 1) ? 1 + Logn(n / b, b) : 0;
	}
	
	// Driver Code
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int b=scn.nextInt();
		 
		System.out.println(Logn(n, b));
	}
}
