package CodeSimple;
import java.util.ArrayList;
public class Subset_sum_problem
{
	// dp[i][j] is going to store true if sum j is
	// possible with array elements from 0 to i.
	static boolean[][] dp;
	
	static void display(ArrayList<Integer> v)
	{
	System.out.println(v);
	}
	
	// A recursive function to print all subsets with the
	// help of dp[][]. Vector p[] stores current subset.
	static void printSubsetsRec(int arr[], int i, int sum,ArrayList<Integer> p)
	{
		
		if (i == 0 && sum != 0 && dp[0][sum]) //base case
		{
			p.add(arr[i]);
			display(p);
			p.clear();
			return;
		}
	
		// If sum becomes 0
		if (i == 0 && sum == 0)
		{
			display(p);
			p.clear();
			return;
		}
	
		// If given sum can be achieved after ignoring
		// current element.
		if (dp[i-1][sum])
		{
			
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(p);
			System.out.println(" b="+b);
			printSubsetsRec(arr, i-1, sum, b);
		}
	
		// If given sum can be achieved after considering
		// current element.
		if (sum >= arr[i] && dp[i-1][sum-arr[i]])
		{
			p.add(arr[i]);
			printSubsetsRec(arr, i-1, sum-arr[i], p);
		}
	}
	
	// Prints all subsets of arr[0..n-1] with sum 0.
	static void printAllSubsets(int arr[], int n, int sum)
	{
		if (n == 0 || sum < 0)
		return;
	
		// Sum 0 can always be achieved with 0 elements
		dp = new boolean[n][sum + 1];
		for (int i=0; i<n; ++i)
		{
			dp[i][0] = true; 
		}
	
		// Sum arr[0] can be achieved with single element
		if (arr[0] <= sum)
		dp[0][arr[0]] = true;
	
		// Fill rest of the entries in dp[][]
		for (int i = 1; i < n; ++i){
		    System.out.println();
		    
			for (int j = 0; j < sum + 1; ++j){
				dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
										dp[i-1][j-arr[i]])
										: dp[i - 1][j];
										System.out.print(dp[i][j]+" ");
			}
		}
		if (dp[n-1][sum] == false)
		{
			System.out.println("There are no subsets with" + 
												" sum "+ sum);
			return;
		}
	
		
		// paths from dp[n-1][sum]
		ArrayList<Integer> p = new ArrayList<>();
		printSubsetsRec(arr, n-1, sum, p);
	}
	
	
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int sum = 9;
		printAllSubsets(arr, n, sum);
	}
}
/*
 * 
true true true true false false false false false false 
true true true true true true true false false false 
true true true true true true true true true true 
true true true true true true true true true true [4, 3, 2]
[5, 3, 1]
[5, 4]
dp[3][9]==t => dp[2][9]==f
 			=> sum>=ar[3] && dp[2][sum-ar[2]]=t add p=ar[3]=4 p[4] => sum>=ar[2] && dp[1][sum-ar[1]] = t add p=ar[2]=2 p[4,3] similary p[4,3,2]
 base case when i==0;
 				

*/
