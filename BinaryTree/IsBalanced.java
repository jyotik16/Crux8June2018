package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//assignments isbalanced ,level of list, sum of nodes,Structrally identical,sibling,LCA,root to leafs,LCA
public class IsBalanced {

	static Scanner scn = new Scanner(System.in);

	// 10 true 20 true 40 false false false true 30 true 60 false false true 70 false false
	// 10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false

	public static void main(String[] args) {
		IsBalanced m = new IsBalanced();
		// String str = "10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false";
		 
		//String str = "10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false";
		String str = new String();
		str = scn.next();
		BinaryTree bt = m.new BinaryTree(str);
		// BinaryTree bt1 = m.new BinaryTree();
		// System.out.println(bt.isBalanced());
		// bt.LevelsList();
		// bt.SumofNodes();
		// bt.SI(bt1);
		// bt.sibling();
		// bt.RoottoLeaf(100);
		bt.LCA(50, 60);
		// bt.path(60);
			bt.display();

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

		public BinaryTree(String str) {
			scn = new Scanner(str);
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {

			if (node == null) {
				BalancedPair bp = new BalancedPair();
				bp.height = -1;
				bp.isBalanced = true;
				return bp;
			}

			BalancedPair lp = isBalanced(node.left);
			BalancedPair rp = isBalanced(node.right);

			BalancedPair sp = new BalancedPair();
			sp.height = Math.max(lp.height, rp.height) + 1;

			int bf = Math.abs(lp.height - rp.height);

			if (lp.isBalanced && rp.isBalanced && bf <= 1) {
				sp.isBalanced = true;
			}

			return sp;
		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

		public void LevelsList() {
			LevelList(this.root);
		}

		private void LevelList(Node node) {
			ArrayList<ArrayList<Integer>> ll = new ArrayList<ArrayList<Integer>>();
			LinkedList<Node> queue = new LinkedList<>();
			LinkedList<Node> helper = new LinkedList<>();
			queue.addLast(this.root);
			ArrayList<Integer> subll = new ArrayList<Integer>();
			ArrayList<Integer> sublist = new ArrayList<Integer>();
			subll.add(this.root.data);
			ll.add(subll);
			while (!queue.isEmpty()) {

				Node nn = queue.removeFirst();
				if (nn.left != null) {
					helper.addLast(nn.left);
					sublist.add(nn.left.data);
					System.out.println("1");

				}
				if (nn.right != null) {
					helper.addLast(nn.right);
					sublist.add(nn.right.data);
					System.out.println("2");
				}

				if (queue.isEmpty()) {
					queue = helper;
					helper = new LinkedList<>();

					if (sublist.size() != 0) {
						ll.add(sublist);
					}
					sublist = new ArrayList<Integer>();
				}
			}
			System.out.println(ll);
		}

		public void SumofNodes() {
			System.out.println(SumofNodes(this.root));
			;
		}

		private int SumofNodes(Node node) {
			LinkedList<Node> queue = new LinkedList<>();
			LinkedList<Node> helper = new LinkedList<>();
			int sum = 0;
			sum += this.root.data;
			queue.addLast(this.root);
			while (!queue.isEmpty()) {

				Node nn = queue.removeFirst();
				if (nn.left != null) {
					helper.addLast(nn.left);
					sum += nn.left.data;

				}
				if (nn.right != null) {
					helper.addLast(nn.right);
					sum += nn.right.data;
				}

				if (queue.isEmpty()) {
					queue = helper;
					helper = new LinkedList<>();

				}
			}
			return sum;
		}

		public void SI(BinaryTree b) {
			System.out.println(SI(this.root, b.root));

		}

		private boolean SI(Node t, Node o) {
			boolean flag = false;
			if (t != null && o != null) {
				int l1 = size(t);
				int l2 = size(o);
				if (l1 == l2) {
					flag = true;
				} else {
					flag = false;
				}
			}
			return flag;

		}

		public int size(Node node) {

			if (node == null) {
				return 0;
			}

			int ls = size(node.left);
			int rs = size(node.right);

			return ls + rs + 1;
		}

		public void sibling() {

			sibling1(this.root, null);
		}

		private void sibling1(Node node, Node parent) {

			if (node == null) {
				return;
			}
			if (parent != null && parent.left == null && parent.right != null) {

				System.out.print(node.data + " ");
			}
			if (parent != null && parent.left != null && parent.right == null) {
				System.out.print(node.data + " ");
			}
			sibling1(node.left, node);
			sibling1(node.right, node);

		}

		private void sibling(Node node, Node parent) {

			if (node == null) {
				return;
			}
			int lch = size(node.left);
			int rch = size(node.right);
			if ((lch == 0 && rch > 0) || (lch > 0 && rch == 0)) {
				if (parent != null)
					System.out.print(node.data + " ");
			}
			if (lch == 0 && rch == 0) {
				int plc = size(parent.left);
				int prc = size(parent.right);
				if (plc == 0 || prc == 0) {
					if (parent != null)
						System.out.print(node.data + " ");
				}
			}
			sibling(node.left, node);
			sibling(node.right, node);

		}

		private class heapmover {

			int flag = 0;
		}

		public void RoottoLeaf(int k) {
			LinkedList ll = new LinkedList();
			heapmover h = new heapmover();
			int res = RoottoLeaf(this.root, k, 0, ll, h);
			if (res == 1) {

			} else {
				System.out.println("-1");
			}

		}

		private int RoottoLeaf(Node node, int k, int asf, LinkedList ll, heapmover h) {

			asf += node.data;
			ll.addLast(node.data);
			if (asf == k) {
				h.flag = 1;
				for (int i = 0; i < ll.size(); i++) {
					System.out.print(ll.get(i) + " ");

				}
				return h.flag;
			}
			// left child
			if (node.left != null) {
				RoottoLeaf(node.left, k, asf, ll, h);
			}
			if (node.right != null) {
				RoottoLeaf(node.right, k, asf, ll, h);
			}

			ll.removeFirst();
			return h.flag;

		}

		public void LCA(int n1, int n2) {

			LCA(this.root, n1, n2);

		}

		private void LCA(Node node, int n1, int n2) {

			findpath pair1  = path(node,n1,new findpath());
			findpath pair2  = path(node,n2,new findpath());
			System.out.println(pair1.list);
			System.out.println(pair2.list);
			int i;
			for( i=0;i<pair1.list.size() && i<pair2.list.size(); i++) {
				if(!pair1.list.get(i).equals(pair2.list.get(i))) {
					break;
				}
			}
			System.out.println(pair1.list.get(i-1));
			
		}

		private class findpath {
			boolean f;
			ArrayList<Integer> list = new ArrayList<>();
		}

		public void path(int t) {
			// System.out.println(path(this.root,t,new ArrayList<Integer>()));
			findpath reslp = path(this.root, t, new findpath());
			System.out.println(reslp.list);

		}

		private findpath path(Node node, int t, findpath pp) {

			if (node == null) {
				findpath np = new findpath();
				np.f = false;
				return np;
			}

			pp.list.add(node.data);

			if (node.data == t) {
				pp.f = true;
				return pp;
			}

			if (node.left != null) {
				findpath lp = path(node.left, t, pp);
				if (lp.f)
					return lp;
			}
			if (node.right != null) {
				findpath rp = path(node.right, t, pp);
				if (rp.f)
					return rp;
			}

			pp.list.remove(pp.list.size() - 1);
			pp.f = false;
			return pp;

		}

		public void display() {
			display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			display(node.left);
			display(node.right);
		}

	}

}
