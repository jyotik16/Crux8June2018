package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumTarget {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int sum = scn.nextInt();
	int[] ar = new int[n];
	for(int i=0;i<n;i++) {
		ar[i] = scn.nextInt();
	}
	
	if(isSubsetSum(ar,n,sum))
		System.out.println("Yes");
	else
		System.err.println("No");
}
static boolean isSubsetSum(int[] set, int n, int sum)
{
    boolean[][] subset = new boolean [n+1][sum+1];
  
   
    for (int i = 0; i <= n; i++)
      subset[i][0] = true;
  
    // If sum is not 0 and set is empty, then answer is false
    for (int i = 1; i <= sum; i++)
      subset[0][i] = false;
  
     // Fill the subset table in botton up manner
     for (int i = 1; i <= n; i++)
     {
       for (int j = 1; j <= sum; j++)
       {
         if(j<set[i-1])
         subset[i][j] = subset[i-1][j];
         if (j >= set[i-1])
           subset[i][j] = subset[i-1][j] || 
                                 subset[i - 1][j-set[i-1]];
       }
     }
  
     
     return subset[n][sum];
}
}
