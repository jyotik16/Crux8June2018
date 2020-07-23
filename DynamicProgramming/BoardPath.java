package DynamicProgramming;

import java.util.Scanner;

public class BoardPath {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		//System.out.println(CountgetBoardTD(0,n,new int[n+1]));
		//System.out.println(CountgetBoardNBU(0,n,new int[n+6]));
		System.out.println(CountgetBoardBU(0,n,new int[6]));
}
	public static int CountgetBoardTD(int cur,int end,int[] strg){
		int count;
		if(cur==end)
		{	
			return 1;
		}
		if(cur>end) {
			return 0;
		}
		if(strg[cur]!=0) {
			return strg[cur];
		}
		count=0;
		
		for(int i=1; i<=6 && cur+i<=end; i++) {
			count+=CountgetBoardTD(cur+i,end,strg);
			
		 }
		strg[cur]=count;
		return count;
		}
	public static int CountgetBoardNBU(int cur,int n,int[] strg){
		int count=0;
		strg[n]=1;
		for(int j=n-1;j>=0;j--) {
			count=0;
		for(int i=0 ;i<=6;i++) {
			count+=strg[j+i];
		}
		strg[j]=count;
		}
		return strg[0];
}
	public static int CountgetBoardBU(int cur,int n,int[] strg){
		int count=0;
		strg[0]=1;
		for(int j=n-1;j>=0;j--) {
			
			for(int i=0;i<=5;i++) {
				count+=strg[i];
			}
			for(int i=5;i>0;i--) {
				strg[i]=strg[i-1];
		
			}
		strg[0]=count;
		count=0;
		}
		return strg[0];
}
}