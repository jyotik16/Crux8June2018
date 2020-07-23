package contest;

import java.util.Scanner;

public class validInvalidseq {
static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = takeinput(n);
		boolean res1 = decs(n,arr);
		if(res1==false)
		{
			boolean res2 = incs(n,arr);	
			System.out.println(res1);
		}
		else
			System.out.println(res1);
		

}
	public static int[] takeinput(int n) {

		int[] ar = new int[n];
		for (int i = 0; i <n; i++) {
			ar[i] = scn.nextInt();
					}
		return ar;
	}
	public static boolean decs(int n,int[] arr) {
		
		int f=1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i+1]>=arr[i])
			{
				f=1;
			}
			else
			{
				f=0; break;
			}
		}
		if(f==1)
			return true;
		else
			return false;
		
	}
public static boolean incs(int n,int[] arr) {
		
		int f=1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<=arr[i+1])
			{
				f=1;
			}
			else
			{
				f=0; break;
			}
		}
		if(f==1)
			return true;
		else
			return false;
		
	}
}