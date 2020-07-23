package lec7_string;

import java.util.Scanner;

public class palindromestr {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str= scn.nextLine();
		 boolean res=ispalindrome(str);
		 System.out.println(res);
		
				

	}
public static boolean ispalindrome (String str) {
	for(int i=0,j=str.length()-1;i<=str.length()/2;i++,j--)
	{
		if(str.charAt(i)!=str.charAt(j))
			return false;
	}
	return true;
	
}
}
