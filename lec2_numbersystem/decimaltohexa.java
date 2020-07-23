package lec2_numbersystem;

//import java.util.Scanner;
//
//public class decimaltohexa {
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n=scn.nextInt();
//		int rem;
//		int ans=0;
//		int mul=1;
//		
//		while(n!=0)
//		{
//			rem=n%10;
//			ans=ans+(rem*mul);
//			n=n/10;
//			mul=mul*16;
//			
//		}
//		System.out.println(+ans);
//	}
//
//}
//import java.util.Scanner;
//
//public class decimaltohexa
//{
//    public static void main(String args[])
//    {
//        long decnum, rem;
//        String hexdecnum="";
//        
//        /* digits in hexadecimal number system */
//        
//        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        
//        Scanner scan = new Scanner(System.in);
//		
//        System.out.print("Enter Decimal Number : ");
//        decnum = scan.nextInt();
//		
//        while(decnum>0)
//        {
//            rem = decnum%16;
//            hexdecnum = hex[rem] + hexdecnum;
//            decnum = decnum/16;
//        }
//		
//        System.out.print("Equivalent Hexadecimal Value of " + decnum + " is :\n");
//        System.out.print(hexdecnum);
//    }
//}
import java.util.Scanner;
public class decimaltohexa {
 public static void main(String[] args) 
 {
  int[] hex = new int[1000];
  int i = 1, j = 0, rem, dec = 0, bin;
  Scanner in = new Scanner(System.in);
  System.out.print("Input a Binary Number: ");
  bin = in.nextInt();
  while (bin > 0) {
   rem = bin % 2;
   dec = dec + rem * i;
   i = i * 2;
   bin = bin / 10;
  }
   i = 0;
  while (dec != 0) {
   hex[i] = dec % 16;
   dec = dec / 16;
   i++;
  }
  System.out.print("HexaDecimal value: ");
  for (j = i - 1; j >= 0; j--)
  {
   if (hex[j] > 9) 
   {
    System.out.print((char)(hex[j] + 55)+"\n");
   } else
   {
    System.out.print(hex[j]+"\n");
   }
  }
 }
}