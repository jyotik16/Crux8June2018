package CodeSimple;

public class subsetsTarget {

    public boolean subsetSum(int input[], int total) {

        boolean T[][] = new boolean[input.length + 1][total + 1];
        for (int i = 0; i <= input.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (j - input[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - input[i - 1]];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[input.length][total];

    }
    boolean isSubsetSum(int[] set, int n, int sum)
    {
        // The value of subset[i][j] will be true if there is a 
        // subset of set[0..j-1] with sum equal to i
        boolean[][] subset = new boolean [n+1][sum+1];
      
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
          subset[i][0] = true;
      
        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++)
          subset[0][i] = false;
      
         // Fill the subset table in botton up manner
         for (int i = 1; i <= n; i++)
         {
           for (int j = 1; j <= sum; j++)
           {
             if(j<set[i-1])
             subset[i][j] = subset[i-1][j];
             if (j >= set[i-1])
               subset[i][j] = subset[i-1][j] || 
                                     subset[i - 1][j-set[i-1]];
           }
         }
      
         /*   // uncomment this code to print table
         for (int i = 0; i <= n; i++)
         {
           for (int j = 0; j <= sum; j++)
              printf ("%4d", subset[i][j]);
           printf("n");
         }*/
      
         return subset[n][sum];
    }
    
    public static void main(String args[]) {
        subsetsTarget ss = new subsetsTarget();
        long start = System.currentTimeMillis();
        
              
        long end = System.currentTimeMillis();
		System.out.println("Time1 : " + (end - start));
		
		
		long start1 = System.currentTimeMillis();
        int arr1[] = {2, 3, 7, 8};
        System.out.println(ss.subsetSum(arr1, 11));
        
        long end1 = System.currentTimeMillis();
		System.out.println("Time2 : " + (end1 - start1));
    }
}
