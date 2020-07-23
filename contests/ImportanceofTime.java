package contest1;

import java.util.Scanner;
public class ImportanceofTime {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	int N = scn.nextInt(); int[] ar=new int[N];
		for(int i=0;i<N;i++)
			ar[i]=scn.nextInt();
	int[] br=new int[N];
		for(int j=0;j<N;j++)
			br[j]=scn.nextInt();
	int [] res=Time(ar,br);
	int sum=0;
		for(int i=0;i<N;i++) {
			//System.out.print(res[i]+" ");
			sum=sum+res[i];
		}	
			System.out.print(sum+" ");
		
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
public static int[] Time(int[] ar,int[] br) {
	int totaltime=1,Rotatetime=0; int[] res=new int[ar.length];
	
	for(int i=0;i<ar.length;i++) {
			totaltime=0;
			if(ar[i]==br[i]) {
				totaltime=1;
			}
			else {
				Rotatetime = rotate(ar,i,br,1);
			}
			res[i]=totaltime+Rotatetime;
			Rotatetime=0; 
			
		}
		
		return res;
}
public static int rotate(int[] ar,int indx,int[] br,int count) {
		int temp=ar[indx]; 
		if(ar[indx]==br[indx])
			return count;
		for(int k=indx;k<ar.length-1;k++) {
			ar[k]=ar[k+1];
			}
		ar[ar.length-1]=temp;
		//display(ar);
		count++;
		int cr=rotate(ar,indx,br,count);
		return cr;
		}

}
