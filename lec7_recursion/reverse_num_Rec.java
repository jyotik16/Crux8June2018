package javaTest;

public class reverse_num_Rec {
public static void main(String[] args) {
	
	int n =1234;
	reverse(n,0);
	System.out.println(reverse1(n,0));
}

private static int reverse1(int n, int ans) {
	if(n==0) {		
		return ans;
	}
	int rem = n%10;
	ans = ans*10+rem;
	int res = reverse1(n/10,ans);
	
	return res;
}

private static void reverse(int n,int ans) {
	
	if(n==0) {
		System.out.println(ans);
		return;
	}
	int rem = n%10;
	ans = rem+ans*10;
	
	reverse(n/10,ans);
	
}

}
