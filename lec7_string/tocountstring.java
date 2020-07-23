package lec7_string;

import java.util.Scanner;

public class tocountstring {
	static Scanner scn = new Scanner(System.in);
	//static int count;
	public static void main(String[] args) {
		String str = scn.nextLine();
		check(str);
		
}
	public static void check(String str) {
		int c=0;
		for(int i=0;i<str.length();i++)
		{    
			
			for(int j=i+1;j<=str.length();j++)
			{
							
				String ss=str.substring(i,j);
				boolean res=ispalindrome(ss);
				if(res==true)
				{ 
				
				c++;
				}
				
			}	
		}
			
	System.out.println(c);	
		
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
