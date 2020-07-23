package lec8_complexcity;

import java.util.Scanner;
public class MaxSubarraySum {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
	int Test = scn.nextInt(); int a=1;
	while(a<=Test){
		
		int n = scn.nextInt(); int[] arr = new int[n];
		for(int i=0;i<n;i++)
			{
			
			arr[i]=scn.nextInt();
			}
		int res = maxSubArraySum(arr, 0, n-1);
			//System.out.println();
			System.out.println(res);
			
		a++;
		}
	}

	static int maxSubArraySum(int arr[], int l,int h)
	{
		int sum=0,max=Integer.MIN_VALUE;
	for(int i=1;i<=h;i++) {
		if(arr[i]<0 && arr[i-1]<0)
			continue;
		else if(arr[i]<0 && arr[i-1]>0)
			{
			sum=sum+arr[i]+arr[i-1];
			arr[i]=sum;
			sum=0;
			}
		else if(arr[i]>0 && arr[i-1]>0)
		{
			sum=sum+arr[i]+arr[i-1];
			arr[i]=sum;
			sum=0;
		}
			continue;
	}
	for(int j=0;j<arr.length;j++) {
		
		 if(max<arr[j])
			max=arr[j];
	}
	return max;
	}
}
