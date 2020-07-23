package contest;

import java.util.Scanner;

public class insertionsort {
	static Scanner scn = new Scanner(System.in);
	   public static void main(String args[])
	   {
	       
	       int[] ar = takeinput();
	       insertion(ar);
	       display(ar);
	   }

	public static int[] takeinput() {
		
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertion(int[] arr) {
//		int i,j,temp;
//		for (i = 1; i < arr.length - 1; i++) {
//			temp = arr[i];
//			j = i - 1;
//			while ((temp < arr[j]) && (j >= 0)) {
//				arr[j + 1] = arr[j];
//				j = j - 1;
//			}
//			arr[j + 1] = temp;
//		}
//		return arr;
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

	}
}
