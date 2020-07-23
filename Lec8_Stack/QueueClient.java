package Lec8_Stack;

import java.util.Scanner;

public class QueueClient {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
				Queue q = new DynamicQueue();
				q.enqueue(10);
//				int N=scn.nextInt();
//				for(int i=0;i<N;i++) {
//					int item=scn.nextInt();
//				 q.enqueue(item);
//				}
		// System.out.println(q.getfront());
		q.display();
		//displayReverse(q,0);
		//q.display();
		//actualReverse(q);
		 //q.display();

	}
	public static void displayReverse(Queue q,int count) throws Exception{
		if(count==q.size()) {
			return;
		}
		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q,count+1);
		System.out.println(temp);
	}
	public static void actualReverse(Queue q) throws Exception{
		if(q.isEmpty()) {
			return;
		}
		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);
	}



}
