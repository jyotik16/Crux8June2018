package contest;

import java.util.Scanner;

public class arrowpattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;	    int nst=1;
		int val=1,bal;	int nsp=n-1,nsp1=-1; 
		while(row<=n)
		{
			if(row<=n/2)
				val=row;
			else
				val=n-row+1;
			//1 spaces
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("   ");
			//1 stars
			for(int cst=1;cst<=nst;cst++)
			{
				System.out.print(" "+val+" "); val--;
						
			}
		if(row>1 && row<n)
		{	//2 spaces
			for(int csp=1;csp<=nsp1;csp++)
				System.out.print("   ");
			bal=val+1;
			//2 stars
			for(int cst=1;cst<=nst;cst++)
			{
			System.out.print(" "+bal+" "); bal++;
			}
		}	
			if(row<=n/2)
				{  nsp-=2; nst++; nsp1+=2; }
			else
				{ nsp+=2; nst--; nsp1-=2; }
			
			row++;
			
			System.out.println();
		}
	}
}
