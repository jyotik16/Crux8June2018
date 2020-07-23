package lec8_complexcity;

import java.util.Scanner;

public class polynomial {
	static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			int x = scn.nextInt();
			int n = scn.nextInt();
			int res=polynomialsum(n,x);
			System.out.println(res);

	}
		public static int polynomialsum(int n,int x) {
			int mul=x,sum=0; 
			for(int coeff=n;coeff>=1;coeff--) {
				sum=sum+coeff*mul;
				mul=mul*x;
			}
			return sum;
}
}