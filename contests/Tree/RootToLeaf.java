/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericTree;

import java.util.Scanner;
import java.util.LinkedList;
public class BinaryTree {  //got 66 points
	static Scanner scn = new Scanner(System.in);
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    int size;

    public BinaryTree(int rootData, BinaryTree leftST, BinaryTree rightST) {
        this.root = new Node(rootData, null, null);
        this.root.left = leftST != null ? leftST.root : null;
        this.root.right = rightST != null ? rightST.root : null;

        this.size += leftST != null ? leftST.size : 0;
        this.size += rightST != null ? rightST.size : 0;
        this.size += 1;
    }

    public BinaryTree() {
        
        this.root = this.takeInput(scn, null, false);
    }

    private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
        if (parent == null) {
            //System.out.println("Enter the data for root ");
        } else {
            if (isLeft) {
                //System.out.println("Enter the data for left child of " + parent.data);
            } else {
               // System.out.println("Enter the data for right child of " + parent.data);
            }
        }

        int cData = scn.nextInt();

        Node child = new Node(cData, null, null);
        this.size++;

        //System.out.println("Do you have a left child for " + child.data);
        boolean choice = scn.nextBoolean();

        if (choice) {
            child.left = this.takeInput(scn, child, true);
        }

       //  System.out.println("Do you have a right child for " + child.data);
        choice = scn.nextBoolean();

        if (choice) {
            child.right = this.takeInput(scn, child, false);
        }

        return child;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node node) {
        if (node == null) {
            return "";
        }

        String retVal = "";

        if (node.left != null) {
            retVal += node.left.data + " => ";
        } else {
            retVal += "END" + " => ";
        }

        retVal += node.data;

        if (node.right != null) {
            retVal += " <= " + node.right.data;
        } else {
            retVal += " <= " + "END";
        }

        retVal += "\n";

        retVal += this.toString(node.left);
        retVal += this.toString(node.right);

        return retVal;
    }
private class heapmover {

			int flag = 0;
		}

		public void RoottoLeaf(int k) {
			LinkedList ll = new LinkedList();
			heapmover h = new heapmover();
			int res =RoottoLeaf(this.root, k, 0, ll,h);
			if(res==1) {
				
			}else {
				System.out.println("-1");
			}

		}

		private int RoottoLeaf(Node node,int k,int asf,LinkedList ll,heapmover h) {
			
			asf+=node.data;
			ll.addLast(node.data);
			if(asf==k) {
				h.flag=1;
				for(int i=0;i<ll.size();i++) {
					System.out.print(ll.get(i)+" ");
				
			}
				return h.flag;
			}
			// left child
			if(node.left!=null) {
				RoottoLeaf(node.left, k, asf, ll,h);
			}
			if(node.right!=null) {
				RoottoLeaf(node.right, k, asf, ll,h);
			}
			
			ll.removeFirst();
			return h.flag;

			}
public static void main(String[] args) {

		BinaryTree b1= new BinaryTree();
		
		int k= scn.nextInt();
		b1.RoottoLeaf(k);
}
}

