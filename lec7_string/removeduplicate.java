package lec7_string;

import java.util.Scanner;

public class removeduplicate {

static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		String str = scn.nextLine();
		
		String ss = removeDuplicate(str);
		System.out.println(ss);
	
	}
public static String removeDuplicate(String str) {
    StringBuilder sb = new StringBuilder();
    char[] arr = str.toCharArray();
 
    for (char ch : arr) {
        if (sb.indexOf(String.valueOf(ch)) != -1)
            continue;
        else
            sb.append(ch);
    }
    return sb.toString();
}
 

}
