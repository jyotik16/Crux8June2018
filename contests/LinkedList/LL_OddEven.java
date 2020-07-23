
import java.util.Scanner;



public class LL_OddEven {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		removeDuplicatenodes list = new removeDuplicatenodes();
		LinkedList obj = list.new LinkedList();
		
		
		int n = scn.nextInt();
		for(int i=0;i<n;i++) {
			obj.addLast(scn.nextInt());
		}
		//obj.remove();
		//System.out.println(obj.palindrome());
//		boolean res =obj.palindrome();
//		if(res) {
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
//		obj.swap(2,3);
//		obj.display();	
		obj.LL_oddeven();
			
	}
private class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head; 	private Node tail; 	private int size;

	public void addLast(int item) {

		// create
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size > 0)
			this.tail.next = nn;

		// dm update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size += 1;
		} else {
			this.tail = nn;
			this.size += 1;
		}

	}
	
	public void display() {
		Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}

	public void remove() {
		Node prev = this.head;
		Node curr = prev.next;
		while(curr!=null) {
			
			if(prev.data!=curr.data) {
				prev=prev.next;
				curr=curr.next;
			}
			else
			{
				prev.next=curr.next;
				curr=curr.next;
			}
		
		}	
		display();
	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}
	public void LL_oddeven() {
		
		Node temp=this.head;
		LinkedList ll = new LinkedList();
		while(temp!=null) {
			if(temp.data%2!=0) {
				
				ll.addLast(temp.data);
			}
			temp=temp.next;
		}
		temp =this.head;
		while(temp!=null) {
			if(temp.data%2==0) {
				
				ll.addLast(temp.data);
			}
			temp=temp.next;
		}
		
		ll.display();		
		
		
	}




}
}


