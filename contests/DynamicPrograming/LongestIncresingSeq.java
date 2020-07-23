/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;

import java.util.Scanner;

public class LongestIncresingSeq {
    static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int k=0;k<n;k++)
	    arr[k] = scn.nextInt();
	
		System.out.println(list(arr,n));
	}

	
	// by using dp----------------------
	static int list( int[] arr, int n )
	{
	    int [] br =new int[n];
		int i,j,max=0;
		//fill 1 in all index
		for (i = 0; i < n; i++ )
	       br[i] = 1;
		
		//compute
		for (i = 1; i < n; i++ )
	        for (j = 0; j < i; j++ ) { 
	            if ( arr[i] > arr[j] && br[i]<br[j]+1)
	             br[i] = br[j] +1;
	            }
		
		//calculate maximun length
		for (i = 0; i < n; i++ )
	        if (max < br[i])
	            max = br[i];
		
		//dispaly result array
// 		for( i=0;i<br.length;i++)
// 			System.out.print(br[i]+" ");
// 			System.out.println();
	    return max;
	}
	// recursive------------------------
	
}

