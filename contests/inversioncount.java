package contest1;

import java.util.Scanner;

public class inversioncount {
	//static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test=scn.nextInt();
		int a=1;
		while(a<=test)
		{
			int N=scn.nextInt();
			int b=0;
			int[] arr=new int[N];
			while(b<N) {
				
				arr[b]=scn.nextInt();
				b++;
			}
			int res = count(arr,N);
			System.out.println(res);
			a++;
		}
	}
public static int count(int[] arr,int N) {
	int c=0;
	for(int i=0;i<N;i++)
	{
		for(int j=i+1;j<N;j++)
		{
			if(arr[i]>=arr[j] && i<j)
				{
				c++; 
				}
		}
	}
	return c;
}
}
