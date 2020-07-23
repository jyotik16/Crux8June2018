package DynamicProgramming;

import java.util.Scanner;

public class MaxmumProfit {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt(); // life second
		int n = scn.nextInt(); // gems stones
		int[] gems = new int[n];
		int m = scn.nextInt(); // gold coins
		
		for (int i = 0; i < n; i++)//initiale values of gems
			gems[i] = scn.nextInt();
		
		int[][] matrix = new int[t][n]; // values of gold coins
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++)
				matrix[i][k] = scn.nextInt();
		}
		//converting 1D array into 2D array
		int[] arr = new int[t*n];
		for(int i =0; i<t*n;) {
			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix[j].length; k++) {
					arr[i] = matrix[j][k];
				i++;
				}	
			}
		}
		int[] res = mergesort(arr,0,arr.length-1);
		//display(res);
		profit(t,n,m,gems,res);
	
	}

	private static void display(int[] arr) {
		for(int i=0; i<arr.length ;i++)
			System.out.print(arr[i]+" ");
		
	}

	public static int[] mergesorted(int[] one, int[] two) {
		int[] merged = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}

		}
		if (j == two.length) {
			while (i < one.length) {
				merged[k] = one[i];
				i++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				merged[k] = two[j];
				j++;
				k++;
			}

		}
		return merged;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;

		int[] fh = mergesort(arr, lo, mid);
		int[] sh = mergesort(arr, mid + 1, hi);
		int[] merged = mergesorted(fh, sh);
		return merged;
	}
	
	private static void profit(int t, int n, int m, int[] gems, int[] matrix) {
		
		int power =0;
		for(int i=0; i<gems.length; i++)
			power+=gems[i];
		
		for(int i=0; i<matrix.length ;i++) {
			
			int rem = m-matrix[i];
			m =rem;
			
			if(rem<=0)
				break;
			else
			{
				power+=1;
			}
				
		}
		System.out.println(power);
		
		
		
		
		
	}


}
