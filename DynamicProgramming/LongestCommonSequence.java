package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSequence {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println(LCS("abcd","agfcd"));
		// System.out.println(LCSBU("abcd","agfcd"));
		//String s1 = "abcd";
		//String s2 = "agfcd";
		
		String s1 = scn.next();
		String s2 = scn.next();
		
		System.out.println(LCSBU(s1, s2, new int[s1.length() + 1][s2.length() + 1]));
	}

	public static int LCS(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans = 0;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int c1 = LCS(ros1, s2);
			int c2 = LCS(s1, ros2);
			ans = Math.max(c1, c2);
		}
		return ans;
	}

	public static int LCSTD(String s1, String s2, int[][] strg) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (strg[s1.length() - 1][s2.length() - 1] != 0) {
			return strg[s1.length() - 1][s2.length() - 1];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		if (ch1 == ch2) {
			strg[s1.length() - 1][s2.length() - 1] = LCS(ros1, ros2) + 1;
		} else {
			int c1 = LCS(ros1, s2,strg);
			int c2 = LCS(s1, ros2,strg);
			strg[s1.length() - 1][s2.length() - 1] = Math.max(c1, c2);
		}
		return strg[s1.length() - 1][s2.length() - 1];
	}

	public static int LCSBU(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
			for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(j);
				if (ch1 == ch2) {
					strg[i][j] = 1 + strg[i + 1][j + 1];
				} else {
					int c1 = strg[i + 1][j];
					int c2 = strg[i][j + 1];
					strg[i][j] = Math.max(c1, c2);
				}

			}
		}
		return strg[0][0];
	}

}
