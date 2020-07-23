package contest2;

import Lec8_Stack.Stack;

public class ArrayGame {

	public static void main(String[] args){
		int n=3;
		int[] arr= {4,1,0,1,1,0,1};
		//System.out.println(VivekGame(arr,0,n));
		System.out.println(Game(arr));
	}
	public static int VivekGame(int[] arr,int firstindx,int endindx) {
		int mid=(firstindx+endindx)/2,c1=0,c2=0;
		if(mid==0) {
			return 1;
		}
		if(firstindx==endindx) {
			return 0;
		}
		if(firstindx>endindx) {
			return 0;
		}
		
	
		c1+=VivekGame(arr,firstindx,mid);
		c2+=VivekGame(arr, mid+1,endindx);
		
		return (c1+c2);
	}
	static int count=0;
	public static int Game(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int mid=(i+arr.length)/2;
			
			int r1=sumarr(i,mid-1,arr);
			int r2=sumarr(mid,arr.length-1,arr);
			if(r1==r2) {
				count++;
				i=i+mid-1;
		}
	}
		return count;
}
	public static int sumarr(int f,int e,int[] ar) {
		int sum=0;
		for(int i=f;i<=e;i++) {
		sum=sum+ar[i];
	}
		return sum;
	}
		
		
	}
	


