package contest1;

import java.util.Scanner;

public class MaximumSubarraySum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int Test = scn.nextInt();
		
		while (Test>0) {

			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				//arr[i] = scn.nextInt();
				arr[i] = i;
			}
			int res1= maxSubArraySumNeg(arr, arr.length);
			int res = solveUsingDp(arr,arr.length);
			System.out.println(res1);
			System.out.println(res);
			
			Test--;
		}
	}

	static int maxSubArraySum(int a[]) {
		int size = a.length;
		int max_far = Integer.MIN_VALUE, max_ending = 0;

		for (int i = 0; i < size; i++) {
			max_ending = max_ending + a[i];
			if (max_far < max_ending)
				max_far = max_ending;
			if (max_ending < 0)
				max_ending = 0;
		}
		return max_far;
	}

	public static int maxSubArraySumNeg(int[] a, int size) {
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	public static int solveUsingDp(int[] a, int n) {
		int[] dp = new int[n];
		dp[0] = a[0];
		int big = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + a[i], a[i]);
			if (dp[i] > big)
				big = dp[i];
		}
		return big;
	}
}

/*
 * 2 
 * 7 8 -8 9 -9 10 -11 12 
 * 7 8 -8 9 -9 10 -11 12
 * -2, -3, 4, -1, -2, 1, 5, -3
 */
