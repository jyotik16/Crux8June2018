package lec3_function;

import java.util.Scanner;

public class MeargesortRec {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ar = { 3, 8, 42, 11, 23, 1, 12 };
		int[] res = mergesort(ar, 0, ar.length - 1);
		for (int val : res) {
			System.out.print(val + " ");
		}

	}

	public static int[] mergesorted(int[] one, int[] two) {
		int[] merged = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}

		}
		if (j == two.length) {
			while (i < one.length) {
				merged[k] = one[i];
				i++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				merged[k] = two[j];
				j++;
				k++;
			}

		}
		return merged;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;

		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);
		int[] merged = mergesorted(fh, sh);
		return merged;
	}
}
