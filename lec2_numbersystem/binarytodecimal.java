package lec2_numbersystem;

import java.util.Scanner;

public class binarytodecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextInt();
		long rem;
		long ans=0;
		long mul=1;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+(rem*mul);
			n=n/10;
			mul=mul*2;
			
		}
		System.out.println(+ans);
	}

}
