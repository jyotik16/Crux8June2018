package contest1;

import java.util.Scanner;

public class CalculateTheSum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		long a = 1, res = 0;
		int N = scn.nextInt();
		long[] ar = new long[N];
		// array
		for (int i = 0; i < N; i++)
			ar[i] = scn.nextLong();
		int op = scn.nextInt(); // no of operation
		while(a<=op)
		{
			int X=scn.nextInt();
			a++;
		}
		res=sum(ar);
		res=res*(long)Math.pow(2,op);
		System.out.print(res%1000000007);

	}
	public static long sum(long[] ar) {
		long sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=ar[i]+sum;
		}
		return sum;
	}

	/*public static long Sum(long[] ar, int x) {
		long[] br = new long[ar.length];
		long sum = 0;
		for (int i = 0; i < ar.length; i++) {
			int j = i - x;
			if (j < 0)
				j = j + ar.length;
			else
				j = i - x;
			br[i] = ar[i] + ar[j];
			System.out.print("  " + br[i]);
			sum = sum + br[i];
		}
		return sum;
	}*/

}
