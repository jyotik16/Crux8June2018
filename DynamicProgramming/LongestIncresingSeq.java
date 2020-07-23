package DyanamicProgramming;

public class LongestIncresingSeq {
	public static void main(String[] args) {
		int arr[] = { 50, 3, 10, 7, 40, 80 };
	//	int[] arr = {3, 10, 2, 1, 20};
		int n = arr.length;
	//	System.out.println("Length of list is " + lis(arr, n));
		System.out.println(list(arr,n));
	}

	static int max_ref = 0;
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
		for( i=0;i<br.length;i++)
			System.out.print(br[i]+" ");
			System.out.println();
	    return max;
	}
	// recursive------------------------
	static int _lis(int arr[], int n) {

		if (n == 1)
			return 1;
		int res, max_ending_here = 1;

		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		// Compare 
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		// Return length of LIS ending with arr[n-1]
		return max_ending_here;
	}

	static int lis(int arr[], int n) {
		max_ref = 1;
		_lis(arr, n);
		return max_ref;
	}
}
