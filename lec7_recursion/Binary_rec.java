package javaTest;

public class Binary_rec {
public static void main(String[] args) {
	int n = 15;
	DecimaltoBinary(n,0,1);
	
}

private static void DecimaltoBinary(int n,int ans,int mul) {
	
	if(n==0) {
		System.out.println(ans);
		return;
	}
	
	int rem = n%2;
	DecimaltoBinary(n/2,ans+(rem*mul),mul*10);
}
}
