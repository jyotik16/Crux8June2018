package javaTest;

public class product_n_number {
public static void main(String[] args) {
	int [] ar = {1,2,3,4};
	
	products(ar,0,1);
}

private static void products(int[] ar, int indx, int ans) {
	
	if(indx==ar.length) {
		System.out.println(ans);
		return;
	}
	products(ar,indx+1,ans*ar[indx]);
}
}
