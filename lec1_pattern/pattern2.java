package lec1_pattern;

import java.util.Scanner;

public class pattern2 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nst=1;
        
        while(row<=n)
        {
        	//stars
        	for(int cst=1;cst<=nst;cst++)
        		System.out.print("*");
        	//prep
            nst++;
            row=row+1;
            System.out.println();
        }  	
}
}


