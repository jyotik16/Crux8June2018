package contest2;

import java.util.Scanner;
public class StockSpan {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		StockSpan  obj=new StockSpan();
		
	            int N=scn.nextInt();
	            Stack S = obj.new Stack(N);
	            int[] ar=new int[N];
	            for(int i=0;i<N;i++){
	                ar[i]=scn.nextInt();
	            }
	            int[] res=stock_span(ar,S);
	            for(int j=0;j<res.length;j++)
	            	System.out.print(res[j]+" ");
	            System.out.println("END");
	          
	}

	public static int[] stock_span(int[] prices,Stack s) throws Exception {
		int[] span = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			while (!s.isEmpty() && prices[i] > prices[s.peek()]) {

				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}
			s.push(i);
		}
		return span;
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
