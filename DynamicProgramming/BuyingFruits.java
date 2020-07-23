package DynamicProgramming;

import java.util.Scanner;

public class BuyingFruits {
static Scanner scn = new Scanner(System.in);

public static void main(String[] args) {
int t =scn.nextInt();
while(t>0) {
	int row = scn.nextInt();
	int[][] seller = new int[row][3];
	for(int i=0; i<row;i++) {
		for(int j=0; j<3 ;j++)
			seller[i][j] = scn.nextInt();
	}
	t--;
	fruits(seller,row);
}

}

private static void fruits(int[][] ss, int row) {
	int mini = Integer.MAX_VALUE;
	int[][] strg = new int[row][3];
	//fill first row
	for(int i=0; i<1 ;i++) {
		for(int j=0; j<3;j++) {
			strg[i][j] = ss[i][j];
			
		}
	}
	
	//calculate
	for(int i=1; i<row ;i++) {
		for(int j=0; j<3;j++) {
			strg[i][j] = max(ss,i-1,j);
			ss[i][j] = strg[i][j];
			
		}
	}
	display(strg);
	//minium
	mini = Math.min(Math.min(ss[row-1][0], ss[row-1][1]),ss[row-1][2]);
	System.out.println(mini);
}

private static void display(int[][] strg) {
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}
	
}

private static int max(int[][] ss, int i, int j) {
	int min = Integer.MAX_VALUE;
	for(int indx = i; indx<i+1;indx++) {
		for(int k=0; k<3;k++) {
		if(k==j)
			continue;
		else
		{
			int t = ss[i+1][j]+ss[indx][k];
			if(min > t)
				min = t;
				
			
		}
	}
}
	return min;
}


}
