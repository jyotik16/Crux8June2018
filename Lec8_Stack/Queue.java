package Lec8_Stack;

public class Queue {
protected int[] data;
protected  int front;
protected  int size;
Queue(){
	this.data = new int[5]; this.front=0; this.size=0;
}
Queue(int size){
	this.data = new int[size]; this.front=0; 
	this.size=0;
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
	System.out.println("------------");
		for(int i=0;i<size();i++)
		System.out.print(this.data[(i+front)%this.data.length]+" ");
		System.out.println();
	System.out.println("------------");

}
	
}
