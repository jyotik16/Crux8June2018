package lec7_string;

import java.util.Scanner;

public class StringCompression {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	String str = scn.nextLine();
	SComparsion(str);
	

}
	public static void SComparsion(String str) {
		StringBuilder sb = new StringBuilder();
		int c;
		for (int i = 0; i < str.length(); ) {
			char ch = str.charAt(i); c=0;
			for(int j=i;j<str.length();j++) {
				if(ch==str.charAt(j))
					{
					c++; continue;
					}
				else
					break;
			}
			if(c==1){
				sb.append(ch);	
			}
			else {
				sb.append(ch);
				sb.append((int)c);
			}
			i=i+c;
	}
		
		System.out.println(sb.toString());
}
}