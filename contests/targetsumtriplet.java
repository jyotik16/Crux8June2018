package contest;

import java.util.Scanner;

public class targetsumtriplet {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		selectionsort(arr);
		int sum = scn.nextInt();
		targetsum(arr, sum);
	}

	public static int[] takeinput(int size) {
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {

			ar[i] = scn.nextInt();
		}
		return ar;
	}
	public static void targetsum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			int p = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int q = arr[j]; 
				for (int k = j + 1; k < arr.length; k++) {
					int r=arr[k];
					if ((r + p + q) == sum) {
						ascending(p, q, r);
					}
				}
			}

		}
	}
	public static void ascending(int a,int b,int c) {

		
		if (a < b & a < c)
            System.out.println(a + ",  " + b + " and " + c);

        if (b < c & b < a)
            System.out.println(b + ",  " + c + " and " + a);

        if (c < a & c < b)
            System.out.println(c + ",  " + b + " and " + a);
	}
	public static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<arr[min])
						min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
}
