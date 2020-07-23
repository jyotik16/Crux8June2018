package contest1;
import java.util.Scanner;
public class RecPalindrome {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int N = scn.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < ar.length; i++)
			ar[i] = scn.nextInt();
		int c = ar.length;
		int res= Ispalindrome(ar, 0);
		//System.out.println(res);
		int rem=0,flag=1;
		for(int i=ar.length-1;i>=0;i--)
		{
			rem=res%10;//System.out.println(" r="+rem+"ar="+ar[i]);
			res=res/10;
			if(ar[i]!=rem)
			{
				flag=0; break; 
			}
			
			
		}
		if(flag==0)
			System.out.println("false");
		else
			System.out.println("true");
		

	}
	public static int Ispalindrome(int[] ar, int vidx) {
		int[] br=new int[ar.length];
		if(vidx==ar.length-1)
			return ar[vidx];
		int rv =ar[vidx]+Ispalindrome(ar,vidx+1)*10;
		return rv;
		

	}

}
