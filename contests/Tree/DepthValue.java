/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTree;
import java.util.ArrayList;
import java.util.Scanner;
public class DepthValue {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		DepthValue m = new DepthValue();
		GenericTree gt1 = m.new GenericTree();
		gt1.Depthvalue();
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(null);
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

		public void Depthvalue() {
			Depthvalue(this.root,0);
		}

		private void Depthvalue(Node node,int ht) {
			
			System.out.print(ht+" => ");
			int t=node.children.size();
			while(t>0) {
				System.out.print(ht+1+", ");
				t--;
			}
			System.out.print("END");
			System.out.println();
			for(Node child:node.children) {
				
				Depthvalue(child,ht+1);
			}
			
		}
	
	
	
	}
}

