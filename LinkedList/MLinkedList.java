package LinkedList;
import java.util.Scanner;

import LinkedList.removeDuplicatenodes.LinkedList;
import LinkedList.removeDuplicatenodes.LinkedList.Node;


public class MLinkedList {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		MLinkedList list = new MLinkedList();
		LinkedList obj = list.new LinkedList();
		int N = scn.nextInt();
		while(N>0) {
			LinkedList l1 =list.new LinkedList();
			int n = scn.nextInt();
			for(int i=0;i<n;i++) {
				l1.addLast(scn.nextInt());
			}
			LinkedList l2 =list.new LinkedList();
			int m = scn.nextInt();
			for(int i=0;i<m;i++) {
				l2.addLast(scn.nextInt());
			}
			N--;
			obj.mergesort(l1,l2);
			}
		
		
	}

class LinkedList {

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
	
	
	public void mergesort(LinkedList l1,LinkedList l2) {
		LinkedList ll=mergeTwoSortedLL(l1,l2);
		ll.display();
		
	}
	public LinkedList mergeTwoSortedLL(LinkedList tl,LinkedList ol) {

		LinkedList merged = new LinkedList();

		Node temp1 = tl.head;
		Node temp2 = ol.head;

		while (temp1 != null && temp2 != null) {

			if (temp1.data < temp2.data) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			} else {
				merged.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		if (temp1 == null) {

			while (temp2 != null) {
				merged.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		if (temp2 == null) {

			while (temp1 != null) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			}
		}

		return merged;
	}

	public void display() {
		Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}

}

}
