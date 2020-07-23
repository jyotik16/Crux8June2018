package lec7_recursion;

import java.util.Scanner;

public class incdec {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		incdec(n);

}
	public static void incdec(int n) {
		
		
		if(n==0)
			return;
		//self work
		System.out.println(n);
		//assumption
		incdec(n-1);
		//self work
		System.out.println(n);
	}
}