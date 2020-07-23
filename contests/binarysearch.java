package lec3_function;

import java.util.Scanner;

public class binarysearch {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] ar = takeinput();
		//display(ar);
		int item =scn.nextInt();
		search(ar,item);
		//System.out.println(a);
		
	}
	public static int[] takeinput() {
		//System.out.println("size:");
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("index " + i);
			arr[i] = scn.nextInt();
		}
		return arr;

	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void search(int[] arr,int item) {
		int beg=0; int end=arr.length-1; int c=0;
		int mid=(beg+end)/2;
		while(beg<=end || arr[mid]==item)
		{
			
			if(arr[mid]<item)
				beg=mid+1;
			else if(arr[mid]>item)
				end=mid-1;
			else
				{
				//return mid;
				System.out.println(mid); c++; break;
				}
			 mid=(beg+end)/2;
		
		}
		if(c==0)
			System.out.println("-1");
	}
}
