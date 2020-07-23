/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPrograming;


import java.util.Scanner;
import java.util.Stack;

public class CountString {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	int t = scn.nextInt();
	while(t>0){
	    int n= scn.nextInt();
	    System.out.println(countStrings(n));
	    t--;
	}
	 
	}
	static  int countStrings(int n)
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
	
}

