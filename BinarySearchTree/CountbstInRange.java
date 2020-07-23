package BinarySearchTree;

import java.util.Scanner;
//assignments count bst in given range,
public class CountbstInRange {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		CountbstInRange bb = new CountbstInRange();
	//	int n = scn.nextInt();
	//	int[] in = new int[n];
	//	int[] in = {4,8,10,12,14,20,22};
	//	for(int i=0;i<n;i++)
	//		in[i]=scn.nextInt();
	//	int low = scn.nextInt();
	//	int high = scn.nextInt();
		binarysearchtree ob = bb.new binarysearchtree(in);
		ob.display();
	//	ob.isBST(low,high);
		ob.LCA(10, 4);
	}

public class binarysearchtree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public binarysearchtree(int[] in) {

		this.root = construct( in,0,in.length-1);
	}

	private Node construct(int[] in,int ilo,int ihi) {
		if(ilo>ihi)
			return null;
		int mid=(ilo+ihi)/2;
		Node nn= new Node();
		nn.data=in[mid];
//		System.out.println(nn.data);
		
		nn.left=construct(in,ilo,mid-1);
		nn.right=construct(in,mid+1, ihi);
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

  	private class BSTPair {

  		Node largestBSTRootNode;
  		int size = 0;
  		boolean isBST = true;
  		int max = Integer.MIN_VALUE;
  		int min = Integer.MAX_VALUE;
  		int count=0;

  	}

  	public void isBST(int l,int h) {
  		BSTPair res = isBST(this.root,l,h);

  	//	System.out.println(res.largestBSTRootNode.data);
  	//	System.out.println(res.size);
  		System.out.println((res.count+1)/2);
  	}

  	private BSTPair isBST(Node node,int lo,int hi) {
  		BSTPair spp = new BSTPair();
  		if (node == null) {
  			return new BSTPair();
  		}
  		if(node.data >=lo && node.data <= hi) {
  		BSTPair lp = isBST(node.left,lo,hi);
  		BSTPair rp = isBST(node.right,lo,hi);
  		
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
  				sp.count=lp.count+1;
  			} else {
  				sp.isBST = false;
  				sp.size = rp.size;
  				sp.largestBSTRootNode = rp.largestBSTRootNode;
  				sp.count=rp.count+1;
  		}
  		}
  		spp =sp;
  		}
  		
  		return spp;
		}
  		
  	public void LCA(int n1,int n2) {
  		System.out.println(LCA(this.root,n1,n2).data);
  	}
  	private Node LCA(Node node,int n1,int n2) {
  		if(node==null) {
  			return null;
  		}
  		if(node.data > n1 && node.data >n2) {
  			return LCA(node.left,n1,n2);
  		}
  		if(node.data < n1 && node.data <n2) {
  			return LCA(node.right,n1,n2);
  		}
  		return node;
  	}

}
}


