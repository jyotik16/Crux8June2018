/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;

import java.util.Scanner;
import java.util.Stack;
public class MinimumJumpsReq {
    static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
    int t= scn.nextInt();
    while(t>0){
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int k=0;k<n;k++)
    arr[k] = scn.nextInt();
	System.out.println(jumps(arr));
	t--;
    }
}

	static int jumps(int[] arr) {

		if (arr.length <= 1)
            return 0;
		if (arr[0] == 0)
            return -1;
		int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
        Stack<Integer> ss = new Stack<>();
        for (int i = 1; i < arr.length; i++)
        {
            // Check if we have reached the end of the array
            if (i == arr.length - 1)
                return jump;
 
        if(ss.empty())
            ss.push(arr[i]+i);
        if(!ss.empty() || ss.peek()<=arr[i])
        	ss.push(arr[i]+i);
       
        maxReach = Math.max(maxReach, ss.peek());
        step--;
        
        if (step == 0)
        {
            
            jump++;
              
            //Check if the current index/position  or lesser index
            // is the maximum reach point from the previous indexes
            if(i>=maxReach)
                return -1;
           
            step = maxReach - i;
            if(!ss.empty())
            	ss.pop();
        }
    }

    return -1;
        
	}
}

