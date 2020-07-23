package lec1_pattern;

import java.util.Scanner;

public class hourglass {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;	    int nst=2*n+1;
		int val,bal;	int nsp=0; 
		
			
		while(row<=2*n+1)
		{
			if(row<=(2*n+1)/2)
			{ val=n-row+1; }
			else
			{ val=(n-row+1)*(-1);}
		
			//spaces
			for(int csp=1;csp<=nsp;csp++)
				System.out.print("   ");
			//stars
			for(int cst=1;cst<=nst;cst++)
				{
				System.out.print(" "+val+" ");
		
				if(cst<=nst/2)
					{ val--; }
				else
					{ val++; }
				}
						
		
		if(row<=(2*n+1)/2)
		{ nsp+=1; nst-=2; }
		else
		{ nsp--; nst+=2;   }
	
		//prep
		row=row+1;
		System.out.println();
		
	}
}

}



