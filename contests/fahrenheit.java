package lec3_function;

import java.util.Scanner;

public class fahrenheit {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();
		int i=0;
		i=min;
		int ftemp=min,ctemp=0;
		while(i<=max)
		{
			if (ftemp == 0) {
				System.out.print("0   ");
			} else {
				System.out.print(ftemp + "   ");
			}
			ctemp=((ftemp-32)*5/9);
			System.out.println(ctemp);
			 
			i+=step;
			ftemp=i;
		}
	}

}
