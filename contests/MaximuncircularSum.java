package contest1;
import java.util.Scanner;
public class MaximuncircularSum {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
	int Test = scn.nextInt(); int a=1;
	while(a<=Test){
		
		int n = scn.nextInt(); 
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			{
			
			arr[i]=scn.nextInt();
			}
		int res = maxCircularSum(arr);
			
			System.out.println(res);
			
			scn.nextLine();
			
		a++;
		}
	}
    static int kadane (int a[])
    {
        int n = a.length;
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
    
        public static int maxCircularSum (int a[])
        {
            int n = a.length;
     
            // Case 1: get the maximum sum using standard kadane'
             int max1 = kadane(a);
           
     
            // Case 2: Now find the maximum sum that includes
            // corner elements.
            int max2  =  0;
            for (int i = 0; i < n; i++)
            {
                max2 += a[i]; // Calculate array-sum
                a[i] = -a[i];  // invert the array (change sign)
            }
     
            // max sum with corner elements will be:
            // array-sum - (-max subarray sum of inverted array)
            
            max2 = max2 + kadane(a);
                       
            // The maximum circular sum will be maximum of two sums
            return (max2 > max1)? max2: max1;
        }
     
}