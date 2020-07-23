package BinarySearchTree;

public class BSTClient {
	public static void main(String[] args) throws Exception {
		
		int[] in = {1,2,3,4,5,6,7,8,9};
		binarysearchtree bb = new binarysearchtree(in);
//		bb.display();
//		System.out.println(bb.find(30));
//		System.out.println(bb.ht());
//		System.out.println(bb.max());
//		System.out.println(bb.size());
//		bb.printDec(); //9 8 7 6 5 4 3 2 1
//		bb.printInrange(5,8); //5 6 7
		bb.ReplacewithSumoflarger();
//		bb.Addnode(23);
//		bb.display();
//		bb.deletenode(45);
//		bb.printk(3, 1);
//		bb.deleteinrange(2, 4);
//		bb.display();
//		bb.PrinttillK(5, 1);
		
		bb.addDuplicate(in);
		
	}

	
}
/*
2 => 5 <= 7
1 => 2 <= 3
END => 1 <= END
END => 3 <= 4
END => 4 <= END
6 => 7 <= 8
END => 6 <= END
END => 8 <= 9
END => 9 <= END
--------------------
replace with sum 
--------------------
5 => 6 <= 7
END => 5 <= END
END => 7 <= 8
END => 8 <= END
--------------------
--------------------
21 => 15 <= 8
END => 21 <= END
END => 8 <= 0
END => 0 <= END
--------------------
ADD node
--------------------
5 => 6 <= 7
END => 5 <= END
END => 7 <= 8
END => 8 <= 13
END => 13 <= END
--------------------
Delete node 6
--------------------
END => 5 <= 7
END => 7 <= 8
END => 8 <= END
--------------------
*/