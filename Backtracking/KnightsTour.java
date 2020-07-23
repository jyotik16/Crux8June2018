package Backtracking;

public class KnightsTour {


	public static void main(String[] args) {
		nKights(new boolean[2][2],0,0," ",0);
	}
	public static void nKights(boolean[][] board,int row,int col,String asf,int ksp) {
		
		if(ksp==board[0].length) {
			System.out.println(asf);
			return;
		}
		
		for(int c=col;c<board[0].length;c++) {
			board[row][c]=true;
			nKights(board, row, c+1, asf+"{"+row+" "+c+"}", ksp+1);
			board[row][c]=false;
			
		}
		for(int r=row+1;r<board[0].length;r++) {
			for(int c=0;c<board[0].length;c++) {
				board[r][c]=true;
				nKights(board, r, c+1, asf+"{"+r+" "+c+"}", ksp+1);
				board[r][c]=false;
			}
		}
	}
public static void nKights1(boolean[][] board,int row,int col,String asf,int ksp) {
		
		if(ksp==board[0].length) {
			System.out.println(asf);
			return;
		}
		
			
		for(int c=col;c<col+1;c++) {
			board[row][c]=true;
			nKights1(board, row, c+1, asf+"{"+row+" "+c+"}", ksp+1);
			//nKights1(board, row+1, c, asf+"{"+row+" "+c+"}", ksp+1);
			board[row][c]=false;
			
		}
		for(int c=col;c<col+1;c++) {
			for(int r=row;r<row+1;r++) {
		board[r][col]=true;
		nKights1(board, r+1, c, asf+"{"+r+" "+c+"}", ksp+1);
		//board[row][col]=false;
		}
	}
	
//		
	}
}
