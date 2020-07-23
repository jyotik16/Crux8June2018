package contest1;

import java.util.Scanner;

public class ContainedInArray {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	int N = scn.nextInt();
	int[] ar = new int[N];
	for(int i=0;i<ar.length;i++)
		ar[i] = scn.nextInt();
	int c=ar.length;
	int item=scn.nextInt();
	int res=Check(ar,0,item);
	if(res!=0)
		System.out.println("true");
	else
		System.out.println("false");
		

}
	public static int Check(int[]ar,int vidx,int n) {
		if(vidx==ar.length)
			return 0;
		
		if(n==ar[vidx])
			return 1;
		int rv=Check(ar,vidx+1,n);
		return rv;
	}

}
