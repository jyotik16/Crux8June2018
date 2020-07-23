 bpackage Lec8_Stack;

public class ReverseStack {
	public static void main(String[] args) throws Exception {
		Stack S=new Stack(5);
		for(int i=1;i<=5;i++) {
			S.push(i*10);
		}
		S.display();
		Stack helper=new Stack();
		reversestack(S,helper,0);
		S.display();
		
	}
	public static void reversestack(Stack ss,Stack helper,int indx) throws Exception {
		
		if(ss.isEmpty()) {
			return;
		}
		int item = ss.pop();
		reversestack(ss,helper,indx+1);
		helper.push(item);
		if(indx==0) {
			while(!helper.isEmpty()) {
				ss.push(helper.pop());
			}
		}
	}
	
}
