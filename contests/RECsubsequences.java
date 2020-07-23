package contest2;

import java.util.Scanner;

public class RECsubsequences {
	 	static Scanner scn = new Scanner(System.in);
			public static void main(String[] args) {
				String str= scn.nextLine();
				//StringBuilder sb = new StringBuilder(str);
				//sb.reverse();
			   //substring1(sb.toString());
				System.out.println(printSS1(str," "));
				RecSubSeq(str," ");
			}
			public static void substring (String str) {
				for(int i=str.length();i>=0;i--)
				{    
					
					for(int j=i-1;j>=0;j--)
					{
						System.out.print(str.substring(j,i)+" ");
					}
					
				}
			}
			
			public static void substring1 (String str) {
				for(int i=0;i<str.length();i++)
				{    
					
					for(int j=i+1;j<str.length();j++)
					{
						System.out.print(str.substring(i,j)+" ");
					}
					
				}
			}
			public static void RecSubSeq(String str,String ans) {
				if (str.length() == 0) {
					System.out.print(ans+" ");
					return;
				}
				char ch = str.charAt(0);
				String ros=str.substring(1);
				RecSubSeq(ros,ans);
				RecSubSeq(ros,ans+ch);
							
			}

			public static int printSS1(String str,String ans) {
				int count;
				if (str.length() == 0) {
					return 1;
				}
				count=0;
				char ch = str.charAt(0);
				String ros=str.substring(1);
				count+=printSS1(ros,ans);
				count+=printSS1(ros,ans+ch);
				return count;
						
			}
}
