package lec1_pattern;

import java.util.Scanner;

public class pattern33 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
		int bal=n;
		while(row<=n)
		{
			int val=bal;
			//spaces
			for(int csp=1;csp<=nsp;csp++)
			System.out.print(" ");

			//stars
			for(int cst=1;cst<=nst;cst++)
			{	
				if(val==10||val>10)
					System.out.print("0");
				else
					System.out.print(val);
				val=val+1;
			}
			
			//System.out.print("0");
			//stars
			val-=2;
			for(int cst=1;cst<nst;cst++)
			{	
				if(val==10 ||val>10)
					System.out.print("0");
				else
					System.out.print(val);
				val=val-1;
			}
			
		
		//prep 
		nsp=nsp-1;
		nst=nst+1;
		row=row+1;
		bal=bal-1;
		
		System.out.println();
		}
	}
}


