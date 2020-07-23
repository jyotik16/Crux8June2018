package lec7_string;

import java.util.Scanner;

public class substring1 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str= scn.nextLine();
	   substring(str);
		
	}
	public static void substring (String str) {
		for(int i=0;i<str.length();i++)
		{    
			
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
			
		}
	}

}
