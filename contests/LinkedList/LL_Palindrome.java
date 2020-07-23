
import java.util.Scanner;

public class removeDuplicatenodes {
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
		boolean res =obj.palindrome();
		if(res) {
			System.out.println("True");
		}else {
			System.out.println("False");
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
	public boolean palindrome() throws Exception {
		Node prev=this.tail;
		Node curr=this.head;

		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);
			if(ln.data!=rn.data) {
				return false;
			}else {
				left++;
				right--;
				
			}

		}
		return true;
	}
}
}


