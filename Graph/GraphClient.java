package Graph;

import java.util.HashMap;

public class GraphClient {
public static void main(String[] args) {
	

	graph gp = new graph();
	gp.addvertex("A");
	gp.addvertex("B");
	gp.addvertex("C");
	gp.addvertex("D");
	gp.addvertex("E");
	gp.addvertex("F");
	gp.addvertex("G");
	gp.addedges("A","B",2);
	gp.addedges("A","D",3);
	gp.addedges("C","B",4);
	gp.addedges("C","D",5);
//	gp.addedges("D","E",6);
	gp.addedges("E","F",7);
	gp.addedges("G","E",8);
	gp.addedges("F","G",9);
	gp.display();
//	System.out.println(gp.containsedges("C","D"));
//	gp.removevertex("A");
//	System.out.println(gp.hasPath("A","F",new HashMap<String,Boolean>()));
//	System.out.println(gp.BFS("A", "F"));
//	System.out.println(gp.DFS("A", "F"));
//	gp.BFT();
//	gp.DFT();
	System.out.println(gp.isCyclic());
	System.out.println(gp.isConnected());
	gp.isTree();
	System.out.println(gp.getCC());
	System.out.println(gp.isBpartite());
}
}