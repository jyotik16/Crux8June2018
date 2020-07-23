package crux8june2018;
import java.util.Scanner;
public class evenoddsum {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         long first_rem,second_rem,odd, even;
             odd = even = 0;
            Scanner scn = new Scanner(System.in);
            long n= scn.nextInt();
            
            while(n>0){ 
            	first_rem=n%10;  
                n=n/10;
                even+=first_rem; 
                second_rem=n%10; 
                n=n/10;
                odd+=second_rem; 
                }
     
         System.out.println(even);
         System.out.println(odd);
    }
}





