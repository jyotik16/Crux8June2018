package contest2;

import java.util.Scanner;

public class RecBalanced {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 String str = scn.nextLine();
		 //Isbalanced(str);
		 char c=str.charAt(0);
		 
		 System.out.println(c);
		}
public static void Isbalanced(String str) {
	int sum=0;
	int j=str.length();
	for(int i=0;i<str.length();i++) {
		if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			continue;
		else if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
		{
			sum++;
		}
		else if(str.charAt(i)=='}'||str.charAt(i)==']'||str.charAt(i)==')')
		{
			sum--;
		}
		
	}
	if(sum==0)
		System.out.println("true");
	else
		System.out.println("false");
}
}
