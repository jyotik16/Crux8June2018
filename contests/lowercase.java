package contest;

import java.util.Scanner;

public class lowercase {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
    {
        char ch;
       
        Scanner scn = new Scanner(System.in);
             
        ch = scn.nextLine().charAt(0);
		if(ch>=97 && ch<=122)
			System.out.println("lowercase");
		else if(ch>=65 && ch<=90)
			System.out.println("UPPERCASE");
		else
			System.out.println("Invalid");
    }

}
