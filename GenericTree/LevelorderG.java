package GenericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LevelorderG {
public static void main(String[] args) {
	LevelorderG m = new LevelorderG();
	GenericTree ob = m.new GenericTree();
	ob.levelorderAlw();
	ob.display();
	
}

	private class GenericTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	private Node root;
	public GenericTree() {
		this.root = construct(null, -1);
	}
	// create parent ith child, return the root node of subtree
	private Node construct(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}

		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();
		nn.data = item;

		System.out.println("Enter the no of children for " + nn.data);
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {

			Node child = construct(nn, i);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {
		//System.out.println("--------------");
		display(this.root);
		//System.out.println("--------------");
	}

	private void display(Node node) {

		// self work of printing
		String str = node.data + " -> ";

		for (Node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

		// smaller prob
		for (Node child : node.children) {
			display(child);
		}

	}

	public void levelorderAlw() {
		levelorderlw();
	}

	private void levelorderlw() {
		LinkedList<Node> helper = new LinkedList<>();
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node nn = queue.removeFirst();
			System.out.print(nn.data + " ");

			for (Node child : nn.children) {
				helper.addLast(child);

			}

			if (queue.isEmpty()) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();
			}
		}
	}
	
}

/*	private class LinkedList {

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

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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

	
	}*/
}
