package Backtracking;

import java.util.Scanner;

public class Queens {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 4;
		NQueen(new boolean[n][n], 0, "");
		
	}

	public static void NQueen(boolean[][] board, int row, String asf) {
		if (row == board[0].length) {
			System.out.println(asf);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (IsSafe(board, row, col)) {
				board[row][col] = true;
				NQueen(board, row + 1, asf + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}
	}

	public static boolean IsSafe(boolean[][] board, int row, int col) {
		int r = row - 1;
		int c = col;
		// vertically up
		while (r >= 0) {
			if (board[r][c])
				return false;
			r--;
		}
		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c])
				return false;
			r--;
			c--;
		}
		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c])
				return false;
			r--;
			c++;
		}
		return true;
	}
}
