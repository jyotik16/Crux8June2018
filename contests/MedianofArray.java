package contest1;

import java.util.Scanner;

public class MedianofArray {

static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int N1 = scn.nextInt();		int[] ar = new int[N1];
		for(int i=0;i<N1;i++)
			ar[i]=scn.nextInt();
		int N2 = scn.nextInt(); 	int[] br = new int[N2];
		for(int i=0;i<N2;i++)
			br[i]=scn.nextInt();
		Median(ar,br,N1,N2);
}
	public static void Median(int[] ar,int[] br,int N1,int N2) {
		int[] cr = new int[N1+N2];
		int i=0,j=0,k=0;
		while(i<N1 && j<N2) {
			if(ar[i]<=br[j])
			{
				cr[k++]=ar[i++]; 
			}
			else
			{
				cr[k++]=br[j++]; 
			}
		}
		if(i<N1) {
		cr[k++]=ar[i++]; }
		if(j<N2) {
			cr[k++]=br[j++];
		}

	for(int a=0;a<cr.length;a++)
			System.out.print(cr[a]+"  ");
	int len = N1+N2; int med;
	if(len%2==0)
	{
		int a=len/2; int b=len/2-1; 
		 med = (cr[a]+cr[b])/2; 
	}
	else
	{
		int a=len/2;  med = cr[a];
	}
	System.out.println(med);
}
	
}