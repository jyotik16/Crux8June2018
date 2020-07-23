package contest2;

import java.util.Arrays;

public class OnlyLadder {

	public static void main(String[] args) {
	boolean[] ar=SOE(8);
	int[] rv=LadderB(ar,8);
	display(rv);
	CountgetBoardTD(0,8,rv,"");
	}
	public static int CountgetBoardTD(int cur,int end,int[] strg,String ans){
		int count;
		if(cur==end)
		{	
			return 1;
		}
		if(cur>end) {
			return 0;
		}
		if(strg[cur]!=0) {
			return strg[cur];
		}
		count=0;
		
		for(int i=1; i<=6 && cur+i<=end; i++) {
			if(strg[i]+cur==end) {
				System.out.print(ans+" ");
				System.out.println();
			}
			count+=CountgetBoardTD(cur+i,end,strg,ans+i);
			
		 }
		strg[cur]=count;
		return count;
		}
static void display(int[] ar) {
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
}
static boolean[]  SOE(int n) {
boolean[] primes = new boolean[n + 1];
Arrays.fill(primes, true);
primes[0] = false;
primes[1] = false;

for (int table = 2; table * table <= n; table++) { // this is an algorithm for finding prime number in given range. 
			if (primes[table] == true) {
				for (int mult = 2; mult * table <= n; mult++) {
					primes[mult * table] = false;

				}

			}

		}
//for (int i = 0; i < primes.length; i++) {
//		if (primes[i]) {
//			System.out.print(i+" ");
//					}
//				}
return primes;
	}
static int[] LadderB(boolean [] ar,int n) {
	int[] strg=new int[n+1];
	int left=0,right=ar.length-1;
	strg[1]=1;
	while(ar[left]==false) {
		left++;
	}
	//System.out.println(left);
	
	while(ar[right]==false) {
		right--;
	}
	//System.out.println(right);
	
	while(left<right) {
		if(ar[left]==true && ar[right]==true) {
		strg[left]=right;
		left++;
		right--;
		}
		else if(ar[left]==true && ar[right]==false) {
		right--;	
		}
		else if(ar[right]==true && ar[left]==false) {
			left++;
		}
		
	}
	return strg;
}

}
