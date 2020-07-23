package lec1_pattern;
import java.util.Scanner;

public class pattern3 {
	
	   public static void main(String args[]) {
	       
		   Scanner scn = new Scanner(System.in);
			int N=scn.nextInt();

			int nst=1,row=1;
			while(row<=N)
			{
			    for(int cst=1;cst<=nst;cst++)
			    {
			        if(cst==1||cst==nst)
			        System.out.print(row);
			        else
			        System.out.print(0);
			        System.out.print("\t");
			    }
			    
			    System.out.println();
			    nst++;
			    row++;
			}
	    }
	}

4
1	
2	2	
3	0	3	
4	0	0	4