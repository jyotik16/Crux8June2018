package contest1;

import java.util.Scanner;

public class AlphaScore {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		int a = 0;
		long[] arr = new long[N];
		long[] brr = new long[N];

		while (a < N) {
			arr[a] = scn.nextLong();
			a++;
		}
		for (int i = 0; i < arr.length; i++) {
			long sum = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i])
					sum += arr[j];
			}
			brr[i] = sum;
		}
		long res = 0;
		for (int i = 0; i < brr.length; i++) {
			// System.out.println(brr[i]);
			res += brr[i];
		}

		System.out.println(res % (1000000007));

	}
}