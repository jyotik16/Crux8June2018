package lec2_numbersystem;

import java.util.Scanner;

public class rotation {
			public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int n =scn.nextInt();
			int r=scn.nextInt();
			int c=0;
			int temp=n;
			
			while(temp!=0)
			{
				temp=temp/10;
				c++;
			}
			r=r%c;
			if(r<0)
			r=r+c;	
			int divisor=(int)Math.pow(10,r);
			int rem=n%divisor;
			int quotient=n/divisor;
			int mul=(int)Math.pow(10,c-r);
			int ans=rem*mul+quotient;
			System.out.println(ans);
			}
	}
