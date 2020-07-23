package lec7_recursion;

import java.util.Scanner;

public class findfirstindex {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		int item = scn.nextInt();
		int res = findfirstindex2(ar,0,item);
		System.out.println(res);

}
public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
public static int findfirstindex(int[] arr,int vidx,int item) {
		int index=-1,f=0;
	`	if(vidx==arr.length)
			return arr.length-1;
		
		if(arr[vidx]==item)
			{
			index=vidx; f=1;
			}
		if(f==1)
			return index;
		int res = findfirstindex(arr,vidx+1,item);
		return res;
	}
//method 1
public static int findfirstindex1(int[] arr,int vidx,int item) {
		int index=-1,f=0;
	if(vidx==arr.length)
			return arr.length-1;
		
		if(arr[vidx]==item)
			{
			return vidx;
			}
		
		int res = findfirstindex1(arr,vidx+1,item);
		return res;
	}
//method 2
public static int findfirstindex2(int[] arr,int vidx,int item) {
	
	if(vidx==arr.length)
		return -1;
	int res = findfirstindex2(arr,vidx+1,item);
	if(arr[vidx]==item)
		{
		return vidx;
		}
		return res;
}

}
