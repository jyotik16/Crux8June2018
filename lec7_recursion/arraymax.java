package lec7_recursion;

import java.util.Scanner;

public class arraymax {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		int res = maximum1(ar,0);
		System.out.println(res);

}
	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	//method 1
	public static int maximum(int[] arr,int vidx,int max) {
		//int max=-1;
		if(vidx==arr.length)
			return max;
		if(max<arr[vidx])
		{
		max=arr[vidx]; 
		
		}
		int res = maximum(arr,vidx+1);
		return res;
		
		
	}
	//method 2
	public static int maximum1(int[] arr,int vidx) {
		int max=Integer.MIN_VALUE,a,res=-1;
		if(vidx==arr.length)
			{
			a=arr[arr.length-1];
			if(a>res)
				return a;
			else
				return res;
			}
		if(max<arr[vidx])
		{
		max=arr[vidx]; 
		
		}
		 res = maximum1(arr,vidx+1);
		return res;
		
		
	}
	//method 3
	public static int maximum2(int[] arr,int vidx) {
		int max=Integer.MIN_VALUE,a,res=-1;
		if(vidx==arr.length)
			return max;
		
		 res = maximum2(arr,vidx+1);
		 if(arr[vidx]>res)
			 return res;
		 else
			 return arr[vidx];
		
		
	}
}