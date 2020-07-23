package contest;

import java.util.Scanner;

public class fibonaccicpattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long r=scn.nextInt();
		long row=3;
		long a=1,b=1,c=0;
		if(r==1)
		System.out.println("0 ");
		else if(r==2)
		{	System.out.println("0 ");	
			System.out.println("1 1 ");
		}
		else
		{
			System.out.println("0 ");	
			System.out.println("1 1 ");
		
		while(row<=r)
		{
			for(long i=1;i<=row;i++)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b; b=c;
					
			}
			row++;
			System.out.println();
			
	   }
		}	

	
	}
}

