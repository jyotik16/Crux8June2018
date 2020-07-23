package DynamicProgramming;

import java.util.Scanner;

public class MazePathCount {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n=scn.nextInt();
		int m=scn.nextInt();
		//System.out.println(countMazePathBU(0,n-1,0,m-1,new int[n+2][m+2]));
		//printMazePathD(0,n-1,0,m-1,"");
		//System.out.println(countMazePathBUSE(0,n-1,0,m-1,new int[n+1]));
		//System.out.println(countMazePathBUD(0,n-1,0,m-1,new int[n+1][m+1]));
		System.out.println(countMazePathBUSED(0,n-1,0,m-1,new int[n+1]));

		
	}
	
	public static int countMazePath(int cr,int er,int cc,int ec,int[][] strg){

		if(cr==er && cc==ec) {
			return 1;
			
	}
		if(cr>er || cc>ec) {
			return 0;
	} 
		if(strg[cr][cc]!=0) {
			return strg[cr][cc];
		}
		int count=0;
		count+=countMazePath(cr,er,cc+1,ec,strg);
		count+=countMazePath(cr+1,er,cc,ec,strg);
		strg[cr][cc]=count;
		return count;
		
}
	public static int countMazePathBU(int cr,int er,int cc,int ec,int[][] strg){

		if(cr==er && cc==ec) {
			return 1;
			
	}
		if(cr>er || cc>ec) {
			return 0;
	} 
		
		for(int i=er;i>=0;i--) {
			for(int j=ec;j>=0;j--) {
				if(i==er||j==ec)
					strg[i][j]=1;
				else
					strg[i][j]=strg[i+1][j]+strg[i][j+1];
			}
			
		}
		
		return strg[0][0];
}
	public static int countMazePathBUSE(int cr,int er,int cc,int ec,int[] strg){

		if(cr==er && cc==ec) {
			return 1;
			
	}
		if(cr>er || cc>ec) {
			return 0;
	} 
		for(int i=0;i<=er;i++)
			strg[i]=1;//initilize
		
		for(int i=er-1;i>=0;i--) {
			for(int j=ec-1;j>=0;j--) {
				strg[j]=strg[j]+strg[j+1];
			}
			
		}
		
		return strg[0];
}
	public static int countMazePathBUD(int cr,int er,int cc,int ec,int[][] strg){

		if(cr==er && cc==ec) {
			return 1;
			
	}
		if(cr>er || cc>ec) {
			return 0;
	} 
		
		for(int i=er;i>=0;i--) {
			for(int j=ec;j>=0;j--) {
				if(i==er||j==ec)
					strg[i][j]=1;
				else
					strg[i][j]=strg[i+1][j]+strg[i][j+1]+strg[i+1][j+1];
			}
			
		}
		
		return strg[0][0];
}
	public static int countMazePathBUSED(int cr,int er,int cc,int ec,int[] strg){

		if(cr==er && cc==ec) {
			return 1;
			
	}
		if(cr>er || cc>ec) {
			return 0;
	} 
		for(int i=0;i<=er;i++)
			strg[i]=1;//initilize
		int d=0;
		for(int i=er-1;i>=0;i--) {
			
			for(int j=ec-1;j>=0;j--) {
				d=strg[j+1];
				strg[j]=strg[j]+strg[j+1];
				strg[j]+=d;
			}
			
		}
		
		return strg[0];
}
}
