package crux8june2018;

import java.util.Scanner;

public class pattern {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	int num=scn.nextInt();
	
	
	for(int i=1;i<=num;i++)
	{
		System.out.println();
		for(int s=1;s<=(num-i);s++)
			System.out.print(" ");
		for(int j=i;j<=(i*2)-1;j++)
		{	
			System.out.print(+j);
			for(int k=j-1;k>=i;k--)
			System.out.print(+k);
		}
	}
	
}

}
