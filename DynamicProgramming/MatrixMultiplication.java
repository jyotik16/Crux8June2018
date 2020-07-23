package DynamicProgramming;

import java.util.Scanner;

public class MatrixMultiplication {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int n = scn.nextInt();
		// int[] ar = { 2, 3, 5, 1, 4 };
		// System.out.println(MCMTD(ar,0,ar.length-1,new int[ar.length][ar.length]));
		// System.out.println(MCMBU(ar,0,ar.length-1,new int[ar.length][ar.length]));
		// System.out.println(WineTD(ar, 0, ar.length - 1, new
		// int[ar.length][ar.length]));
		// System.out.println(WineBU(ar));
//		int[] weight = { 1, 3, 4, 5 };
//		int[] prices = { 1, 4, 5, 7 };
//		int cap = 7;
	//	System.out.println(KnapsackTD(weight, prices, 0, cap, new int[weight.length + 1][cap + 1]));
	//	System.out.println(KnapsackBU(weight, prices, cap));
		int[] ar= {40,60,20};
	//	System.out.println(MT(ar,0,ar.length-1));
	//	System.out.println(MTTD(ar,0,ar.length-1,new int[ar.length][ar.length]));
		int[] prices = {0,1,5,8,9,10,17,17,20};
		System.out.println(Rodcutting(prices,prices.length-1));
		System.out.println(RodcuttingTD(prices,prices.length-1,new int[prices.length]));
		System.out.println(RodcuttingBU(prices,prices.length-1,new int[prices.length]));
	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {
		if (si + 1 == ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fc = MCMTD(arr, si, k, strg);
			int sc = MCMTD(arr, k, ei, strg);
			int sw = arr[si] * arr[k] * arr[ei];
			int ans = fc + sc + sw;
			if (ans < min) {
				min = ans;
			}

		}

		strg[si][ei] = min;
		return strg[si][ei];

	}

	public static int MCMBU(int[] arr, int si, int ei, int[][] strg) {

		int n = arr.length - 1;
		for (int slide = 1; slide <= n; slide++) {
			for (si = 0; si <= n - slide; si++) {
				ei = si + slide;
				if (si + 1 == ei) {
					strg[si][ei] = 0;
				} else {
					int min = Integer.MAX_VALUE;
					for (int k = si + 1; k <= ei - 1; k++) {
						int fc = strg[si][k];
						int sc = strg[k][ei];
						int sw = arr[si] * arr[k] * arr[ei];
						int ans = fc + sc + sw;
						if (ans < min) {
							min = ans;
						}
					}
					strg[si][ei] = min;
					// return strg[si][ei];
				}
			}
		}
		return strg[0][n];

	}

	public static int WineTD(int[] arr, int si, int ei, int[][] strg) {
		int n = arr.length;
		int yr = arr.length - (ei - si + 1) + 1;
		if (si == ei) {
			return arr[si] * yr;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int fc = WineTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int lc = WineTD(arr, si, ei - 1, strg) + arr[ei] * yr;
		int ans = Math.max(fc, lc);
		strg[si][ei] = ans;

		return strg[si][ei];

	}

	public static int WineBU(int[] arr) {
		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 0; slide < arr.length; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;
				int yr = arr.length - (ei - si + 1) + 1;
				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
				} else {
					int fc = strg[si + 1][ei] + arr[si] * yr;
					int lc = strg[si][ei - 1] + arr[ei] * yr;
					int ans = Math.max(fc, lc);
					strg[si][ei] = ans;

				}

			}
		}
		return strg[0][n - 1];

	}

	public static int KnapsackTD(int[] weight, int[] prices, int vidx, int cap, int[][] strg) {

		if (vidx == weight.length) {

			return 0;
		}
		if (strg[vidx][cap] != 0) {
			return strg[vidx][cap];
		}
		// exclude
		int exclude = KnapsackTD(weight, prices, vidx + 1, cap, strg);
		int include = 0;
		// include
		if (weight[vidx] <= cap) {
			include = KnapsackTD(weight, prices, vidx + 1, cap - weight[vidx], strg) + prices[vidx];
		}
		int ans = Math.max(exclude, include);
		strg[vidx][cap] = ans;
		return ans;

	}

	public static int KnapsackBU(int[] weight, int[] prices, int cap) {
		int nr = weight.length + 1;
		int nc = cap + 1;
		int[][] strg = new int[nr][nc];

		for (int row = 1; row < nr; row++) {
			for (int col = 1; col < nc; col++) {
				int include = 0;
				// include
				if (weight[row - 1] <= col) {
					include = strg[row - 1][col - weight[row - 1]] + prices[row - 1];
				}
				// exclude
				int exclude = strg[row - 1][col];
				int ans = Math.max(exclude, include);
				strg[row][col] = ans;
			}

		}
		return strg[nr - 1][nc - 1];

	}

	public static int MT(int[] arr, int si, int ei) {
		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {
			
			int fresultcolor = color(arr, si, k);
			int sresultcolor = color(arr, k+1, ei);
			int fs =MT(arr,si,k);
			int ss =MT(arr,k+1,ei);
			
			int sw = fresultcolor*sresultcolor;
			int ans = fs+ss+sw;
			if(ans<min) {
				min=ans;
			}

		}
		return min;

	}

	public static int color(int[] ar, int i, int j) {
		int sum=0;
		for(int k=i;k<=j;k++) {
			sum+=ar[k];
		}
		return sum%100;

	}

	public static int MTTD(int[] arr, int si, int ei,int[][] strg) {
		if(si==ei) {
			return 0;
		}
		if(strg[si][ei]!=0) {
			System.out.println(si+" : "+ei+" "+strg[si][ei]);
			return strg[si][ei];
		}
		int min=Integer.MAX_VALUE;
		for(int k=si;k<=ei-1;k++) {
			int fc=MTTD(arr,si,k,strg);
			int sc=MTTD(arr,k+1,ei,strg);
			int sw=color(arr, si, k)*color(arr, k+1, ei);
			int ans=fc+sc+sw;
			System.out.println(ans);
			if(ans<min) {
				min=ans;
			}
			
		}
		return min;	
		
	}
	public static int MTBU(int[] arr, int si, int ei,int strg) {
		for (int slide = 1; slide < arr.length; slide++) {
			for (si = 0; si <= arr.length - slide - 1; si++) {

				if (si == ei) {
					return 0;
				} else {
					int min = Integer.MAX_VALUE;
					for (int k = si; k <= ei - 1; k++) {
						int fresultcolor = color(arr, si, k);
						int sresultcolor = color(arr, k + 1, ei);
						int fs = strg[];
						int ss = MT(arr, k + 1, ei);

						int sw = fresultcolor * sresultcolor;
						int ans = fs + ss + sw;
						if (ans < min) {
							min = ans;
						}

					}
				}

			}
		}
	}	



	public static int Rodcutting(int[] arr,int n) {
		int len=arr.length;
		if(n==0) {
			 return 0;
		}
		
		int max=arr[n];
		int left=1;
		int right=n-1;
		while(left<=right) {
		int fc = Rodcutting(arr,left);
		int sc = Rodcutting(arr,right);
		int ans = fc+sc;
		if(max<ans) {
			max=ans;
		}
		left++;
		right--;
		}
		return max;
	}

	public static int RodcuttingTD(int[] arr,int n,int[] strg) {
		int len=arr.length;
		if(n==0) {
			 return 0;
		}
		if(strg[n]!=0) {
			return strg[n];
		}
		int max=arr[n];
		int left=1;
		int right=n-1;
		while(left<=right) {
		int fc = Rodcutting(arr,left);
		int sc = Rodcutting(arr,right);
		int ans = fc+sc;
		if(max<ans) {
			max=ans;
		}
		
		left++;
		right--;
		}
		strg[n] = max;
		return strg[n];
	}
	public static int RodcuttingBU(int[] arr,int n,int[] strg) {
		int len=arr.length;
		for(int i=1;i<len;i++) {
		
//		if(strg[i]!=0) {
//			return strg[i];
//		}
		int max=arr[i];
		int left=1;
		int right=i-1;
		while(left<=right) {
		int fc = strg[left];
		int sc = strg[right];
		int ans = fc+sc;
		if(max<ans) {
			max=ans;
		}
		
		left++;
		right--;
		}
		strg[i] = max;
		}
		return strg[n];
	}
}
