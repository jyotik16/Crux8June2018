package contest;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class sortinglineratime {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] ar = takeinput(n);
		 long lStart = System.currentTimeMillis();
		
		int[] br = sort(ar,n);
		display(br);
		 long lend = System.currentTimeMillis();
		 long res = lend-lStart;
		 System.out.println(+res);
		 

	}
	public static int[] takeinput(int n) {
		
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("index " + i);
			arr[i] = scn.nextInt();
		}
		return arr;

	}
	public static int[] sort(int[] arr,int s) {
		Arrays.sort(arr);
		return arr;
	}

 	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
