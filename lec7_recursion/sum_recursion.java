package javaTest;

public class sum_recursion {

	public static void main(String[] args) {
	System.out.println(sumR(123,0));
	}

	static int sumR(int n,int sum) {
	
	if(n==0){		
		return sum;
	}
	
	sum = sum + n%10;
	int ans = sumR(n/10,sum);
	return ans;
	
}
}
