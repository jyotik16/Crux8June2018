package Microsoft;

import java.util.Stack;

public class InfixEvaluation {
public static void main(String[] args) {
	String str = "5+10/2*6-3"; //32
	String s1 = "10 + 2 * 6"; //22
	String ss = "100 * ( 2 + 12 ) ";  //1400
	String s2 = "100 * (2+12) /14"; //100
	String s3 = "100 * 2+12 "; //212
	String s4 = "2 + 3 * 1 - 9";
	infix(s4);
}
	public static void infix(String str) {
		
		Stack<Integer> s = new Stack();
		Stack<Character> op = new Stack();
		char[] ss = str.toCharArray();
		
		for(int i=0;i<ss.length;i++) {
			//System.out.println(ss[i]);
			if(ss[i]=='(')
				op.push(ss[i]);
			
			else if(ss[i]==')') {
				while(op.peek() != '('){
					int r = s.pop();
					int l = s.pop();
					int res = calculate(op.peek(),l,r);
					s.push(res);
					op.pop(); 
				}
				op.pop();
			}
			else if (ss[i] == '+' || ss[i] == '-' || ss[i] == '/' || ss[i] == '*' || ss[i] == '^') {
				int pc = priority(ss[i]);
				while(!op.empty() && priority(op.peek()) >= pc){
					int r = s.pop(); 
					int l = s.pop();
					char c = op.peek();
					int res = calculate(c,l,r);
					s.push(res);
					op.pop(); 
				}
				op.push(ss[i]);
						
			}
			else if(ss[i]>='0' && ss[i]<='9') {
					
					StringBuffer sbuf = new StringBuffer();
	                // There may be more than one digits in number
	                while (i < ss.length && ss[i] >= '0' && ss[i] <= '9') {
	                    sbuf.append(ss[i++]);
	                    }
	                i--;
	               System.out.println(s.push(Integer.parseInt(sbuf.toString())));;
			}
			
			
		}
		while(!op.empty()){
			int r = s.pop(); int l = s.pop();
			int res = calculate(op.peek(),l,r);
			s.push(res);
			op.pop(); 
		}
		
		System.out.println("result="+s.peek());
	}
	static int priority(char ch) {
		switch(ch) {
		case '(':return 1;
		case '+':
		case '-':return 2;
		case '/':
		case '*':return 3;
		case '^':return 4;
		}
		return -1;
	}
	
	static int calculate(char op,int l,int r) {
		if(op == '+'){
			return l + r;
		}else if(op == '-'){
			return l - r ;
		}else if(op == '*'){
			return l * r;
		}else if(op == '/'){
			if(r > 0){
				return l/r;
			}
			return 0;
		}else if(op == '^'){
			return l ^ r;
		}
		return -1;
	
	}

}
