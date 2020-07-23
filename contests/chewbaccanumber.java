package contest;
import java.util.Scanner;
public class chewbaccanumber {
	
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			int x = scn.nextInt();
			int n = x;
			int count=0;
			int i;
			while (n > 0) {
				n = n / 10;
				count++;
			}
			int arr[] = new int[count];
			for ( i = arr.length - 1; i >= 0; i--) {
				int rem = x % 10;
				if(i!=0 && rem==9) 
					arr[i]=0;
					else if(i==0 && rem==9)
				arr[i] = 9;
					else if(rem>=5)
						arr[i]=9-rem;
					else
						arr[i]=rem;
				x = x / 10;
			}
			for(int val:arr)
			System.out.print(val);
		
		}
}
