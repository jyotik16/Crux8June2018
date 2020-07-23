package contest2;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateParathesis {
static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
	String str = scn.nextLine();
	//String str="((a+b)+(c+d))";
	if(hasDuplicateParathesis(str))
		System.out.println("true");
	else
		System.out.println("false");
}
public static boolean hasDuplicateParathesis(String str) {
	Stack <Character> ss = new Stack <Character>();
	
	for(int i=0;i<str.length();i++) {
		char top; 
		
		if(str.charAt(i)==')') {
			int noe=0;
			top=ss.peek();
			ss.pop();
			while(ss.peek()!='(') {
				top=ss.peek();
				ss.pop();
				noe++;
			}
			
			if(noe<1 ) {
				return true;
			}
		}
		else
			ss.push(str.charAt(i));
	}
	return false;
}
}
