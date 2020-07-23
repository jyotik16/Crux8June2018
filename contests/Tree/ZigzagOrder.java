/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTree;

import java.util.*;
public class ZigzagOrder {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ZigzagOrder m = new ZigzagOrder();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			
			LinkedList<Node> queue = new LinkedList<>();
			LinkedList<Node> stack = new LinkedList<>();

			int count = 0;

			// put the root node in queue
			queue.addLast(this.root);

			while (!queue.isEmpty()) {

				// remove the node
				Node rn = queue.removeFirst();

				// syso
				System.out.print(rn.data + " ");

				// put the children at back
				if (count % 2 == 0) {
					if(rn.left!=null) {
						stack.addFirst(rn.left);
					}
					if(rn.right!=null) {
						stack.addFirst(rn.right);
					}
				} else {
					if(rn.right!=null) {
						stack.addFirst(rn.right);
					}
					if(rn.left!=null) {
						stack.addFirst(rn.left);
					}
				}

				if (queue.isEmpty()) {
					//System.out.println();
					queue = stack;
					stack = new LinkedList<>();
					count++;
				}
			}
			System.out.println();
		}

	}

}

