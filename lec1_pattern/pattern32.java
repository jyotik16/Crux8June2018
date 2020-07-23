package lec1_pattern;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nr=2*n-1;
        int row=1;
        int nst=1;
        int val;
        while(row<=nr)
        {
        //stars
        	if(row<=n)
        	{val=row;}
        	else
        	{
        		val=nr-row+1;
        	}
        	for(int cst=1;cst<=nst;cst++)
            {
            	if(cst%2==0)
        		System.out.print("*");
            	else
            	System.out.print(val);	
            	
            }
        	//prep
        	if(row<=nr/2)
        	{
        		nst+=2;
        	}
        	else
        	{
        		nst-=2;
        	}
        	row=row+1;
        System.out.println();
}
}
}