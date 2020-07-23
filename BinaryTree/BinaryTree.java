package BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

//assignments deleteLeaves,deletenode,levelorderlw,levelorderzigzag,balanced pair,diameter,preoderIs
public class BinaryTree {
	  	  	Scanner scn = new Scanner(System.in);

	  	private class Node {
	  		int data;
	  		Node left;
	  		Node right;
	  	}

	  	private Node root;

	  	public BinaryTree() {

	  		this.root = construct(null, false);
	  	}

	  	private Node construct(Node parent, boolean ilc) {

	  		if (parent == null) {
	  			System.out.println("Enter the data for root node ?");
	  		} else {

	  			if (ilc) {
	  				System.out.println("Enter the data for left child of " + parent.data);
	  			} else {
	  				System.out.println("Enter the data for right child of " + parent.data);
	  			}
	  		}

	  		int item = scn.nextInt();

	  		Node nn = new Node();
	  		nn.data = item;

	  		System.out.println(nn.data + " has left child ?");
	  		boolean hlc = scn.nextBoolean();

	  		if (hlc) {
	  			nn.left = construct(nn, true);
	  		}

	  		System.out.println(nn.data + " has right child ?");
	  		boolean hrc = scn.nextBoolean();

	  		if (hrc) {
	  			nn.right = construct(nn, false);
	  		}

	  		return nn;

	  	}

	  	public BinaryTree(int[] pre, int[] in) {
	  		this.root = construct1(pre, 0, pre.length - 1, in, 0, in.length - 1);

	  	}

	  	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

	  		if (plo > phi || ilo > ihi) {
	  			return null;
	  		}

	  		Node nn = new Node();
	  		nn.data = pre[plo];

	  		int si = -1;

	  		for (int i = ilo; i <= ihi; i++) {
	  			if (pre[plo] == in[i]) {
	  				si = i;
	  				break;
	  			}
	  		}

	  		int nel = si - ilo;

	  		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
	  		nn.right = construct(pre, plo + nel +1 , phi, in, si + 1, ihi);

	  		return nn;
	  	}
	  	private Node construct1(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

	  		if (plo > phi || ilo > ihi) {
	  			return null;
	  		}

	  		Node nn = new Node();
	  		nn.data = post[phi];

	  		int si = -1;

	  		for (int i = ilo; i <= ihi; i++) {
				if (post[phi] == in[i]) {
					si = i;
					break;
				}
			}
	  		int nel = si - ilo;

		nn.left = construct1(post, plo , plo + nel - 1, in, ilo, si - 1);
		nn.right = construct1(post, plo + nel, phi - 1, in, si + 1, ihi);

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
	  			str += ".";
	  		} else {
	  			str += node.left.data;
	  		}

	  		str += " -> " + node.data + " <- ";

	  		if (node.right == null) {
	  			str += ".";
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

		public void levelorderlw() {
			LinkedList<Node> helper = new LinkedList<>();
			LinkedList<Node> queue = new LinkedList<>();
			queue.addLast(this.root);
			while (!queue.isEmpty()) {
				
				Node nn = queue.removeFirst();
				System.out.print(nn.data + " ");

				if(nn.left!=null) {
					helper.addLast(nn.left);
				}
				if(nn.right!=null) {
					helper.addLast(nn.right);
				}

				if (queue.isEmpty()) {
					System.out.println();
					queue = helper;
					helper = new LinkedList<>();
				}
			}
		}

		public void levelorderzz() {

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
					System.out.println();
					queue = stack;
					stack = new LinkedList<>();
					count++;
				}
			}
			System.out.println();

		}

	  	public int max() {
	  		return max(this.root);
	  	}

	  	private int max(Node node) {

	  		if (node == null) {
	  			return Integer.MIN_VALUE;
	  		}

	  		int lm = max(node.left);
	  		int rm = max(node.right);

	  		return Math.max(node.data, Math.max(lm, rm));

	  	}

	  	public boolean find(int item) {
	  		return find(this.root, item);
	  	}

	  	private boolean find(Node node, int item) {

	  		if (node == null) {
	  			return false;
	  		}

	  		if (node.data == item) {
	  			return true;
	  		}

	  		boolean lf = find(node.left, item);
	  		boolean rf = find(node.right, item);

	  		return lf || rf;

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

	  	public int diameter() {
	  		return diameter(this.root);
	  	}

	  	private int diameter(Node node) {

	  		if (node == null) {
	  			return 0;
	  		}

	  		int ld = diameter(node.left);
	  		int rd = diameter(node.right);

	  		int sp = ht(node.left) + ht(node.right) + 2;

	  		return Math.max(sp, Math.max(ld, rd));
	  	}

	  	private class DiaPair {

	  		int diameter;
	  		int height;
	  	}

	  	public int diameter2() {

	  		return diameter2(this.root).diameter;
	  	}

	  	private DiaPair diameter2(Node node) {

	  		if (node == null) {
	  			DiaPair bp = new DiaPair();
	  			bp.height = -1;
	  			bp.diameter = 0;
	  			return bp;
	  		}

	  		DiaPair lp = diameter2(node.left);
	  		DiaPair rp = diameter2(node.right);

	  		DiaPair sp = new DiaPair();
	  		sp.height = Math.max(lp.height, rp.height) + 1;

	  		int ld = lp.diameter;
	  		int rd = rp.diameter;
	  		int s = lp.height + rp.height + 2;

	  		sp.diameter = Math.max(s, Math.max(ld, rd));

	  		return sp;
	  	}

	  	private class BalancedPair {

	  		boolean balanced;
	  		int height;
	  	}

	  	public boolean isBalanced() {

	  		return isBalanced(this.root).balanced;
	  	}

	  	private BalancedPair isBalanced(Node node) {

	  		if (node == null) {
	  			BalancedPair bp = new BalancedPair();
	  			bp.height = -1;
	  			bp.balanced = true;
	  			return bp;
	  		}

	  		BalancedPair lp = isBalanced(node.left);
	  		BalancedPair rp = isBalanced(node.right);

	  		BalancedPair sp = new BalancedPair();
	  		sp.height = Math.max(lp.height, rp.height) + 1;

	  		int bf = Math.abs(lp.height - rp.height);

	  		if (lp.balanced && rp.balanced && bf <= 1) {
	  			sp.balanced = true;
	  		}

	  		return sp;
	  	}

	  	public void preorder() {

	  		preorder(this.root);
	  		System.out.println();

	  	}

	  	private void preorder(Node node) {

	  		if (node == null) {
	  			return;
	  		}

	  		// node
	  		System.out.print(node.data + " ");

	  		// left
	  		preorder(node.left);

	  		// right
	  		preorder(node.right);

	  	}

	  	private class OrderPair {
	  		Node node;
	  		boolean selfDone;
	  		boolean leftDone;
	  		boolean rightDone;
	  	}

	  	public void preorderI() {

	  		LinkedList<OrderPair> stack = new LinkedList<>();

	  		OrderPair sp = new OrderPair();
	  		sp.node = this.root;

	  		stack.addFirst(sp);

	  		while (!stack.isEmpty()) {

	  			OrderPair tp = stack.getFirst();

	  			if (tp.selfDone == false) {
	  				System.out.print(tp.node.data + " ");
	  				tp.selfDone = true;

	  			} else if (tp.leftDone == false) {

	  				if (tp.node.left != null) {
	  					OrderPair np = new OrderPair();
	  					np.node = tp.node.left;
	  					stack.addFirst(np);
	  				}

	  				tp.leftDone = true;

	  			} else if (tp.rightDone == false) {

	  				if (tp.node.right != null) {
	  					OrderPair np = new OrderPair();
	  					np.node = tp.node.right;
	  					stack.addFirst(np);
	  				}

	  				tp.rightDone = true;
	  			} else {

	  				stack.removeFirst();
	  			}

	  		}
	  		System.out.println();

	  	}

	  	private class BSTPair {

	  		Node largestBSTRootNode;
	  		int size = 0;
	  		boolean isBST = true;
	  		int max = Integer.MIN_VALUE;
	  		int min = Integer.MAX_VALUE;
	  		int count=0;

	  	}

	  	public void isBST() {
	  		BSTPair res = isBST(this.root);

	  		System.out.println(res.largestBSTRootNode.data);
	  		System.out.println(res.size);
	  		System.out.println(res.count/2);
	  	}

	  	private BSTPair isBST(Node node) {

	  		if (node == null) {
	  			return new BSTPair();
	  		}

	  		BSTPair lp = isBST(node.left);
	  		BSTPair rp = isBST(node.right);

	  		BSTPair sp = new BSTPair();

	  		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
	  		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

	  		if (lp.isBST && rp.isBST && node.data > lp.max && node.data < rp.min) {

	  			sp.isBST = true;
	  			sp.size = lp.size + rp.size + 1;
	  			sp.largestBSTRootNode = node;
	  			sp.count=lp.count+rp.count+1;

	  		} else {

	  			if (lp.size > rp.size) {
	  				sp.isBST = false;
	  				sp.size = lp.size;
	  				sp.largestBSTRootNode = lp.largestBSTRootNode;
	  				sp.count=lp.count;
	  			} else {
	  				sp.isBST = false;
	  				sp.size = rp.size;
	  				sp.largestBSTRootNode = rp.largestBSTRootNode;
	  				sp.count=rp.count;
	  			}

	  		}

	  		return sp;

	  	}
	  	
	  	private class heap{
	  		int rl =0;
	  		boolean f =false;
	  	}
	  	public void deletenode(int item) {
			heap h =new heap();
			deletenode(this.root,item,null,h);
		}
		private void deletenode(Node node,int item,Node par,heap h) {
		
		if (node == null)
			return;
		if (node.data == item) {
			
			if(node.left!=null && node.right!=null) {
				Node temp = travese(node.left,par,h);
				deletenode(node,temp.data,par,h);
				node.data = temp.data;
				
			
			}
			else if (node.left != null) {
				
				if (h.rl == -1)
					par.left = node.left;
				else
					par.right = node.left;

			} else if (node.right != null) {
				
				if (h.rl == -1)
					par.left = node.right;

				else
					par.right = node.right;

			} else {
				
				if (h.rl == -1)
					par.left = null;

				else
					par.right = null;
			}
			return;
		}
		if (node.left != null) {
			h.rl=-1;
			deletenode(node.left, item, node, h);
		}
		 if (node.right != null) {
			h.rl=1;
			deletenode(node.right, item, node, h);
		}
		else if(node.left==null && node.right==null){
			return;
			}

		}

		private Node travese(Node n, Node par, heap h) {
			
			if(n==null)
				return n;
			if(n.left!=null)
				travese(n.left,n,h);
			
			return n;
				
		}
		
		public void deleteLeaves() {
			deleteLeaves(this.root,null,new heap());
		}
		private void deleteLeaves(Node nn, Node par, heap h) {

		if (nn == null)
			return;
		if (nn.left != null || nn.right!=null) {
			h.rl = -1;
			deleteLeaves(nn.left, nn, h);
			h.rl = 1;
			deleteLeaves(nn.right, nn, h);

		}

		else if (nn.left == null && nn.right == null) {
			if (par != null && h.rl == -1 ) {
				par.left = null;

			} else if (par != null && h.rl == 1 ) {
				par.right = null;

			}
		}
		
}
		
}
/* diametere2()
--------------------
20 -> 10 <- 30
40 -> 20 <- 50
. -> 40 <- .
. -> 50 <- .
60 -> 30 <- 70
. -> 60 <- .
. -> 70 <- 80
. -> 80 <- .
--------------------
5
*/


