package lec2_numbersystem;

import java.util.Scanner;

public class inversenum {
	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  long n=scn.nextInt();
		  long c=0;
		  long n1=n;  long i=1,j=1,t=0,rem=0,s=0;  
		  while(n1!=0)
		  {
			  n1=n1/10;
			  c++;
		  }
		 
		  while(i<=c)
		  {
			  long p;
			  rem=n%10; //position
			  p=rem-1;
			  t=j*(int)Math.pow(10,p);
			  s=s+t;
			  n=n/10;
			  i++; j++;
			  
		  }
		  System.out.println(s);
	}

}
