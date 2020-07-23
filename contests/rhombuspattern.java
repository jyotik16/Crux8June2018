package lec1_pattern;

import java.util.Scanner;

public class rhombuspattern {
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	 int n=scn.nextInt();
     int row=1;
     int nst=1;
     int nsp=n;
     int val,bal;
     while(row<=(2*n-1))
     {
    	 if(row<=(2*n+1)/2)
    	 { val=row;  }
    	 else
    		 { val=2*n-row; }
    	 
    	 
    	//spaces
         for(int csp=1;csp<=nsp;csp++)
         {
         	System.out.print("     ");
         }
       //stars
         for(int cst=1;cst<=nst;cst++)
         {	
         	System.out.print("  "+val+"  ");
         	  val++;
         }
         bal=val-2;
       //stars
         for(int cst=1;cst<nst;cst++)
         {	
         	System.out.print("  "+bal+"  ");
         	  bal--;
         }	
         
       //prep
         if(row<=(2*n-1)/2)
         {
         	nst++; nsp--;
         }
         else
        { 
         	nst--; nsp++;     
        }
         //System.out.print(row);
         row=row+1;
        
         System.out.println();
     }
}
}
