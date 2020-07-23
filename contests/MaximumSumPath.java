package contest1;

import java.util.Scanner;

public class MaximumSumPath {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
    {	
        MaximumSumPath sumpath = new MaximumSumPath();
        int Test=scn.nextInt();
        int j=1;
        while(j<=Test) {
        int m = scn.nextInt(); int[] a=new int[m];
        int n = scn.nextInt(); int[] b=new int[n];
        for(int i=0;i<a.length;i++)
        	a[i]=scn.nextInt();
        for(int i=0;i<b.length;i++)
        	b[i]=scn.nextInt();
        System.out.println(sumpath.maxPathSum(a, b, m, n));
        j++;
    }
    }
	int max(int x, int y) 
    {
        return (x > y) ? x : y;
    }
	int maxPathSum(int ar1[], int ar2[], int m, int n) 
    {
       
        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;
         while (i < m && j < n) 
        {
            
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
             
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
 
            // common point
            else
            {
                // Take the maximum of two sums and add to result
                result += max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                // Keep updating result while there are more common
                // elements
                while (i < m && j < n && ar1[i] == ar2[j]) 
                {
                    result = result + ar1[i++];
                    j++;
                }
            }
        }
 
        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];
         
        // Add remaining elements of ar2[]
        while (j < n) 
            sum2 += ar2[j++];
 
        result += max(sum1, sum2);
 
        return result;
    }

}/*
2
2
3
10 12
5 7 9
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
*/

