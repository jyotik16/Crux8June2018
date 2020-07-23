package contest2;

public class RotateArray {
	 public static void main(String[] args) {
	        RotateArray rotate = new RotateArray();
	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        rotate.leftRotate(arr, 6, 7);
	        rotate.printArray(arr, 7);
	    }
	 void printArray(int arr[], int size) 
	    {
	        int i;
	        for (i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	    }
	    int gcd(int a, int b) 
	    {
	        if(a==b) {
	        	return 1;
	        }
	    	if (b == 0)
	            return a;
	        else
	            return gcd(b, a % b);
	    }
	    void leftRotate(int arr[], int d, int n) //jugling algorithm
	    {
	        int i, j, k, temp;
	        System.out.println(gcd(d,n));
	        
	        for (i = 0; i < gcd(d, n); i++) 
	        {
	            temp = arr[i];
	            j = i;
	            while (true) 
	            {
	                k = j + d;
	                if (k >= n) 
	                    k = k - n;
	                if (k == i) 
	                    break;
	                arr[j] = arr[k];
	                j = k;
	               // printArray(arr,arr.length);
	               // System.out.println();
	            }
	            arr[j] = temp;
	           // printArray(arr,arr.length);
	            System.out.println();
	        }
	       
	    }
}
