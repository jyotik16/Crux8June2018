package contest1;

import java.util.Scanner;

public class FirstANDLastoccurence {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		int op=scn.nextInt(); //number to check
		int a=1;
		while(a<=op) {
			int num=scn.nextInt();
			Occurrence(ar,num);
			a++;
			
		}

}
	public static int[] takeinput(int n) {
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scn.nextInt();
	}
	return arr;
}
	public static void Occurrence(int[] ar,int num) {
		int i=0,j=ar.length-1,pos1=-1,pos2=-1;
		for(i=0;i<ar.length;i++) {
			if(ar[i]==num )
				{
				pos1=i; break;
				}
			}
		for(j=ar.length-1;j>=0;j--)
		{
			if(ar[j]==num && j>=i)
				{
				pos2=j; break;
				}
		}
		System.out.println(pos1+" "+pos2);
		
	}
}
