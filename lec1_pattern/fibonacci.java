package lec1_pattern;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 long  num = scn.nextInt();
		 long  a,b,c;
		 a=0; b=1; c=0; 
		
				if(num==1)
			System.out.print("0 1 1");
		else {
			System.out.print("0 1");	
		while(c<=num)
		{
			c=a+b;
			if(c>num)
				break;
			else
			System.out.print(" "+c);
			a=b; b=c;
			
		}
		
	}

}
}