package DynamicProgramming;

import java.util.Scanner;

public class fibonacci {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n=scn.nextInt();
		long[] strg=new long[2];
		//System.out.println(fibonacciTD(100,strg));
		fibonacciBUR(n, strg);

	}

	public static long fibonacciTD(int n,long[] strg) {
			
		if(n==1)
			return  1;
		if(n==0)
			return 0;
		
		if(strg[n]!=0) {
			return strg[n];
		}
		long fibo1=fibonacciTD(n-1,strg);
		long fibo2=fibonacciTD(n-2,strg);
		//self work
		long fibo=fibo1+fibo2; 
		strg[n]=fibo;
		return fibo;	
	}
	public static void fibonacciBUR(int n,long[] strg) {
		strg[0]=0; strg[1]=1;
		long sum=0;
		
		while(sum<n){
			sum=strg[0]+strg[1];
			strg[0]=strg[1];
			strg[1]=sum;
			
			}		
		System.out.println(sum);
			
	}
	public static void fibonacciBU(int n,long[] strg) {
		strg[0]=0; strg[1]=1;
		for(int i=2;i<=n;i++) {
			strg[i]=strg[i-1]+strg[i-2];
			
			}		
		System.out.println(strg[n]);
			
	}
}
