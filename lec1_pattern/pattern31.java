package lec1_pattern;

import java.util.Scanner;

public class pattern31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=n;
        
        while(row<=n)
        {
        	//stars
        	for(int cst=1;cst<=nst;cst++)
        		{	
        			if(row+cst==n+1)
        				System.out.print(" * ");
        			else
        				System.out.print(" "+cst+" ");
        		}
        	//prep
            
            row=row+1;
            System.out.println();
        }  	
}

}
