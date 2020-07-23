package GenericTree;
import java.util.ArrayList;
import java.util.Scanner;
public class JustLarger  {

	static	Scanner scn = new Scanner(System.in);
	public static void main(String[] args)  {
		JustLarger m = new JustLarger();
		GenericTree gt = m.new GenericTree();
		int data = scn.nextInt();
		gt.MultiSolver(data);

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

		private Node takeInput( Node parent) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput( child);
				child.children.add(gc);
			}

			return child;
		}


		private class HeapMover {
		int size=0;
		int max = Integer.MIN_VALUE;
		int ht;
		boolean find;
		Node pre=null;
		Node succsor=null;
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
