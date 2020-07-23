package javaTest;

public class sum_N_numbers {
public static void main(String[] args) {
	int ar[] = {1,2,3,4};
	System.out.println(sumR(ar,0,0));
}

private static int sumR(int[] ar, int indx, int sum) {
	if(indx==ar.length) {
		return sum;
	}
	int res = sumR(ar,indx+1,sum+ar[indx]);
	
	return res;
}

}
