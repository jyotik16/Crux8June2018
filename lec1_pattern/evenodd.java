package crux8june2018;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		
		if(n%2==0)
		{
			System.out.println( "given num is even num " +n);
		}
		else
		{
			System.out.println("odd num");
		}
	}

}
