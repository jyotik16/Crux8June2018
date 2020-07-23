package lec1_pattern;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextInt();
		long d=scn.nextInt();
		long count=0; 
		long rem=0; 
		while(n!=0)
		{
			rem=n%10;
			if(rem==d)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
}
}