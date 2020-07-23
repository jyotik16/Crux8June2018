package lec7_recursion;

import java.util.Scanner;

public class findlastindex {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		int item = scn.nextInt();
		int res = findlastindex(ar,0,item);
		
		System.out.println(res);

}
public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
public static int findlastindex(int[] arr,int vidx,int item) {
		int f=0,res=-1;
		if(vidx==arr.length)
			{
			return -1;
			}
			res = findlastindex(arr,vidx+1,item);
		if(arr[vidx]==item && res==-1)
			{
			return vidx; 
			
			}
		
			return res;
	
	}


}



