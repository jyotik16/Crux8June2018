package lec1_pattern;

import java.util.Scanner;

public class pattern22 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=n-1;
        int nsp=1;
       //first line 
      	for(int cst=1;cst<=2*n-1;cst++)
    		System.out.print("*");
      	System.out.println();
        while(row<=n)
        {
        		//stars
            	for(int cst=1;cst<=nst;cst++)
            		System.out.print("*");
            	//spaces
            	for(int csp=1;csp<=nsp;csp++)
            		System.out.print(" ");
            	//stars
            	for(int cst=1;cst<=nst;cst++)
            		System.out.print("*");
        	 
        	//prep
            nst--;
            row=row+1;
            nsp=nsp+2;
            System.out.println();
        }  
        

}
}