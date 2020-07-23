package contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class pasacal
{
    public static void main(String args[])
	{    
		Scanner scan = new Scanner(System.in);
		int r,i, number=1, j;
		r = scan.nextInt();
		ArrayList<Integer> in = new ArrayList<>();
		for( i=0;i<r;i++)
			in.add(scan.nextInt());
		ArrayList<Integer> rr =subarray(in);
		System.out.println(rr);
		//r = scan.nextInt();

		//		direct syso
//		for(i=0;i<r;i++)
//		{
//			number = 1;
//			for(j=0;j<=i;j++)
//			{
//				 System.out.print(number+ " ");
//                 number = number * (i - j) / (j + 1);
//			}
//			System.out.println();
//		}
		/*solve(r);
		System.out.println();
		generate(r);
		getRow(r);*/
	}
    //arrayList
    public static void  solve(int r){
    	ArrayList<ArrayList<Integer>> ans  =  new ArrayList<ArrayList<Integer>>();	
    	
    	
    	for(int i=0;i<r;i++)
		{
			int number = 1;
			ArrayList<Integer> subans = new ArrayList<Integer>();
 			for(int j=0;j<=i;j++)
			{			 
				subans.add(number);	
                 		number = number * (i - j) / (j + 1);
			}
 			ans.add(i,subans);
			
		}
    	System.out.print(ans);
    }
    
    //only array
	public static void generate(int A) {
		int[][] result = new int[A][];
		
		for (int i = 1; i <= A; i++) {
			result[i - 1] = new int[i];
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					result[i - 1][j - 1] = 1;
					continue;
				} else
					result[i - 1][j - 1] = result[i - 2][j - 2] + result[i - 2][j - 1];
			}
		}
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void getRow(int A) {
		ArrayList<Integer> subans = new ArrayList<Integer>();
		int number;
		for(int i=0;i<=A;i++)
		{
			 number = 1;
			
 			for(int j=0;j<=i;j++)
			{
 				if(i==A)
      				subans.add(number);
				
                 number = number * (i - j) / (j + 1);
                 
			}
 				
		}
		
		System.out.println(subans);
	}
	public static ArrayList<Integer> subarray(ArrayList<Integer> A) {
        ArrayList<Integer> maxRange = new ArrayList<Integer>();
        ArrayList<Integer> curRange = new ArrayList<Integer>();
        long maxSum = Integer.MIN_VALUE;
        long curSum = 0;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) >= 0) {
                curSum += A.get(i);
                curRange.add(A.get(i));
        if((maxSum == curSum && maxRange.size() < curRange.size()) || maxSum < curSum)  {
                    maxSum = curSum;
                    maxRange = new ArrayList<>(curRange);
                }                            
            }            
            else {
                curSum = 0;
                curRange = new ArrayList<>();
            }
        }
       return maxRange;
    }
}

1 
1 1 
1 2 1 
1 3 3 1 

