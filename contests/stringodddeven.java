package contest;

import java.util.Scanner;

public class stringodddeven {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.nextLine();
		 convert(str);
		

}
	public static void convert(String str) {
		StringBuilder sb = new StringBuilder();
		char diff='b'-'a';
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
		if(i%2==0) {
			//ch=(char)(ch+1);
			sb.append((char) (ch + diff));
		}
		else
		{
			sb.append((char) (ch - diff));
		}
		
		}
		String sd = sb.toString();
		System.out.println(sd); 
}
	}
