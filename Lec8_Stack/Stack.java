package Lec8_Stack;

public class Stack {
	
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
