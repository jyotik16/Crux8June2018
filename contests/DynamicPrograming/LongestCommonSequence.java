/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;


import java.util.Scanner;

public class LongestCommonSequence {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		System.out.println(LCSBU(s1, s2));
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
