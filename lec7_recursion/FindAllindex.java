package lec7_recursion;

import java.util.Scanner;

public class FindAllindex {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		int item = scn.nextInt();
		int[] res = FindAllindex1(ar, 0, item,0);
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);
		
	}

	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	// method 1

	public static int FindAllindex(int[] arr, int vidx, int item) {
		{

			if (vidx == arr.length)
				return -1;
			int res = FindAllindex(arr, vidx + 1, item);
			if (arr[vidx] == item) {
				System.out.println(vidx);
				return vidx;
			}
			return res;
		}
	}
	// method 1 return index in array

	public static int[] FindAllindex1(int[] arr, int vidx, int item, int count) {
		{

			if (vidx == arr.length) {
				int[] brr = new int[count];
				return brr;
			}

			if (arr[vidx] == item) {

				int[] rr = FindAllindex1(arr, vidx + 1, item, count + 1);
				rr[count] = vidx;
				return rr;
			} else {
				 int[] rr = FindAllindex1(arr, vidx + 1, item, count);
				return rr;
			}

		}
	}
}
