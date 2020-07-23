
import java.util.Scanner;
public class removeDuplicatenodes {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		removeDuplicatenodes list = new removeDuplicatenodes();
		LinkedList obj = list.new LinkedList();
		
		
		int n = scn.nextInt();
		int q = scn.nextInt();
		for(int i=0;i<n;i++) {
			obj.addLast(scn.nextInt());
		}
    	while(q>0) {
			int a= scn.nextInt();
			int res = obj.removeAt(a);
			obj.display();
			System.out.println();
			
			q--;
		}
			
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


	public int removeFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		Node temp = this.head;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			this.head = this.head.next;
			this.size--;
		}
		return temp.data;
	}
	
	public int removeAt(int idx) throws Exception {


		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();

		} else {

			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;

		}

	}
	
	public int removeLast() throws Exception {


		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		Node temp = this.tail;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getNodeAt(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}
		return temp.data;
	}

}
}


