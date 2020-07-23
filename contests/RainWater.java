/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;

import java.util.Scanner;

public class RainWater {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int test = scn.nextInt();

		while (test > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			RainWater(arr);
			test--;

		}
	}

	public static void RainWater(int[] arr) {

		int result = 0;
		int[] left = new int[arr.length];
		left[0] = arr[0];

		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
			//System.out.println("left="+left[i]);
		}

		int[] right = new int[arr.length];
		right[arr.length - 1] = arr[arr.length - 1];

		for (int j = arr.length - 2; j >= 0; j--) {
			right[j] = Math.max(right[j + 1], arr[j]);
		}

		for (int i = 1; i < arr.length; i++) {
			result = result + Math.min(left[i], right[i]) - arr[i];
			
		}

		System.out.println(result);
	}

}


