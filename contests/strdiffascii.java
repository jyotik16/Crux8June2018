package contest1;

import java.util.Scanner;

public class strdiffascii {

static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.nextLine();
		String ss = difference(str);
		System.out.println(ss);
	
	}
	public static String difference(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length()-1; i++) {
			
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			int diff = ch2-ch1;
			sb.append(ch1);
			sb.append(diff);
			
		
		}
		int l=str.length()-1;
		char ch3 = str.charAt(l);
		sb.append(ch3);		
		String sd = sb.toString();
		return sd;
}
}