package contest2;

import java.util.Scanner;
public class KthreverseLinkedlist {
	static Scanner scn = new Scanner(System.in);
			public static void main(String[] args) throws Exception {
			KthreverseLinkedlist obj =new KthreverseLinkedlist();
			LinkedList list = obj.new LinkedList();
			int N = scn.nextInt();
			int K = scn.nextInt();
			for(int i=0;i<N;i++) {
				int a=scn.nextInt();
				list.addLast(a);
			}
			list.kReverse(K);
			list.display();

	}
	private class LinkedList {

		private class Node {
			int data;
			Node next;
		}
		

		private Node head; 	private Node tail; 	private int size;

		public int getFirst() throws Exception {

			if (this.size == 0) {
				throw new Exception("LL is Empty.");
			}

			return this.head.data;

		}
		
		public void display() {

			//System.out.println("----------------------");
			Node temp = this.head;

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			//System.out.println(".");
			//System.out.println("----------------------");

		}
		public void kReverse(int k) throws Exception {

			LinkedList prev = null;

			while (this.size != 0) {

				LinkedList curr = new LinkedList();
				for (int i = 1; i <= k; i++) {
					curr.addFirst(this.removeFirst());
				}

				if (prev == null) {
					prev = curr;
				} else {
					prev.tail.next = curr.head;
					prev.tail = curr.tail;
					prev.size += curr.size;
				}
			}

			this.head = prev.head;
			this.tail = prev.tail;
			this.size = prev.size;

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

		public void addFirst(int item) {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			nn.next = this.head;

			// dm update
			if (this.size == 0) {
				this.head = nn;
				this.tail = nn;
				this.size++;
			} else {
				this.head = nn;
				this.size++;
			}

		}

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
		
	}
		
	}

