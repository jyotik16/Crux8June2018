package lec7_recursion;

import java.util.Scanner;

public class Lexicalcount {
	static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
		int N=scn.nextInt();
			LexicalCounting(0,N);
			
		}
	
	public static void LexicalCounting(int curr,int end) {
		if(curr>end) {
			return;
		}
		int i;
		System.out.print(curr+" ");
		if(curr==0) 
			i=1;
		else
			i=0;
		for(int j=i;j<=9;j++) {
			LexicalCounting(curr*10+j,end);
		}
		
}
}
/*0 1 10 11 12 13 14 15 16 17 18 19 2 20 3 4 5 6 7 8 9 
*/