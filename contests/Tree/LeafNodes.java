/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTree;

import java.util.ArrayList;
import java.util.Scanner;
public class LeafNodes {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		LeafNodes m = new LeafNodes();
		GenericTree gt = m.new GenericTree();
		gt.leafNodes();

	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput( null);
		}

		private Node takeInput(Node parent) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(child);
				child.children.add(gc);
			}

			return child;
		}

		public void leafNodes() {
			System.out.println(leafNodes(this.root,0));
		}

		private int leafNodes(Node node,int c) {
			
			if(node.children.size()==0) {
				return 1;
			}
				c=0;
			for (Node child : node.children) {
				
				c+=leafNodes(child,c);
			}
			return c;
		}

    }
}

