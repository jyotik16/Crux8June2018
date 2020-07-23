package contest;
import java.util.Arrays;
import java.util.Scanner;

public class alexgoesshopping {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		//num of items	
		int n = scn.nextInt();
		int[] arr = new int[n];
		int i=0; int q;int A=0,k=0;
		//prices of items
		while(i<arr.length) {
			arr[i]=scn.nextInt();
			i++;
		}
		Arrays.sort(arr);
		
		// number of queries
		q=scn.nextInt(); int a=1;
		while(a<=q)	{
		
		A=scn.nextInt(); k=scn.nextInt();
		int c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>A)
				{
					continue;
				}
				else if(arr[j]==A)
				{
					c++;
				}
				else {
				int sum = 0;
				while (sum <= A) {
					
					if (sum == A) {
						c++;
						break;
						}
					sum = sum + arr[j];
					}
				}
			
			a++;
		}
	}
}

	public static void output(int c, int k) {

		if (c >= k) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}