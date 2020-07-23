package DynamicProgramming;

import java.util.Scanner;

public class MaximunSumi2DArray {
static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	int r = scn.nextInt();
	int c = scn.nextInt();
	int[][] arr =new int[r][c];
//	int[][] arr = {{1, 2, -1, -4, -20},
//            	{-8, -3, 4, 2, 1},
//            	{3, 8, 10, 1, 3},
//            	{-4, -1, 1, 7, -6}
//           		};
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j] = scn.nextInt();
		}
	}
	findsum(arr,r,c);
	
}
static void findsum(int[][] ar,int m,int n ) {
		int col = ar[0].length; //n
		int row = ar.length; //m
		int[] tmp = new int[row];
		int[] res = new int[3];
		int maxsum = Integer.MIN_VALUE;
		int fleft = 0, fright =0 , ftop = 0, fdown = 0;
		
	for(int l=0; l<col ;l++) {
		tmp = new int[row]; 
		for(int r=l; r<col ;r++) {
			
			for(int k=0; k<row; k++) 
				tmp[k]+=ar[k][r];
				
				res = kadane(tmp,row);
				
				if(res[0]>maxsum) {
					fleft = l; 		fright = r;
					ftop = res[1]; 	fdown = res[2];  maxsum = res[0];
				}
		}
	}
	//System.out.println("L= "+fleft+" R= "+fright+" T= "+ftop+" D= "+fdown+" S= "+maxsum);
	System.out.println(maxsum);
}
private static int[] kadane(int[] arr,int row) {
	 int[] result = new int[]{Integer.MIN_VALUE, 0, -1};
     int csum = 0;
     int lstart = 0;
	
	for (int i = 0; i < row; ++i)
    {
        csum += arr[i];
        if (csum < 0)
        {
            csum = 0;
            lstart = i+1;
        }
        else if (csum > result[0])
        {
            result[0] = csum;
            result[1] = lstart;
            result[2] = i;
        }
    }
	if (result[2] != -1)
        return result;
 
   //  Special Case: When all numbers in arr[] are negative
	result[0] = arr[0];   result[1] = result[2] = 0;
 
     for (int i = 1; i < row; i++)
    {
        if (arr[i] > result[0])
        {
            result[0] = arr[i];
            result[1] = result[2] = i;
        }
    }
    return result;
}

}
