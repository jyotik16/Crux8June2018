package contest2;
import java.util.Scanner;
import java.util.Stack;
public class Histrogram1 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) 
    {
        //int hist[] = {1,2,3,4,5};
		int n=scn.nextInt();
		long[] ar = new long[n];
        for(int i=0;i<n;i++) {
        	ar[i]=scn.nextInt();
        }
        
        System.out.println(getMaxArea(ar, ar.length));
    }
	static long getMaxArea(long arr[], int n) 
    {
        Stack<Integer> s = new Stack<>();
         
        long maxarea = 0; 
        int tp;  
        long areatop; 
        int i = 0;
        while (i < n)
        {
            
            if (s.empty() || arr[s.peek()] <= arr[i])
                s.push(i++);
              else
            {
                tp = s.peek();  
                s.pop();  
      
                areatop = (long) (arr[tp] * (s.empty() ? i : i - s.peek() - 1));
      
                if (maxarea < areatop)
                    maxarea = areatop;
            }
        }
           while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            areatop = (long) (arr[tp] * (s.empty() ? i : i - s.peek() - 1));
      
            if (maxarea < areatop)
                maxarea = areatop;
        }
         
        return maxarea;
 
    }
}
