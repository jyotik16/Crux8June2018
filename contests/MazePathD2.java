package contest2;


import java.util.Scanner;
public class MazePathD2 {


	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(countMazePath(0,n-1,0,m-1," "));
		printMazePathD2(0, n - 1, 0, m - 1, "");
		

	}

	public static int countMazePath(int cr, int er, int cc, int ec, String ans) {

		if (cr == er && cc == ec) {
			return 1;

		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += countMazePath(cr, er, cc + 1, ec, ans + "H");
		count += countMazePath(cr + 1, er, cc, ec, ans + "V");
		if (cr == cc || (cr + cc ) == er) {
			count+=countMazePath(cr + 1, er, cc + 1, ec, ans + "D");
		}
		return count;
	}
	public static void printMazePathD2(int cr, int er, int cc, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec) {

			return;
		}

		printMazePathD2(cr + 1, er, cc, ec, ans + "V");
		printMazePathD2(cr, er, cc + 1, ec, ans + "H");
		if (cr == cc || (cr + cc ) == er) {
		printMazePathD2(cr + 1, er, cc + 1, ec, ans + "D");
		}

	} 


}
