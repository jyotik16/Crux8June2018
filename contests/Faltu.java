package contest2;
import java.util.Scanner;
public class Faltu {
		static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			int n = scn.nextInt();
	        int nno = 2 * n + 1; 	        int row = 1;
	        int col = 2 * n - 1;	        int nst = 2 * row - 1;
	        int nsp = 2 * n - 1;
	        int val;	        int val1 = 0;
	        int n1=n;	        int nn=nno/ 2;
	        while (row <= nn) {
	            int no1 = 1;
	            val = n;
	            while (no1 <= nst) {
	                System.out.print(val);
	                val1 = val;
	                val--;
	                no1++;
	            }
	            for (int csp = 1; csp <= nsp; csp++) {
	                System.out.print(" ");
	            }
	            no1 = 1;
	            while (no1 <= nst) {
	                System.out.print(val1);
	                val1++;
	                no1++;
	            }
	            System.out.println();
	            row++;
	            nsp = nsp - 2;
	            nst++;
	        }
	        int temp = nn+1;
	        while (temp<=nno) {
	            int no1 = 1;
	            val = n;
	            
	            while (no1 <= nst) {
	                System.out.print(val);
	                val1 = val;
	                val--;
	                no1++;
	            }
	            for (int csp = 1; csp <= nsp; csp++) {
	                System.out.print(" ");
	            }
	            no1 = 1;
	            if(temp==(nno+1)/2)
	            {
	            	val1++;
		             while(no1 <nst) {
		                System.out.print(val1);
		                val1++;
		                no1++;
		            }
	            }
	            else {
	             while(no1 <= nst) {
	                System.out.print(val1);
	                val1++;
	                no1++;
	             }
	            }
	            System.out.println();
	            temp++;
	            nsp = nsp + 2;
	            nst--;
	        }
	    }

}
