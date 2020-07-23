package Lec8_Stack;

import java.util.Scanner;

public class Dynamic_Queue {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		Dynamic_Queue mainobj=new Dynamic_Queue();
		Queue obj=mainobj.new Queue(N);
		Queue helper=mainobj.new Queue(N);
		for(int i=1;i<=N;i++){
			obj.enqueue(s.nextInt());
		}
		obj.reverseQueue(obj, helper, 0);
		obj.display();
		
}

public class Queue {
protected int[] data;
protected  int front;
protected  int size;
//public static final int DEFAULT_CAPACITY = 5;

Queue(){
	this.data = new int[5]; this.front=0; this.size=0;
}
Queue(int size){
	if(size<=0) {
		System.out.println("Invalid Capacity");
	}
	this.data = new int[size]; this.front=0; this.size=0;
}
public int size() {
	return this.size;
}
public boolean isEmpty() {
	return this.size()==0;
}
public void enqueue(int item) throws Exception {
	if(this.size==this.data.length) {
		throw new Exception ("Queue is full!.");
	}
	int idx = (this.front+this.size)%this.data.length;
	this.data[idx] = item;
	this.size++;
}

public int dequeue() throws Exception {
	if(this.size==0){
		throw new Exception ("Queue is Empty!.");
		}
	int rv =this.data[this.front];
	this.data[this.front] = 0;
	this.front=(this.front+1)%this.data.length; 
	this.size--;
	return rv;
}

public void getfront() throws Exception {
	if(this.size==0){
		throw new Exception ("Queue is Empty!.");
		}
	int rv =this.data[this.front];
	System.out.println(rv);
	}
public void display() {
	//System.out.println("------------");
		for(int i=0;i<size();i++) {
		System.out.print(this.data[(i+front)%this.data.length]+" ");
		}
		System.out.println("END");
	//System.out.println("------------");

}

public  void reverseQueue(Queue ss,Queue helper,int indx) throws Exception {
	
	if(ss.isEmpty()) {
		return;
	}
	int item = ss.dequeue();
	reverseQueue(ss,helper,indx+1);
	helper.enqueue(item);
	if(indx==0) {
		while(!helper.isEmpty()) {
			ss.enqueue(helper.dequeue());
		}
	}
}


}
}
