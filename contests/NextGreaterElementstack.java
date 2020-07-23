package contest2;
import java.util.Scanner;
//import Lec8_Stack.Stack;
public class NextGreaterElementstack {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		NextGreaterElementstack  obj=new NextGreaterElementstack();
		
	        int t=scn.nextInt();
	        while(t>0){
	            int N=scn.nextInt();
	            Stack S = obj.new Stack(N);
	            int[] ar=new int[N];
	            for(int i=0;i<N;i++){
	                ar[i]=scn.nextInt();
	            }
	            nextGreaterElement(ar,S);
	            t--;
	       }
	}
	public static void nextGreaterElement(int[] arr,Stack s) throws Exception {
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[i]>s.peek()) {
				System.out.println(s.pop() + "," + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "," + "-1");
		}
	}


private class Stack {
	
	private int[] data;
	private int tos;
	public Stack() {
		this.data = new int[5];
		this.tos = -1;
		}
	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
		}
	public int size() {
		return this.tos+1;
	}
	public boolean isEmpty() {
		return this.size()==0;
		
	}
	public void push(int item) throws Exception {
		if(this.size()==data.length)  {
			throw new Exception(" Stack is full!.");
		}
		this.tos++;
		this.data[tos]=item;
		
	}
	public int pop() throws Exception {
		if(this.size()==0) {
			throw new Exception(" Stack is Empty!.");
		}
		int rv = data[tos];
		data[tos]=0;
		tos--;
		return rv;
	}
	public int peek() throws Exception {
		if(this.size()==0) {
			throw new Exception(" Stack is Empty!.");
		}
		int rv = data[tos];
		//System.out.println(rv);
		return rv;
	}
	public void display() {
		System.out.println("------------");
		for(int i=tos;i>=0;i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.println("------------");
	}
	

	

}


}
