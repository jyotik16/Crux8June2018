package lec3_function;

import java.util.Scanner;

public class selectionsort {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = takeinput();
		selectionsort(ar);
		display(ar);

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
