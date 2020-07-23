package contest;

import java.util.Scanner;

public class inverthourglass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;	    int nst=1;
		int val,bal;	int nsp=2*n-1; 
		int pst=1;
		while(row<=2*n+1)
		{
			val=n;
			//1 stars
			for(int cst=1;cst<=nst;cst++)
			{
				
				System.out.print(" "+val+" ");
				val--;
			}
			//spaces
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("   ");
			bal=val+1;
			
			//2 stars
			if(row==(2*n+2)/2)
			{	
				for(int cst=1;cst<nst;cst++)
				{
					System.out.print(" "+(bal+1)+" ");
					bal++;
				}	
			}
			else
			{	
				for(int cst=1;cst<=nst;cst++)
				{
					System.out.print(" "+bal+" ");
					bal++;
				}	
			}
			
			if(row<=(2*n+1)/2)
			{	nsp-=2; nst++; }
			else
			{	nsp+=2; nst--; }
			//prep
			
			row=row+1;
			System.out.println();
		
	   }
	}

}
