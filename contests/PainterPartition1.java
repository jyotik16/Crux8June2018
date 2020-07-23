package contest1;

import java.util.Scanner;
public class PainterPartition1 {
	static Scanner scn = new Scanner(System.in);
	public static int Max(int[] arr, int k)
	{
	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < k; i++) 
	        if (arr[i] > max)
	            max = arr[i]; 
	    return max;
	}
	public static int Total(int[] arr, int k)
	{
	    int sum = 0;
	    for (int i = 0; i < k; i++)
	        sum += arr[i];
	    return sum;
	}
	public static int numOfPainters(int[] arr, int k, int maxLen)
	{
	    int sum = 0, numPainters = 1;
	  
	    for (int i = 0; i < k; i++) {
	        sum += arr[i];
	  
	        if (sum > maxLen) {
	            sum = arr[i];
	            numPainters++;
	        }
	    }
	   
	    return numPainters;
	}
	public static int partition(int[] arr, int n, int k)
	{
	    int lo = Max(arr, k); 	    int hi = Total(arr, k);
	  
	    while (lo < hi) {
	        int mid = lo + (hi - lo) / 2; 
	        int requiredPainters = numOfPainters(arr, k, mid);
	  
	        // find better optimum in lower half 	 // here mid is included because we
	        
	        if (requiredPainters <= n)
	            hi = mid;
	  
	        // find better optimum in upper half    // here mid is excluded because it gives 
	       
	        else
	            lo = mid + 1;
	    }
	  	    return lo;
	}
public static void main(String[] args) {
	int N=scn.nextInt();//painter
	int K=scn.nextInt();//total boards
	int[] ar=new int[K];
	for(int i=0;i<K;i++) {
		ar[i]=scn.nextInt();
		}
	System.out.println(partition(ar, N, K));
}
}


/*
 * 2 4
10 10 10 10
lo= 10 hi=40
mid=25
mid=17
mid=21
mid=19
mid=20
20*/
