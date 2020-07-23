package contest;

import java.util.Scanner;

public class reversearray {
	static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	int[] ar = takeinput();
	reverse(ar);
}	
public static int[] takeinput() {
	int n = scn.nextInt();  //size
	int[] arr = new int[n];

	for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
	}
	return arr;
}
public static void reverse(int[] arr) {
	
	for (int i = arr.length-1; i >=0; i--) {

		System.out.println(arr[i]);
	}
	
}

}
