package lec1_pattern;

import java.util.Scanner;

public class pattern21 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=1;
        int nsp=2*n-3;
        int val=1;
        while(row<n)
        {
        	val=1;
        	//stars
        	for(int cst=1;cst<=nst;cst++)
        		{
        		System.out.print("  "+val+"  "); val++;
        		}
        	//spaces
        	for(int csp=1;csp<=nsp;csp++)
        		System.out.print("     ");
        	val--;
        	//stars
        	for(int cst=1;cst<=nst;cst++)
        		{
        		System.out.print("  "+val+"  ");val--;
        		}
        	
        	//prep
            nst++;
            row=row+1;
            nsp=nsp-2;
            System.out.println();
        } 
       
        if(row==n)
        {//last line stars
        	val=0;
        	
        	for(int cst=1;cst<=2*n-1;cst++)
        		{
        		if(cst<=n)
        			val++;
        		else
        			val--;
        		System.out.print("  "+val+"  ");
        		}
        }	
}
}

