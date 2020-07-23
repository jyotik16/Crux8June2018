package DyanamicProgramming;

import java.util.Scanner;
import java.util.Stack;

public class minimumJumpsReq {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	//	int[] arr = { 1, 3, 9, 8, 5, 2, 6, 7, 6, 8, 9, 1, 2, 3, 1, 2 };
	 int [] arr = {1,3,9,5,2,6,7,6,8,9};
	//	System.out.println(jumps(arr));
	 System.out.println(countStrings(5));
	}
	static  int countStrings(int n)
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
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
