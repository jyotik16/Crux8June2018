package contest;

import java.util.Scanner;
public class basiccalculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, f = 1;
       do {
    	   char ch = scn.next().charAt(0);
           scn.nextLine();
            f=1;
			if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '%') 
				{
					if (ch == '+') {
						a = scn.nextInt();
						b = scn.nextInt();
						System.out.println(a + b);
					} else if (ch == '-') {
						a = scn.nextInt();
						b = scn.nextInt();
						System.out.println(a - b);
					} else if (ch == '*') {
						a = scn.nextInt();
						b = scn.nextInt();
						System.out.println(a * b);
					} else if (ch == '/') {
						int c, d;
						c = scn.nextInt();
						d = scn.nextInt();
						if (d != 0)
							System.out.println(c / d);
					} else if (ch == '%') {
						a = scn.nextInt();
						b = scn.nextInt();
						if (b != 0)
							System.out.println(a % b);
					}
					else if(ch=='x'|| ch=='X')
					{ f=0;   }
			}
		else if(ch=='x'|| ch=='X')
            	{
			f=0;
            	}
		else
			System.out.println("Invalid operation. Try again");

			}while (f==1);
    }
 }




