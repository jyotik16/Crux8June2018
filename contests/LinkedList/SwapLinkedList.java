package LinkedList;

import java.util.Scanner;
 
public class SwapLinkedList {
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
	public void swap(LinkedList list,int A,int B) {
		Node temp = this.head;
		Node tem = this.head;
		int a,b;
		while(temp!=null && tem!=null) {
			temp=temp.next;
			tem=tem.next;
			if(temp.data==A) {
				
				}
			if(temp.data==B) {
				temp.data=A;
				break;
				
			}
		}
		display();
	}
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		SwapLinkedList list = new SwapLinkedList();
		int N = scn.nextInt();
		while(N>0) {
			list.addLast(scn.nextInt());
			N--;
			}
		int A = scn.nextInt();
		int B = scn.nextInt();
		swap(A, B);
		
	}

}



