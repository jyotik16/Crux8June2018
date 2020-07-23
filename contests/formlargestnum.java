package contest;
import java.util.Scanner;
public class formlargestnum {
	  static Scanner scn = new Scanner(System.in);

	    public static void main(String[] args) {
	int ch=scn.nextInt();
	for(int k=1;k<=ch;k++) {
	        int[] arr = takeinput();
	        bubblesort(arr);
	        int[] copy = COPY(arr);
	        int i = largest(copy);
	        printmax(arr, i);
	        }
	    }

	    public static int[] takeinput() {
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scn.nextInt();
	        }
	        return arr;
	    }

	    public static void bubblesort(int[] arr) {
	        for (int i = arr.length; i > 0; i--) {
	            for (int j = 0; j < i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j + 1];
	                    arr[j + 1] = arr[j];
	                    arr[j] = temp;
	                }
	            }

	        }
	    }

	    public static int findmax(int[] arr) {
	        int max = 0;
	        int i = 0;
	        for (i = 0; i < arr.length; i++) {
	            if (arr[max] < arr[i])
	                max = i;
	        }
	        return max;
	    }

	    public static int[] COPY(int[] arr) {
	        int[] copy = new int[arr.length];
	        for (int i = 0; i < arr.length; i++)
	            copy[i] = arr[i];
	        return copy;
	    }

	    public static int largest(int[] copy) {
	        int item = 0;
	        int pointer = -1;
	        for (int i = 0; i < copy.length; i++) {
	            int rem1 = 0;
	            int rem2 = copy[i];
	            while (rem2 != 0) {
	                rem2 = rem2 / 10;
	                if (rem2 != 0)
	                    rem1 = rem2;

	            }
	            copy[i] = rem1;
	        }
	        return findmax(copy);

	    
	    }
	    public static void printmax(int[] arr, int i) {
	         System.out.print(arr[i]);
	        for (int j =arr.length-1; j >=0; j--) {
	            if (j != i)
	                System.out.print(arr[j]);
	        }

	    }
	} 


