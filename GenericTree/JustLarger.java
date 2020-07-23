package GenericTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//assignment  leaf nodes, multisolver(justlarger),structrally identical,Print_till k
public class JustLarger {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		JustLarger m = new JustLarger();
		GenericTree gt = m.new GenericTree();
	//	GenericTree gt1 = m.new GenericTree();
	//	System.out.println(gt.countLeafNodes());;
	//	int data = scn.nextInt();
	//	gt.MultiSolver(data);
	//	gt.structurallyIdentical(gt, gt1);
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
		public void structurallyIdentical(GenericTree n,GenericTree m) {
			System.out.println(structurallyIdentical(n.root,m.root));
		}
		private boolean structurallyIdentical(Node tnode, Node onode) {
			  
			  for(int i = 0,j=0 ; i < tnode.children.size() && j<onode.children.size() ; i++ , j++)
			  {
			      Node tchild = tnode.children.get(i);
			      Node ochild = onode.children.get(j);
			      
			      if(structurallyIdentical(tchild,ochild))
			      {
			    	  if(tnode.children.size()==onode.children.size())
			    		  return true;
			      }
			  }
				
			  if(tnode.children.size() == onode.children.size() )
				  return true;
			  
			  return false;
				
			}
		public int countLeafNodes() {
			return this.countLeafNodes(this.root, 0);
		}

		private int countLeafNodes(Node node,int count) {
		//	 count = 0;
			if (node.children.size() == 0) {
				return 1;
			
			}
			count=0;
			for (Node child : node.children) {

				count+=countLeafNodes(child,count);
			}
			return count;

		}
		private class HeapMover {
			int size = 0;
			int max = Integer.MIN_VALUE;
			int ht;
			boolean find;
			Node pre = null;
			Node succsor = null;
			Node jl;
		}

		public void MultiSolver(int item) {
			HeapMover mover = new HeapMover();
			MultiSolver1(this.root, mover, 0, item);
			System.out.println((mover.jl == null ? -1 : mover.jl.data));
		}

		public void MultiSolver1(Node node, HeapMover mover, int count, int item) {
			mover.size++;
			// find
			if (node.data == item) {
				mover.find = true;

			}
			// max
			if (node.data > mover.max) {
				mover.max = node.data;
			}

			if (node.data > item) {
				if (mover.jl == null) {
					mover.jl = node;
				} else if (mover.jl.data > node.data) {
					mover.jl = node;
				}
				
			}

			for (Node child : node.children) {

				MultiSolver1(child, mover, count + 1, item);
			}
		}
		
		
		
		
		
		
	}
}
