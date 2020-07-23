package contest2;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePath {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(countMazePath(0,n-1,0,m-1," "));
		printMazePathD2(0, n - 1, 0, m - 1, "");
		

	}

	public static ArrayList<String> MazePath(int cr, int er, int cc, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = MazePath(cr, er, cc + 1, ec);
		for (String rrs : rrh) {
			mr.add("H" + rrs);
		}
		ArrayList<String> rrv = MazePath(cr + 1, er, cc, ec);
		for (String rrs : rrv) {
			mr.add("V" + rrs);
		}
		ArrayList<String> rrd = MazePath(cr + 1, er, cc + 1, ec);
		for (String rrs : rrd) {
			mr.add("D" + rrs);
		}
		return mr;
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

	public static void printMazePath(int cr, int er, int cc, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;

		}
		if (cr > er || cc > ec) {
			return;
		}
		int count = 0;
		printMazePath(cr, er, cc + 1, ec, ans + "H");
		printMazePath(cr + 1, er, cc, ec, ans + "V");
	}

	public static void printMazePathD(int cr, int er, int cc, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec) {

			return;
		}
		int count = 0;
		printMazePathD(cr + 1, er, cc, ec, ans + "V");
		printMazePathD(cr, er, cc + 1, ec, ans + "H");
		printMazePathD(cr + 1, er, cc + 1, ec, ans + "D");

	}

	public static int printMazePathMMD(int cr, int er, int cc, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return 1;
		}
		if (cr > er || cc > ec) {

			return 0;
		}
		int count = 0;
		for (int i = 1; i <= ec; i++) {
			count += printMazePathMMD(cr, er, cc + i, ec, ans + "H" + i);
		}
		for (int i = 1; i <= er; i++) {
			count += printMazePathMMD(cr + i, er, cc, ec, ans + "V" + i);
		}
		for (int i = 1; i <= er && i <= ec; i++) {
			count += printMazePathMMD(cr + i, er, cc + i, ec, ans + "D" + i);
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
/*
 * VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD VVHH VHVH VHHV VHD
 * HVVH HVHV HVD HHVV DVH DHV DD
 */
