package lec3_function;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		  Scanner scn = new Scanner(System.in);
		  int [] arr;
		  arr = new int [5];
		  
		  for(int i=0;i<5;i++)
			  arr[i]=scn.nextInt();
		  System.out.println("array before swaping.");
		  
		  for(int val:arr)
		  {
			  System.out.print(val+" ");
		  }
		  int m=0,n=2;
		  swaparray(arr,m,n);
		  System.out.println();
		  System.out.println("array after swaping.");
		  for(int val:arr)
		  {
			  System.out.print(val+" ");
		  }
		  
		  
	}
	public static void swaparray(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
