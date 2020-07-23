package lec1_pattern;

import java.util.Scanner;

public class pattern28 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int nsp=n-1;
		int row=1;
			
		while(row<=n)
		{
		int val=row;
		//spaces
			int csp=1;
			while(csp<=nsp)	
		{
		System.out.print("  ");
		csp=csp+1;
		}
		//stars
		int cst=1;
		while(cst<=nst)
		{ 
			System.out.print(" "+val);
			val++;
			cst=cst+1;
		}
		//stars
		cst=1;val-=2; 
		while(cst<nst)
		{ 
			System.out.print(" "+val);
			val--;cst=cst+1;
		}
		
			//prep 
		nsp=nsp-1;
		
		nst=nst+1;
		row=row+1;
		System.out.println();
		}
}
}



