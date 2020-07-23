package lec2_numbersystem;

import java.util.Scanner;

public class decimaltobinary {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int rem;
		int ans=0;
		int mul=1;
		while(n!=0)
		{
			rem=n%2;
			ans=ans+(rem*mul);
			n=n/2;
			mul=mul*10;
			
		}
		System.out.println(+ans);
	}

}
