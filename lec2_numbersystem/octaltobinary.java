package lec2_numbersystem;

import java.util.Scanner;

public class octaltobinary {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long sn=scn.nextInt();
		long rem;	long ans=0; 	long mul=1;
				
				while(sn!=0)
				{	rem=sn%10;
					ans=ans+(rem*mul);
					sn=sn/10;
					mul=mul*8;
					
				}
				long rem1=0; long ans1=0; long mul1=1;
				sn=ans;
				//System.out.println(+ans);
				while(sn!=0)
				{
					rem1=sn%2;
					ans1=ans1+(rem1*mul1);
					sn=sn/2;
					mul1=mul1*10;
					
				}
				System.out.println(+ans1);
			}
}
