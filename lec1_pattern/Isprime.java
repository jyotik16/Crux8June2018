package crux8june2018;

import java.util.Scanner;

public class Isprime {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		 long n=scn.nextInt();
		 long i=1;
		 long count=0;
		while(i<=n)
		{
		 if(n%i==0)
			 {  count++;	} 	
		 	i++;
		}
		if(count==2)
			System.out.println("prime num." );
		else
			System.out.println("not a prime num.");
	

}
}