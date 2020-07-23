/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;


import java.util.Scanner;

public class EditDistance {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(EditDistanceBU(s1, s2,new int[s1.length()+1][s2.length()+1]));

	}

	public static int EditDistanceBU(String s1, String s2,int[][] strg) {
		
		//initialize
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(j==s2.length()) {
					strg[i][j]=s1.length()-i;
				}
				if(i==s1.length()) {
					strg[i][j]=s2.length()-j;
				}
			}
			
		}
		for (int i = s1.length()-1; i >= 0; i--) {
			for (int j = s2.length()-1; j >= 0; j--) {
				
				if (s1.charAt(i)== s2.charAt(j)) {
						strg[i][j]=strg[i+1][j+1];
					} 
				else {
					int ins=strg[i+1][j];
					int d=strg[i][j+1];
					int r=strg[i+1][j+1];
					strg[i][j]=Math.min(ins, Math.min(d, r))+1;
				}
					
			}

		}
		return strg[0][0];
	}
}

