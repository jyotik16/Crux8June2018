package contest2;

import java.util.Scanner;

public class BoardPath {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scn.nextInt(); int m = scn.nextInt();
		System.out.println(CountgetBoard(0, n," ", m));
		printgetBoard(0,n," ",m);
		
		
	}
	public static int CountgetBoard(int cur,int end,String ans,int m){
		int count;
		if(cur==end)
		{	
			return 1;
		}
		count=0;
		for(int i=1; i<=m && cur+i<=end; i++) {
			count+=CountgetBoard(cur+i,end,ans+cur,m);
			
		 }
		return count;
		}
	


	public static void printgetBoard(int cur,int end,String ans,int m){
		
		if(cur==end)
		{	
			System.out.print(ans+" ");
			}
	
		for(int i=1; i<=m && cur+i<=end; i++) {
			printgetBoard(cur+i,end,ans+i,m);
			
		 }
		
		}
	

}
