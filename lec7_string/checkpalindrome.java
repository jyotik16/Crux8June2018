package lec7_string;

import java.util.Scanner;

public class checkpalindrome {
	static Scanner scn = new Scanner(System.in);
	//static int count;
	public static void main(String[] args) {
		String str = scn.nextLine();
		substring(str);
		//System.out.println(c);

	}

	public static void  substring (String str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{    
			
			for(int j=i+1;j<=str.length();j++)
			{
							
				String ss=str.substring(i,j);
				
				check(ss);
				
			}
		}
		
	}
		public static boolean ispalindrome (String str) {
			for(int i=0,j=str.length()-1;i<=str.length()/2;i++,j--)
			{
				if(str.charAt(i)!=str.charAt(j))
					return false;
			}
			return true;
			 
		}

		public static void check(String ss) {
			boolean res=ispalindrome(ss);
			
			if(res==true)
				{ 
				System.out.println(ss);
				
				}
			
			}
		
}
/*
nayan
n
nayan
a
aya
y
a
n*/
