package BinarySearchTree;

import java.util.Arrays;

public class binarysearchtree {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public binarysearchtree(int[] in) {

		this.root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int ilo, int ihi) {
		if (ilo > ihi)
			return null;
		int mid = (ilo + ihi) / 2;
		Node nn = new Node();
		nn.data = in[mid];
		// System.out.println(nn.data);

		nn.left = construct(in, ilo, mid-1);
		nn.right = construct(in, mid+1, ihi);
		return nn;
	}

	public void display() {
		System.out.println("--------------------");
		display(this.root);
		System.out.println("--------------------");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += "END";
		} else {
			str += node.left.data;
		}

		str += " => " + node.data + " <= ";

		if (node.right == null) {
			str += "END";
		} else {
			str += node.right.data;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {

		if (node.right != null)
			return max(node.right);

		return node.data;

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null)
			return false;
		if (item > node.data)
			return find(node.right, item);
		else if (item < node.data)
			return find(node.left, item);
		else
			return true;
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;
		}

		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	public void printInrange(int lo, int hi) {
		printInrange(this.root, lo, hi);
	}

	private void printInrange(Node node, int lo, int hi) {

		if (node == null) {
			return;
		}

		if (node.data < lo) {
			printInrange(node.right, lo, hi);
		} else if (node.data >= hi) {
			printInrange(node.left, lo, hi);
		} else if (node.data >= lo && node.data <= hi) {
			printInrange(node.left, lo, hi);
			System.out.print(node.data + " ");
			printInrange(node.right, lo, hi);
		}
 
	}

	public void printDec() {
		printDec(this.root);
	}

	private void printDec(Node node) {

		if (node == null)
			return;
		printDec(node.right);
		System.out.print(node.data + " ");
		printDec(node.left);
	}

	private class Heapmover {
		int sum = 0;
	}

	public void ReplacewithSumoflarger() {
		Heapmover hh = new Heapmover();
		ReplacewithSumoflarger(this.root, hh);
	}

	private void ReplacewithSumoflarger(Node node, Heapmover mover) {
		if (node == null) {
			return;
		}

		ReplacewithSumoflarger(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum = mover.sum + temp;
		ReplacewithSumoflarger(node.left, mover);

	}

	public void Addnode(int item) {
		Addnode(this.root, item, null);
	}

	private void Addnode(Node node, int item, Node par) {

		if (node == null) {
			Node nn = new Node();
			nn.data = item;
			if (item < par.data)
				par.left = nn;
			else
				par.right = nn;
			return;
		}
		if (item > node.data) {
			Addnode(node.right, item, node);

		} else if (item < node.data) {
			Addnode(node.left, item, node);

		}

	}

	public void deletenode(int item) {

		deletenode(this.root, item, null);
	}

	private void deletenode(Node node, int item, Node par) {
		if (node == null)
			return;
		if (item < node.data)
			deletenode(node.left, item, node);
		else if (item > node.data)
			deletenode(node.right, item, node);
		else {
			if (node.left == null && node.right == null) {
				if (node.data < par.data)
					par.left = null;
				else
					par.right = null;
			} else if (node.left == null && node.right != null) {
				if (node.data < par.data)
					par.left = node.right;
				else
					par.right = node.right;
			} else if (node.left != null && node.right == null) {
				if (node.data < par.data)
					par.left = node.left;
				else
					par.right = node.left;
			} else {
				int temp = max(node.left);
				deletenode(node.left, node.left.data, node);
				node.data = temp;
			}
		}

	}
//wrong
	public void deleteinrange(int n1, int n2) {
		deleteinrange(this.root, n1, n2);
	}

	private void deleteinrange(Node node, int n1, int n2) {
		if (node == null)
			return;
		if (node.data > n1 && node.data > n2) {
			deletenode(node.right.data);
		}
		if (node.data < n1 && node.data < n2) {
			deletenode(node.left.data);
		}

		deleteinrange(node, n1, n2);
	}
//wrong
	public void PrinttillK(int Target, int k) {
		PrinttillK(this.root, Target, k);
	}

	private int PrinttillK(Node nn, int target, int k) {

		if (nn == null)
			return 0;
		if (nn.data == target) {
			PrintDown(nn, target, 0);
		}

		int ld = PrinttillK(nn.left, target, k);
		if (ld != -1) {
			// System.out.println(nn.data);
		} else {
			PrintDown(nn.right, k - ld - 2, 0);
		}
		int rd = PrinttillK(nn.right, target, k);
		if (rd != -1) {
			// System.out.println(nn.data);
		} else {
			PrintDown(nn.left, k - rd - 2, 0);

		}

		return ld + rd + 2;
	}

	private void PrintDown(Node nn, int level, int count) {

		if (nn == null)
			return;
		if (level == count)
			System.out.print(nn.data + " ");

		PrintDown(nn.left, level, count + 1);
		PrintDown(nn.right, level, count + 1);
	}

	public void addDuplicate(int[] in) {

		int[] ri = Arrays.copyOfRange(in, 0, in.length);
		
		Arrays.sort(in);
		binarysearchtree bb = new binarysearchtree(in);
	//	bb.display();
		for (int i = 0; i < ri.length; i++) {
	//		System.out.print(" node= " + ri[i] + " ");

   		    Node lc = findlc(ri[i], bb.root);
//		    if (lc != null)
//				System.out.print(" lc = " + lc.data);
//			else
//				System.out.print(" lc = 0");

			Node rc = findrc(ri[i], bb.root);
//			if (rc != null)
//				System.out.println(" rc = " + rc.data);
//			else
//				System.out.println(" rc = 0");

			if (lc == null && rc != null)
				addDupli(ri[i], 0, rc.data);
			else if (lc != null && rc == null)
				addDupli(ri[i], lc.data, 0);
			else if (lc == null && rc == null)
				addDupli(ri[i], 0, 0);
			else
				addDupli(ri[i], lc.data, rc.data);
		}
	}

	private Node findrc(int i, Node n) {

		if (n.data == i) {
			if (n.right != null) {
				//System.out.print(" " + n.data + " = rc =" + n.right.data);
				return n.right;
			} 
			else {
				return null;
			}

		}
		if (n.right != null) {
			Node rc = findrc(i, n.right);
			return rc;
		}

		return null;
	}

	private Node findlc(int i, Node n) {
		if (n.data == i) {
			if (n.left != null)
				return n.left;
			else
				return n;
		}
		if (n.left != null) {
			Node lc = findrc(i, n.left); 
			return lc;
		}

		return n;
	}

	private void addDupli(int ele, int lc, int rc) {

		// left child only
		if(lc!=0 && rc!=0)
			System.out.println(ele+" => "+ele+" <= "+rc);
		else if(lc==0 && rc!=0)
			System.out.println(ele+" => "+ele+" <= "+rc);
		else
			System.out.println(ele+" => "+ele+" <= END");
		
		//right chlid only
		if(lc!=0 && rc!=0)
			System.out.println( lc+" => "+ele+" <= END");
		else if(lc==0 && rc!=0)
			System.out.println("END => "+ele+" <= "+rc);
		else
			System.out.println("END => "+ele+" <= END");
	}

}