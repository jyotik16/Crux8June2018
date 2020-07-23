package lec7_string;

import java.util.Scanner;

public class removeconsequtiveduplicate {

static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str.length()-1; i++) {
			char ch = str.charAt(i);
			if(str.charAt(i+1)!=ch)
				sb.append(ch);
		    else
				continue;
		}
	    sb.append(str.charAt(str.length()-1));
	    System.out.println(sb);
	}


}



