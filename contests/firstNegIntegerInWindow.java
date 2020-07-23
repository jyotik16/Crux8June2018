package contest2;

import java.util.Scanner;
public class firstNegIntegerInWindow {

	static Scanner scn = new Scanner(System.in);
		public static void main(String[] args) {
			int Test = scn.nextInt();
		
			while (Test>0) {

				int n = scn.nextInt();
				int k = scn.nextInt();  //window size
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = scn.nextInt();
				}
				NegInteger(arr,k);
				
				Test--;
			}
		}
		public static void NegInteger(int[] arr,int k) {
		 int flag=0;
			for(int i=0;i<arr.length;i++) {
				flag=0;
				if((i+k)>arr.length) 
				{
					return ;
				}
				for(int j=i,m=0;m<k && (i+k)<=arr.length;j++,m++) {
					if(arr[j]<0)
						{
						
						System.out.print(arr[j]+" ");
						flag=1;
						break;
						}
					
				}
				if(flag==0) {
					System.out.print("0 ");
				}
			}
			
			
		}
}
		
