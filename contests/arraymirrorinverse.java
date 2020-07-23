package contest;
import java.util.Scanner;

public class arraymirrorinverse {
	public static Scanner scn = new Scanner(System.in);
			public static void main(String[] args) {

		int[] ar = takeinput();
		arraymirror(ar);
		

	}

	public static int[] takeinput() {
		// System.out.println("size:");
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			// System.out.println("index " + i);
			arr[i] = scn.nextInt();
		}
		return arr;
	}
			
	public static void arraymirror(int[] arr) {
		int len = arr.length;
		//System.out.println("len="+len);
		int t = 0;
		for (int k = 0; k < arr.length; k++) {
			int p = arr[k];
			if (k == arr[p]) {
				t++;
			} 
			else {
				t--;
			}
			
		}

		if (t == len)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
