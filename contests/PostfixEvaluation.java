package contest2;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
	static Scanner scn = new Scanner(System.in);

	 static int evaluatePostfix(String str)
	    {
	         Stack<Integer> stack=new Stack<>();
	         
	        for(int i=0;i<str.length();i++)
	        {
	            char c=str.charAt(i);
	             
	            // If the scanned character is an operand (number here),
	            // push it to the stack.
	            if(Character.isDigit(c))
	            stack.push(c - '0');
	             
	            //  If the scanned character is an operator, pop two
	            // elements from stack apply the operator
	            else
	            {
	                int val1 = stack.pop();
	                int val2 = stack.pop();
	                 
	                switch(c)
	                {
	                    case '+':
	                    stack.push(val2+val1);
	                    break;
	                     
	                    case '-':
	                    stack.push(val2- val1);
	                    break;
	                     
	                    case '/':
	                    stack.push(val2/val1);
	                    break;
	                     
	                    case '*':
	                    stack.push(val2*val1);
	                    break;
	              }
	            }
	        }
	        return stack.pop();    
	    }
	     
	   
	    public static void main(String[] args) 
	    {
	        
	    	int t=scn.nextInt();
	    	while(t>0) {
	    		String ss=scn.next();
	    		System.out.println(evaluatePostfix(ss));
	    		t--;
		    }
	    	}
	        
	}

