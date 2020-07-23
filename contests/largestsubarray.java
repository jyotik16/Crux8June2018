package contest;

import java.util.Scanner;

public class largestsubarray {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int t = scn.nextInt();
		int i, j, k, max;
		int c1, c0,a,b;

		while (t != 0) {
			
			a=0; b=0; max=Integer.MIN_VALUE;
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			for (i = 0; i < n-1 ; i++) {
				for (j = n-1; j > i; j--) {
					c0 = 0;	c1 = 0;

					for (k = i; k <= j; k++)

					{
						if (arr[k] == 1)
							c1++;

						else
							c0++;

					}

					if (c0 == c1) {
						if (j - i > max) {
							max = j - i;
							a = i;
							b = j;

						}

						else if (j - i == max) {
							if (arr[i] == 1) {
								max = j - i;
								a = i;
								b = j;
							}
						}

					}
				}

			}

		t--;
		
		if (a == 0 && b == 0)
			System.out.println("None");
		else
			System.out.println(a + " " + b);
		}
	}
}
