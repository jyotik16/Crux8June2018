
import java.util.Scanner;

public class removeDuplicatenodes {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		removeDuplicatenodes list = new removeDuplicatenodes();
		LinkedList obj = list.new LinkedList();
		
		
		int n= scn.nextInt();
		for(int i=0;i<n;i++) {
			obj.addLast(scn.nextInt());
		}
		obj.remove();		
			
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

}
}


