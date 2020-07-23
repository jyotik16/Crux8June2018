package lec_6arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class intersection {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <Integer> arr = new ArrayList<> (); 
		int n=scn.nextInt();
		int[] one=takeinput(n);
		int m=scn.nextInt();
		int[] two=takeinput(m);
	    arr=Intersection(one,two);
	    System.out.println(arr);
		
	}
	public static int[] takeinput(int n) {
		int[] ar = new int[n];
		for (int i = 0; i <n; i++) {
			ar[i] = scn.nextInt();
		}
		return ar;
		
	}
public static ArrayList<Integer> Intersection(int[] one,int[] two)
		{	ArrayList<Integer> ans=new ArrayList<>();
			int i=0,j=0;
			while(i<one.length-1 && j<two.length-1)
			{
				if(one[i]==two[j])
				{
					ans.add(one[i]);
					i++; j++;
				}
				else if(one[i]>two[j])
				{	
					j++;
				}	
				else
				{
					i++;
				}
			}
			return ans;
		}

}
/*
4
1 2 3 4
4
2 3 4 5
[2, 3]
*/