package lec7_string;

import java.util.Scanner;

public class incdec {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int c=1;
		incdecs(n,c);

}
	public static void incdecs(int n,int c) {
		
		
		if(n<c)
			return;
		//self work
		System.out.println(c);
		
		//assumption
		incdecs(n,c+1);
		//self work
		System.out.println(c);
	}

}
