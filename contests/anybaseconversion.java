package contest;

import java.util.Scanner;

public class anybaseconversion {
	static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {

	int sb=scn.nextInt();
	int db=scn.nextInt();
	int sn=scn.nextInt();
	
	int res=anytodeci(sn,sb);
	decitoany(res,db);
	
	
	
}
public static int  anytodeci(int sn,int sb) {
	int rem;	int ans=0;	int mul=1;
	while(sn!=0)
	{
		rem=sn%10;
		ans=ans+(rem*mul);
		sn=sn/10;
		mul=mul*sb;
		
	}
	//System.out.println(+ans);
	return ans;
	
}
public static void  decitoany(int sn,int db) {
	int rem;	int ans=0;	int mul=1;
	while(sn!=0)
	{
		rem=sn%db;
		ans=ans+(rem*mul);
		sn=sn/db;
		mul=mul*10;
		
	}
	System.out.println(+ans);
	
}
}
