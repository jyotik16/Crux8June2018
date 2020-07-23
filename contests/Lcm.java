package lec1_pattern;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
		long n1=scn.nextInt();
		long n2=scn.nextInt();
		long lcm = (n1>n2) ? n1:n2;
		while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.print(+lcm);
                break;
            }
            ++lcm;
        }
		
	}

}
