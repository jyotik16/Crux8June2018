package Lec8_Stack;
//import Lec8_Stack.StackUQueuepushE;

public class StackQUClient {

	public static void main(String[] args) throws Exception {

		StackUQueuepopE stack = new StackUQueuepopE();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();

		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		//System.out.println(stack.top());
		stack.display();
	}
}
