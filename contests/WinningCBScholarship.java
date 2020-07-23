package contest1;

import java.util.Scanner;

public class WinningCBScholarship {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		long a=1;
		long N=scn.nextLong();	//no of student
		long M=scn.nextLong();	//total coupons
		long X=scn.nextLong();	//Required coupons
		long Y=scn.nextLong();   //student coupons
		long res=Binary(N,M,X,Y);
		System.out.println(res);
		
		
		
}
	public static long Binary(long N,long M,long X,long Y) {
		long ans=0;
		long low=0,high=N,mid=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			if(Check(mid,N,M,X,Y)) {
				low=mid+1; ans=(long)Math.max(ans,mid);
			}
			else
			{	high=mid-1;  }
		}
		return ans;
	}
	public static boolean Check(long mid,long N,long M,long X,long Y) {
		long a=mid*X;
		long b=M+(N-mid)*Y;
		return (a<=b);
		}
}