package lec7_recursion;

import java.util.Scanner;

public class power {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int x = scn.nextInt();
		int res=calpower(n,x);
		System.out.println(res);

}
	public static int calpower(int n,int x) {
		
		if(n==0)
			return 1;
		//assumption
		int mul=calpower(n-1,x);
		//self work
		int res=mul*x;
		return res;
}
}
/*
4 m=8 r=2*8=16
3m=4,r=2*4=8
2 m=2, r=2*2=4
1-->m-1,r-2*1=2
0*/