package contest2;

import java.util.Scanner;

public class SubsetsOfArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		char set[] = {'a', 'b', 'c'};
        printSubsets(set);
	}
	public static void name() {
		
	}
	static void printSubsets(char set[])
    {
        int n = set.length;
         
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
             for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1                 
                // subset number we get which numbers               
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
             System.out.println("}");
        }
       
    }
}
