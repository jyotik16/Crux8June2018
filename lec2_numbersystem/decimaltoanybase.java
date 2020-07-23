package lec2_numbersystem;

import java.util.Scanner;

public class decimaltoanybase {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sn=scn.nextInt();
		int db=scn.nextInt();
		int rem;
		int ans=0;
		int mul=1;
		while(sn!=0)
		{
			rem=sn%db;
			ans=ans+(rem*mul);
			sn=sn/db;
			mul=mul*10;
			
		}
		System.out.println(+ans);
	}

}

