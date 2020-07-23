package BinaryTree;

public class BTClient {

	public static void main(String[] args) {

		// int[] pre = { 10, 20, 40, 70, 50, 60, 30, 80 };
		// int[] in = { 40, 70, 20, 60, 50, 10, 30, 80 };

		// 10 true 20 true 40 false false true 50 false false true 30 true 60 false false false
		// 
		//10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
	//	BinaryTree bt = new BinaryTree();
	//50 true 12 true 18 false false false false
	//	bt.levelorderzz();
	//	bt.levelorderlw();
	//	int[] pre = { 1000, 50, 20, 60, 55, 65, 2000, 150, 120, 160, 170, 180, 190, 195, 250, 240, 260 };
	//	int[] in = { 20, 50, 55, 60, 65, 1000, 120, 150, 160, 170, 180, 190, 195, 2000, 240, 250, 260 };
		
	//	int[] in= {10,20,33,45,55,67};
	//	int[] pre= {33,10,20,55,45,67};
	//	int[] post = {20,10,45,67,55,33};
		int[] in = {1,2,3};
		int[] post = {1,3,2};
		BinaryTree bt = new BinaryTree(post, in);
		
		bt.display();
		// System.out.println(bt.size());
		// System.out.println(bt.ht());
		// System.out.println(bt.find(30));
		// System.out.println(bt.max());
		//
		// System.out.println(bt.diameter());
		// System.out.println(bt.diameter2());
		
		// System.out.println(bt.isBalanced());
		
		// bt.preorder();
		 bt.preorderI();
		// bt.isBST();
		//bt.deletenode(20); 
		//bt.deleteLeaves();
		//bt.display();
	}

}
