package GenericTree;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		Main m = new Main();  //10 3 20 2 50 0 60 0 30 0 40 1 70 0
		GenericTree gt1 = m.new GenericTree();
		//GenericTree gt2 = m.new GenericTree();
		//int data = scn.nextInt();
		//gt.SumOfNodes(data);
		//gt.MultiSolver(data);
		//gt.leafNodes();
		//  gt1.StructrallyI(gt2);
			gt1.Depthvalue(); // CTRL + SHIFT + F
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

		public void leafNodes() {
			System.out.println(leafNodes(this.root, 0));
		}

		private int leafNodes(Node node, int c) {

			if (node.children.size() == 0) {
				return 1;
			}
			c = 0;
			for (Node child : node.children) {

				c += leafNodes(child, c);
			}
			return c;
		}

		public void SumOfNodes() {
			System.out.println(SumofNodes(this.root, this.root.data));
		}

		private int SumofNodes(Node node, int sum) {
			int t = 0;
			for (Node child : node.children) {

				t = child.data;
				sum = sum + SumofNodes(child, t);

			}

			return sum;
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
			// System.out.println("size: "+mover.size);
			// System.out.println("max: "+mover.max);
			// System.out.println("height: "+mover.ht);
			// System.out.println("find: "+mover.find);
			// System.out.println("predesuccesor:"+(mover.pre==null?null:mover.pre.data));
			// System.out.println("succesor:"+(mover.succsor==null?null:mover.succsor.data));
			System.out.println("justlarge:" + (mover.jl == null ? null : mover.jl.data));

		}

		public void MultiSolver(Node node, HeapMover mover, int count, int item) {
			mover.size++;
			// height
			if (count > mover.ht) {
				mover.ht = count;
			}
			// find
			if (node.data == item) {
				mover.find = true;

			}
			// max
			if (node.data > mover.max) {
				mover.max = node.data;
			}

			for (Node child : node.children) {
				MultiSolver(child, mover, count + 1, item);
			}
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
			if (node.data > mover.max) {
				mover.max = node.data;
			}
			if (node.data > item) {
				if (mover.jl == null || node.data < mover.jl.data)
					mover.jl = node;
			}

			for (Node child : node.children) {

				MultiSolver1(child, mover, count + 1, item);
			}
		}

		public void StructrallyI(GenericTree g2) {
			ArrayList<Integer> res1 = StructrallyI1(this.root, new ArrayList<Integer>());
			ArrayList<Integer> res2 = StructrallyI1(g2.root, new ArrayList<Integer>());
			if (res1.equals(res2)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

		private ArrayList<Integer> StructrallyI1(Node tnode, ArrayList<Integer> strg) {

			strg.add(tnode.children.size());
			for (Node child : tnode.children) {
				StructrallyI1(child, strg);
			}
			return strg;
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
