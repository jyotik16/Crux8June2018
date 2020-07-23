package crux8june2018;
import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int nst=5;
		int nsp=0;
		int row=1;
			
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)	
		{
		System.out.print(" ");
		csp=csp+1;
		}
		int cst=1;
		while(cst<=nst)
		{ 
			System.out.print("*");
			cst=cst+1;
		}
			//prep 
		nsp=nsp+2;
		nst=nst-1;
		row=row+1;
		System.out.println();
		}
		
	    }

}//*****
//  ****
//    ***
//      **
//        *
