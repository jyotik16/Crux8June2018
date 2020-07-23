package contest2;

import java.util.Scanner;
public class CountAAA {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 //String str = scn.nextLine();
		 Count("aaaaaa");
		}
	
	public static int fun(String str,String ans) {
		
		String ros = str.substring(1);
		if()
		int ch=fun(ros,ans+ch);
	}
public static void Count(String str) {
	String substr="aaa"; int c=0; boolean flag=true;
	for(int i=0;i<str.length();i++) {
		int prev=i;
		for(int j=0;j<substr.length();j++)
		{
			if(str.charAt(i)!=substr.charAt(j)) {
				flag=false;
				break;
			}
			i++;
		}
		if(flag==false)
			i=prev;
	}
	System.out.println("c="+c);
}
	

public static boolean Check(String str,String substr,int index) {
	boolean flag=true;
	for(int j=0;j<substr.length();j++) {
		if(str.charAt(index)!=substr.charAt(j)) {
			flag=false;
			break;
		}
		index++;
	}
	return flag;
}
}