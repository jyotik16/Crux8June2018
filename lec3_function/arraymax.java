package lec3_function;

import java.util.Scanner;

public class arraymax {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// declare
		//int[] arr = null;
		//System.out.println(arr);
		// allocating space
		// arr = new int[5];
		// System.out.println(arr);
		int[] ar = takeinput();
		display(ar);
		arraymax(ar);
		

	}

	public static int[] takeinput() {
		//System.out.println("size:");
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("index " + i);
			arr[i] = scn.nextInt();
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void arraymax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		//System.out.println("maximum element:"+max);
		System.out.println(max);
	}
}
	


