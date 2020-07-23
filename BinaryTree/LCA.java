package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//assignments LCA,print all path from root to leafs
public class LCA {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LCA m = new LCA();
//		String str = new String();
//		str = scn.next();
		BinaryTree bt = m.new BinaryTree();
	//	int n1 = scn.nextInt();
	//	int n2 = scn.nextInt();
	//	bt.LCA(n1, n2);
	    bt.allpath();	
		
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
			//scn = new Scanner(str);
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
		public void LCA(int n1, int n2) {

			LCA(this.root, n1, n2);

		}

		private void LCA(Node node, int n1, int n2) {

			findpath pair1  = path(node,n1,new findpath());
			findpath pair2  = path(node,n2,new findpath());
			//System.out.println(pair1.list);
			//System.out.println(pair2.list);
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
			
			findpath reslp = path(this.root, t, new findpath());
			
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

		public void allpath() {
			allpath(this.root,this.root);
		}

		private void allpath(Node n,Node root) {
			
			if(n == null)
				return;
			//print all path of all leafs
			/*if(n.left!=null)
			{
				findpath lp = path(root,n.left.data,new findpath());
				System.out.println(lp.list);
				allpath(n.left,root);
			}
			if(n.right!=null)
			{
				findpath rp = path(root,n.right.data,new findpath());
				System.out.println(rp.list);
				allpath(n.right,root);
			}*/
			//only last leafs
			
			if(n.left!=null) {
				allpath(n.left,root);
			}
			if(n.right!=null) {
				allpath(n.right,root);
			}
			if(n.left==null && n.right==null) {
					findpath pp = path(root,n.data,new findpath()); //we need path function to calculate .
					System.out.println(pp.list);
					
				}
			
			
		}
	
	}

}

