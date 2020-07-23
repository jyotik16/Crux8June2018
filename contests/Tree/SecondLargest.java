
import java.util.ArrayList;
import java.util.Scanner;
public class SecondLargest  {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		SecondLargest m = new SecondLargest();
		GenericTree gt = m.new GenericTree();
		
		gt.MultiSolver();

	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(new Scanner(System.in), null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public int max() {
			return max(this.root);
		}

		private int max(Node node) {

			int tm = node.data;
			for (Node child : node.children) {
				int cm = max(child);

				if (cm > tm) {
					tm = cm;
				}
			}

			return tm;
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

	public void MultiSolver() {
		HeapMover mover = new HeapMover();
		int max = max();
		MultiSolver1(this.root, mover, 0, max);
		System.out.println((mover.jl==null?null:mover.jl.data));

	}

		public void MultiSolver1(Node node, HeapMover mover, int count, int item) {
			mover.size++;
			// height
			if (count > mover.ht) {
				mover.ht = count;
			}
			// succ
			if (mover.find == true && mover.pre == null) {
				mover.pre = node;
			}
			// find
			if (node.data == item) {
				mover.find = true;

			}
			// presucc
			if (mover.find == false) {
				mover.succsor = node;
			}
			// max
			if (node.data < mover.max) {
				mover.max = node.data;
			}
			if (node.data < item) {
				if (mover.jl == null || node.data > mover.jl.data)
					mover.jl = node;
			}

			for (Node child : node.children) {

				MultiSolver1(child, mover, count + 1, item);
			}
		}

	}
}
