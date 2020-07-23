package contest;

import java.util.Scanner;

public class checkarmstrong {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scn.nextInt();
		int m;
		 m=n;
		check(n,m);
		
	}
	public static void check(int n,int m) {
		int rem,sum=0;
		while(n!=0)
		{ 
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==m)
			System.out.println("true");
		else
			System.out.println("false");
				
	}
}
