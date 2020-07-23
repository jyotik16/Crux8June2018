package contest;

import java.util.ArrayList;
import java.util.Scanner;


public class arrspiralclockwise {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
				
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr=takeinput(r,c);
	//	spiralPrint(r,c,arr);
//	int[] res=	spiral(arr);
//	for(int i=0;i<res.length;i++)
//		System.out.println(res[i]);
	
	}
	public static int[][] takeinput(int n,int m) {

		int[][] ar = new int[n][m];
		for (int i = 0; i <n; i++) {
			for(int j=0;j <m; j++)
				{
				ar[i][j] = scn.nextInt();
			}
		}
		return ar;
	}
	 static void spiralPrint(int r, int c, int a[][])
	    {
	        int i, k = 0, l = 0;
	        /*  k - starting row index  m - ending row index
	        l - starting column index  n - ending column index
	        i - iterator
	        */
	       
		while (k < r && l < c) {
			// Print the first row from the remaining rows
			for (i = l; i < c; ++i) {
				System.out.print(a[k][i] + ", ");
			}
			k++;

			// Print the last column from the remaining columns
			for (i = k; i < r; ++i) {
				System.out.print(a[i][c - 1] + ", ");
			}
			c--;

			// Print the last row from the remaining rows */
			if (k < r) {
				for (i = c - 1; i >= l; --i) {
					System.out.print(a[r - 1][i] + ", ");
				}
				r--;
			}

			// Print the first column from the remaining columns */
			if (l < c) {
				for (i = r - 1; i >= k; --i) {
					System.out.print(a[i][l] + ", ");
					
				}
				l++;
			}
		}
		//System.out.print("END");
		
	}

	 //arraylist
	 static int[] spiral(int a[][]) {
		 int T = 0; int B = a.length-1; int L = 0; int R = a[0].length-1;
		 int dir = 0; 
		 ArrayList <Integer> ans = new ArrayList<> ();
		 while(T<=B && L<=R) {
			 //first row
			 if(dir == 0) {
				 for(int i=L; i<=R; i++)
				 {
					 //System.out.print(a[T][i]+" ");
					 ans.add(a[T][i]);
				 }
				 T++;
			 }
			 //last col
			 else if(dir == 1) {
				 for(int i=T; i<=B; i++)
				 {
					 //System.out.print(a[i][R]+" ");
					 ans.add(a[i][R]);
				 }
				  R--;
			 }
			 //last row 
			 else  if(dir == 2) {
				 for(int i=R; i>=L; i--)
				 {
					 //System.out.print(a[B][i]+" ");
					 ans.add(a[B][i]);
				 }
				  B--;
			 }
			 //first col
			 else if(dir == 3) {
				 for(int i=B; i>=T; i--)
				 {
					// System.out.print(a[i][L]+" ");
					 ans.add(a[i][L]);
				 }
				  L++;
			 }
			 dir = (dir + 1)%4;
		 }
		// System.out.println(ans);
		 int [] ar = new int[ans.size()];
	        for(int j=0;j<ans.size();j++)
	        ar[j] = ans.get(j);
	       return ar;
	 }
	 //arraylist<arraylist>
	 public void spiralOrder(final ArrayList<ArrayList<Integer>> A) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int m, n;
		 
		 m = A.size();
		 n = A.get(0).size();
		 
		 if (m == 0) {
		    //return result;
		 }
		 int len;
		 int dir = 0; // right
		 int row, col, layer;
		 row = col = layer = 0;
		 
		 result.add(A.get(0).get(0));
		 
        
        for (int step = 1; step < m * n; step++) {
            
            switch(dir) {
                
                // Go right
                case 0:
                    
                    if (col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else {
                        col++;
                    }
                    
                    break;
                    
                // Go down
                case 1:
                    
                    if (row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else {
                        row++;
                    }
                    
                    break;
                    
                // Go left
                case 2:
                    
                    if (col == layer) {
                        dir = 3;
                        row--;
                    } else {
                        col--;
                    }
                    
                    break;
                
                // Go up
                case 3:
                    
                    if (row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else {
                        row--;
                    }
                    
                    break;
                
            }
            
            //System.out.println(row + " " + col);
            result.add(A.get(row).get(col));
            
        }
        System.out.println(result);
		// return result;
	}
	 
}
