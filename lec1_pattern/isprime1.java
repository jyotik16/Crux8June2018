package crux8june2018;

import java.util.Scanner;

public class isprime1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 long n=scn.nextInt();
		 long i=2;
		 boolean flag = true;    
	
		 while(i<=n-1)
		 {
			 if(n%i==0)
			 {
				 flag = false;
				 break;
				 
			 }
			 i=i+1;
		 }
		
		if(flag == true)
		System.out.println("prime num");
		else
		System.out.println("not a prime num");
				
		
		
	}

}
