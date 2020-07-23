package crux8june2018;

import java.util.Scanner;

public class allprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 long n=scn.nextInt();
		 	int i =0;
		 	int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	            	 counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
			
		     primeNumbers = primeNumbers + i + ", ";
		  }	
	       }	
	       System.out.print(primeNumbers);
	   }
}