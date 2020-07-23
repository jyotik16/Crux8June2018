package lec7_string;

import java.util.Scanner;

public class substrings {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str= scn.nextLine();
		int k=0;
		while(k<str.length()) {
			substring(str,k);
					k++;
		}
		
	}
	public static void substring (String str,int s) {
		for(int i=s;i<str.length();i++)
		{    
			
			for(int j=s;j<str.length();j++)
			{
				System.out.print(str.charAt(j));
			}
			
			System.out.println();
		}
	}
}
