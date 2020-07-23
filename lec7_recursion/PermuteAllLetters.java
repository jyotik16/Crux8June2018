package lec3_function;
import java.util.Scanner;

public class PermuteAllLetters {
    static void permute(char[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print(a[i]);
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                char temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
 
    public static void main(String args[]) 
    {
        System.out.println("Enter the length of character string: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        char[] sequence = new char[n];
        System.out.println("Enter the original string: ");
        for (int i = 0; i < n; i++)
            sequence[i] = sc.next().charAt(0);
        //System.out.println("The permuted strings are: ");
        permute(sequence, 0);
 
        sc.close();
    }
}
/*
 * 
char* full_string;
int counter = 0;
void permute(char *str, int length) {
    if(length == 0) {
        printf("%s\n", full_string);
        ++counter;
        return;
    } else {
        // Find the smallest char in the string set it to be the first character. Solve the subproblem for the smaller string.
        char *smallest = min_element(str, str + length);
        iter_swap(str, smallest);
        permute(str+1, length-1);
        
        // Look for the smallest element strictly greater than the first element of the current string
        char *smallest_greater = str + length;
        for(char *i = str+1; i != str+length; ++i)
            if(*i > *str && (smallest_greater == str + length || *i < *smallest_greater))
                smallest_greater = i;
        while(smallest_greater != str+length) {
            // If such an element is found, swap it into the first slot and recurse
            iter_swap(str, smallest_greater);
            permute(str+1, length-1);

            // Repeat the loop if possible for the next greater character
            smallest_greater = str + length;
            for(char *i = str+1; i != str+length; ++i)
                if(*i > *str && (smallest_greater == str + length || *i < *smallest_greater))
                    smallest_greater = i;

        }
    }
}
 */

