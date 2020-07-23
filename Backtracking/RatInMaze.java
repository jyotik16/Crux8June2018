package Backtracking;

import java.util.Scanner;
public class RatInMaze {
static Scanner scn = new Scanner(System.in);

public static void main(String args[])
{
    final int N =4;
    int maze[][] = {{1, 1, 0, 0},
    				{1, 0, 0, 1},
    				{0, 1, 0, 1}, 
    				{0, 0, 0, 1} };
    int maze1[][] = {
    				{1, 0, 0, 0},
					{1, 0, 0, 1},
					{0, 0, 0, 1}, 
					{1, 0, 1, 1} 
					};
    solveMaze(maze,N);
}
public static boolean solveMaze(int[][] Maze,int N) {
	int[][] sol = {{2,2,2,2},{2,2,2,2},{2,2,2,2},{2,2,2,2}};
	if(solvemazeuntilMS(Maze,0,0,sol,N)==false) {
		System.out.println("Solution doesn't exist.");
        return false;
	}
	printSolution(sol,N);
    return true;
}
public static boolean solvemazeuntil(int[][] Maze,int x,int y,int[][] sol,int N) {
	if(x==N-1 && y==N-1) {
		sol[x][y]=1; 
		return true;
	}
	 
	
	if(IsSafe(Maze,x,y,N)==true) {
		sol[x][y]=1;
		if(solvemazeuntil(Maze,x+1,y,sol,N)==true) //downward direction
			return true;
		if(solvemazeuntil(Maze,x,y+1,sol,N)==true) //forward direction
			return true;
		if(solvemazeuntil(Maze,x+1,y+1,sol,N)==true) //diagonally direction
			return true;
		sol[x][y] = 0;
        	return false;
	}
	return false;
}
public static boolean solvemazeuntilMS(int[][] Maze,int x,int y,int[][] sol,int N) {
	if(x==N-1 && y==N-1) {
		sol[x][y]=1; 
		return true;
	}
	
	if(IsSafe(Maze,x,y,N)==true) {
		sol[x][y]=1;
		for(int i=1; i<N && i<=Maze[x][y];i++) {
			if(solvemazeuntilMS(Maze,x+i,y,sol,N)==true) //downward direction
				return true;
		}
		for(int i=1; i<N && i<=Maze[x][y];i++) {
			if(solvemazeuntilMS(Maze,x,y+i,sol,N)==true) //forward direction
			return true;
		}
		sol[x][y] = 0;
        	return false;
	}
	return false;
}
public static boolean IsSafe(int[][] Maze,int x,int y,int N) {
	return (x >= 0 && x < N && y >= 0 &&  y < N && Maze[x][y] == 1);
}
public static  void printSolution(int[][] sol,int N)
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
            System.out.print(" "+ sol[i][j] +" ");
        	System.out.println();
    }
}
}
