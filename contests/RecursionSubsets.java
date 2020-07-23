package contest2;

import java.util.Scanner;

public class RecursionSubsets {
	
		static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
//			int n=scn.nextInt();
//			 int[] arr= new int[n];
//			 for(int i=0;i<n;i++){
//			     arr[i]=scn.nextInt();
//			 }
			 int[] arr= {1,2,3,4,5};
			 int t=9;
			// System.out.println(ArraySubsetsC(arr,0, 0,0,"","", t));
			 ArraySubsets(arr,0,0,0,"","",4);
			}
		public static void ArraySubsets(int[] arr,int vidx,int sum1,int sum2 ,String asf1,String asf2 ,int target) {
			
			if(vidx==arr.length) {
				if(sum1==sum2)
					System.out.println(asf1+" and "+asf2);
				return;
			}
			
			ArraySubsets(arr,vidx+1,sum1+arr[vidx],sum2,asf1+" "+arr[vidx],asf2,target);
			ArraySubsets(arr,vidx+1,sum1,sum2+arr[vidx],asf1,asf2+" "+arr[vidx],target);
			
			
		}
public static int ArraySubsetsC(int[] arr,int vidx,int sum1,int sum2 ,String asf1,String asf2 ,int target) {
			int c=0;
			if(vidx==arr.length) {
				if(sum1==target)
				{
					return 1;
				}
				return 0;
			}
			c=0;
			c+=ArraySubsetsC(arr,vidx+1,sum1+arr[vidx],sum2,asf1+" "+arr[vidx],asf2,target);
			c+=ArraySubsetsC(arr,vidx+1,sum1,sum2+arr[vidx],asf1,asf2+" "+arr[vidx],target);
			return c;
			
		}

}
