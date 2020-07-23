package contest2;
import java.util.Scanner;
public class MoveAllXtoend {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		 String str = scn.nextLine();
		 //movetoend(str);
		 Twins(str);
		 
	}
	public static void movetoend(String str) {
		StringBuilder sb = new StringBuilder();
		int c=0; char ch='x';
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='x')
			{
				c++;continue;
			}
			else
			{
				sb.append(str.charAt(i));
			}
			
		}
		
		while(c>0) {
		sb.append(ch);
		c--;
		}
		System.out.println(sb.toString());
	}
	public static void Twins(String str) {
		int c=0,sum=0; 
		boolean[] processed = new boolean[256];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i); 
			c=0; 

			if (processed[ch] == true) {
				continue;
			}
			else {
			for(int j=i+1;j<str.length();j++) {
				
					if(str.charAt(j)==ch)
					   c++;
					
				}
				sum = sum+c;
				processed[ch]=true;
			}
		}
		
		System.out.println(sum);
	}
	
}
