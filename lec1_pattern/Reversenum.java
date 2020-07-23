package crux8june2018;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		long n=scn.nextInt();
		long rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		System.out.println(+sum);
		

	}

}
