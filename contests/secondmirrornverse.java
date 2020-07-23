package contest;

import java.util.Scanner;

public class secondmirrornverse {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		int[] brr = takeinput(n);
		mirrorinverse(arr,brr);
	}

	public static int[] takeinput(int size) {
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			
			ar[i] = scn.nextInt();
		}
		return ar;
	}
	public static void mirrorinverse(int[] arr,int[] brr) {
		int len=arr.length;
		int t = 0;
		for (int k = 0; k < arr.length; k++) {
			int p = arr[k];
			if (k == brr[p]) {
				t++;
			} 
			else {
				t--;
			}
			
		}

		if (t == len)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
