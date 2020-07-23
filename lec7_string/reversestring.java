package lec7_string;

import java.util.Scanner;

public class reversestring {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str= scn.nextLine();
		reverse(str);
		
		
	}
	public static void reverse (String str) {
		String subans=""; 			String ans="";
		for(int i=str.length()-1;i>=0;i--)
		{    
			char ch = str.charAt(i);
			
			if(ch=='+'|| ch=='-'|| ch=='*'||ch=='/'|| ch=='%')
			{
				ans=ans+subans;
				ans=ans+ch;
				subans="";
			}
			else {
				subans = ch+subans;
			}
		}
		System.out.println(ans);
	}
/*
	str = in.nextLine();
11
        String[] token = str.split("");    //used split method to print in reverse order
12
        for(int i=token.length-1; i>=0; i--)
13
        {
14
            System.out.print(token[i] + "");
15
        }

//=========================//
original = in.nextLine();
11	String original, reverse = "";

        int length = original.length();
12
        for(int i=length-1; i>=0; i--) {
13
            reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
14
        }
15
        System.out.println(reverse);
16
    }


*/

}

//a+b-c*d
//d*c-b+

