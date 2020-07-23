package contest1;

import java.util.Scanner;

public class RecIsArraySorted {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		int N = scn.nextInt();
		int[] ar = new int[N];
		for(int i=0;i<ar.length;i++)
			ar[i] = scn.nextInt();
		int c=ar.length;
		int res=sorted(ar,c);
		if(res!=0)
			System.out.println("true");
		else
			System.out.println("false");
			
	
}
	public static int sorted(int[] arr,int n) {
		
        if (n == 1 || n == 0)
            return 1;
        if (arr[n-1] < arr[n-2])
            return 0;
         return sorted(arr, n-1);
}
}