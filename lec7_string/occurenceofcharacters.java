package lec7_string;
import java.util.Scanner;

public class occurenceofcharacters {
 static Scanner scn = new Scanner(System.in);

	public static void main(String[] args)
    {
        String str = scn.nextLine();
        System.out.println(getMaxOccuringChar(str));
    }
	static final int ASCII_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        
        int count[] = new int[ASCII_SIZE];
      
         int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
        
      
        int max = -1;  
        char result = ' ';   
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
}