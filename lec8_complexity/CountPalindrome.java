package lec8_complexcity;

import java.util.Scanner;

public class CountPalindrome {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();

		System.out.println(count(str));

	}

	public static int count(String str) {
		int count = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else
					break;
			}
		}
		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else
					break;
			}
		}

		return count;
	}
}
