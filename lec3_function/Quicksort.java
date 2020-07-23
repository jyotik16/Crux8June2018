package lec3_function;

import java.util.Scanner;

public class Quicksort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ar = { 1,3 ,5,8,2,4};
		Quicksorted(ar, 0, ar.length - 1);
		for (int val : ar) {
			System.out.print(val + " ");
		}

	}
	public static void Quicksorted(int[] arr,int lo,int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int L = 0;
		int R = hi;
		while (L < R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				int temp = arr[R];
				arr[R] = arr[L];
				arr[L] = temp;
				R--;
				L++;
			}
		}
		Quicksorted(arr,lo,R);
		Quicksorted(arr,L,hi);
	}

}
