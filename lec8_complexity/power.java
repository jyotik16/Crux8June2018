package lec8_complexcity;

import java.util.Scanner;

public class power {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int x = scn.nextInt();
		int n = scn.nextInt();
		int res=calpower(n,x);
		System.out.println(res);

}
	public static int calpower(int n,int x) {
		int mul=1,res=0,res1=0,res2=0;
		if(n==0)
			return 1;
		//assumption
		int sp=calpower(n/2,x);
		if(n%2==0)
			mul=sp*sp;
		else
			mul=sp*sp*x;
		//self work
		return mul;
		
}
}
