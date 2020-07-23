package lec7_recursion;

import java.util.Scanner;

public class fibonacci {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int res=fibonacci(n);
		System.out.println(res);
		

}
	public static int fibonacci(int n) {
		
		
		if(n==1)
			return  1;
		if(n==0)
			return 0;
		
		//assumption
		int fibo1=fibonacci(n-1);
		int fibo2=fibonacci(n-2);
		//self work
		int fibo=fibo1+fibo2;
			return fibo;	
	}
}
