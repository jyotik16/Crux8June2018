package lec1_pattern;

import java.util.Scanner;

public class dimondpattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nr=2*n-1;
        int row=1;
        int nst=1;
        int nsp=nr/2;
        while(row<=nr)
        {
        for(int csp=1;csp<=nsp;csp++)
        {
        	System.out.print(" ");
        	
        }
        for(int cst=1;cst<=nst;cst++)
        {
        	System.out.print("*");
        	
        }
		//prep
       
        if(row<=nr/2)
        {	nsp--; nst+=2;
        
        }
        else
        {
		nsp++; nst-=2;
        }
        row=row+1;
        System.out.println();
}
}
}
