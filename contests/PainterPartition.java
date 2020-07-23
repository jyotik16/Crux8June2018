package contest1;

import java.util.Scanner;

public class PainterPartition {
	static Scanner scn = new Scanner(System.in);
	static int sum(int arr[], int from, int to)
	{
	    int total = 0;
	    for (int i = from; i <= to; i++)
	        total += arr[i];
	    return total;
	}
	  
	// for n boards and k partitions
	static int partition(int arr[], int n, int k)
	{
	     if (k == 1) 
	        return sum(arr, 0, n - 1);    
	    if (n == 1)  
	        return arr[0];
	     int best = Integer.MAX_VALUE;
	  
	    // find minimum of all possible maximum	    // k-1 partitions to the left of arr[i],
	    // with i elements, put k-1 th divider 	    // between arr[i-1] & arr[i] to get k-th 
	        for (int i = 1; i <= n; i++)
	        best = Math.min(best, Math.max(partition(arr, i, k - 1),sum(arr, i, n - 1)));
	  
	    return best;
	}
	public static void main(String args[])
	{
	int arr[] = { 10, 20, 60};
	int n = arr.length;
	int k = 2;
	 System.out.println(partition(arr, n, k));
	}
}
