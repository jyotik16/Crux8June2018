package Greeks;

import java.util.Scanner;

public class zigzagPattern {
public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	
	//int n = scn.nextInt();
	int n=4;
	int nr = 2 * n ;
	int row = 1;
	int nst = 1;
	int pr = 1;
	while (row <= nr) {
		// stars
		if(row<=nr/2) {
		for (int cst = 1; cst <= nst; cst++) {
			System.out.print("*");

		}
		System.out.print(nst);
		
		if( row>=nr/2) {
			for (int cst = ns; cst >=1; cst--) {
				System.out.print("*");

			}
		}
		// prep
		if (row <= nr / 2) {
			nst++;
		} 
		else {
			nst--;
		}
		row = row + 1;
		System.out.println();
	}
}
	
}	
}
