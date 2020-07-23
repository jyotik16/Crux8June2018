package lec1_pattern;

import java.util.Scanner;
public class hcf {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	long num1=scn.nextInt();
	long num2=scn.nextInt();
	long c=0; 
	long num=0;
	if(num1==num2)
		System.out.println(+num1);	
	else
	{	if(num1>=num2) 
		num=num2;
		else
		num=num1;
	
		for(int i=2;i<=num;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				c=i;
			
			}
		}
		if(c==0)
			System.out.println("1");
		else
			System.out.println(+c);
	}	
}
}
