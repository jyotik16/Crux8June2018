package lec3_function;

import java.util.Scanner;

public class linearsearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ar = takeinput();
		//display(ar);
		int item =scn.nextInt();
		int res=search(ar,item);
		System.out.println(res);
		
	}
	public static int[] takeinput() {
		//System.out.println("size:");
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("index " + i);
			arr[i] = scn.nextInt();
		}
		return arr;

	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int search(int[]arr,int item)
	{     int c=-1;
		for (int i = 0; i < arr.length; i++) {
			if(item == arr[i])
			{   c=i; break;}
			
		}
		if(c==-1)
			return -1;
		else
			return (c);
		}
}



