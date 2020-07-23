package contest1;

import java.util.Scanner;
import java.util.Stack;

public class NextSmallerNextGreater {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int test = scn.nextInt();
		int a = 1, N;
		while (a <= test) {
			N = scn.nextInt();
			int[] ar = new int[N];
			
			for (int i = 0; i < N; i++)
				ar[i] = scn.nextInt();
				FindGS(ar, N);
				a++;
				System.out.println();
		}

	}
	public static void FindGS(int[] ar,int n) {
		int[] NG = new int[n]; // stores indexes of next greater elements
	    int[] RS = new int[n]; // stores indexes of next smaller elements
	    nextGreater(ar, n, NG, 'G');
	    nextGreater(ar, n, RS, 'S');
	    for (int i=0; i< n; i++)
	    {
	        if (NG[i] != -1 && RS[NG[i]] != -1)
	            System.out.println(ar[RS[NG[i]]]+" ");  
	        else
	            System.out.println("-1 ");
	    }
	}
public static void nextGreater(int[] arr, int n, int[] next, char order)
{	
	 Stack<Integer> S= new Stack<Integer>();
	 
	 for (int i=n-1; i>=0; i--)
	 {
	   while (!S.empty() && ((order=='G')? arr[(int) S.peek()] <= arr[i]:arr[(int) S.peek()] >= arr[i]))
	            
		 S.pop();
	 
	   // store the next greater element of current element
	   if (!S.empty())
		   next[i] = (int) S.peek();
	    else
	       next[i] = -1;
	    
	    S.push(i);
	   }
	}
}
