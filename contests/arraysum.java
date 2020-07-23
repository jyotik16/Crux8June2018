package contest;
import java.util.ArrayList;
import java.util.Scanner;

public class arraysum {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=scn.nextInt();
		int[] one=takeinput(n); // call array fun
		int m=scn.nextInt();
		int[] two=takeinput(m);  // call array fun
		sum(one,two);

	}
	public static int[] takeinput(int n) {

		int[] ar = new int[n];
		for (int i = 0; i<n; i++) {
			ar[i] = scn.nextInt();
		}
		return ar;
	}
	public static void sum(int[] ar,int[] br) {
		ArrayList<Integer> ans=new ArrayList<>();
		int i=ar.length-1,j=br.length-1,carry=0,rem=0;
		while(i>=0||j>=0)
		{
			int sum=carry;
			if(i>0)
			{
				sum+=ar[i];
			}
			if(j>0)
			{
				sum+=br[i];
			}
			rem=sum%10;
			ans.add(0,rem);
			carry=sum/10;
			i--; j--;
			
		}
		if(carry!=0)
		ans.add(0,carry);	
		System.out.println(ans);
	}
	
}
