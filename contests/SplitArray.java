package contest2;
import java.util.Scanner;
public class SplitArray {
	
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
		//	 int n=scn.nextInt();
		//	 int[] arr= new int[n];
		//	 for(int i=0;i<n;i++){
		//	     arr[i]=scn.nextInt();
		//	 }
			 int[] arr= {4,1,0,1,1,0,1};
			 //System.out.println(SplitACount(arr,0,0,0,"",""));
			 SplitA(arr,0,0,0,"","");
			 
		}
public static int SplitACount(int[] arr,int vidx,int sum1,int sum2,String asf1,String asf2) {
			int c1=0,c2=0,c=0;
			if(vidx==arr.length) {
				if(sum1==sum2) {
					c++;
				}
				return c;
			}
			c=0;
			c1+=SplitACount(arr,vidx+1,sum1+arr[vidx],sum2,asf1+" "+arr[vidx],asf2);
			c2+=SplitACount(arr,vidx+1,sum1,sum2+arr[vidx],asf1,asf2+" "+arr[vidx]);
			return c1+c2;
			
		}
public static void SplitA(int[] arr,int vidx,int sum1,int sum2,String asf1,String asf2) {
	
	if(vidx==arr.length) {
		if(sum1==sum2) {
			System.out.println(asf1+" and"+asf2);
			return;
		}
		return;
	}
	SplitA(arr,vidx+1,sum1+arr[vidx],sum2,asf1+" "+arr[vidx],asf2);
	SplitA(arr,vidx+1,sum1,sum2+arr[vidx],asf1,asf2+" "+arr[vidx]);
	
	
}
}
