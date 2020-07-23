package contest;

import java.util.Scanner;

public class allarmstrong {
static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int i=n1;
		while (i <= n2) {
			int m;
			m = i;
			int res = checkarmstrong(m, m);
			if (res != -1)
				System.out.println(res);
			i++;
		}

	}

	public static int checkarmstrong(int n, int m) {
		int rem=0, sum = 0;
		while (n != 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if (sum == m) {
			return sum;
			// System.out.println("true");
		} 
		else {// System.out.println("false");
			return -1;
		}
	}
}