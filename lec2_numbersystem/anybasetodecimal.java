package lec2_numbersystem;

import java.util.Scanner;

public class anybasetodecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sn=scn.nextInt();
		int sb=scn.nextInt();
		int rem;
		int ans=0;
		int mul=1;
		while(sn!=0)
		{
			rem=sn%10;
			ans=ans+(rem*mul);
			sn=sn/10;
			mul=mul*sb;
			
		}
		System.out.println(+ans);
	}

}
