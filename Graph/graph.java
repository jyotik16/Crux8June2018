package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class graph {
	class vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();

	}

	private HashMap<String, vertex> vertices = new HashMap<>();

	public int numvertex(String vname) {
		return vertices.size();
	}

	public boolean containvertex(String vname) {
		return vertices.containsKey(vname);
	}

	public void addvertex(String vname) {
		vertex vtx = new vertex();
		vertices.put(vname, vtx);
	}

	public int numedge() {
		int ans = 0;
		for (String key : vertices.keySet()) {
			vertex vtx = vertices.get(key);
			ans += vtx.nbrs.size();
		}
		return ans / 2;
	}

	public boolean containsedges(String vname1, String vname2) {
		vertex vtx1 = vertices.get(vname1);
		vertex vtx2 = vertices.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addedges(String vname1, String vname2, int cost) {
		vertex vtx1 = vertices.get(vname1);
		vertex vtx2 = vertices.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);

	}

	public void removevertex(String vname) {
		
		if(!vertices.containsKey(vname)) {
			return;
		}
		vertex vtx = vertices.get(vname);
		for(String nbr:vtx.nbrs.keySet()) {
			vertices.get(nbr).nbrs.remove(vname);
		}
		vertices.remove(vname);
		
	}

	public void display() {
		for (String key : vertices.keySet()) {

			vertex vtx = vertices.get(key);
			System.out.println(key + " -> " + vtx.nbrs);

		}
	}
	public boolean hasPath(String src,String dest,HashMap<String,Boolean> processed) {
		if(!vertices.containsKey(src) || !vertices.containsKey(dest))
			return false;
		processed.put(src,true);
		if(containsedges(src, dest)) {
			return true;
		}
		vertex vtx = vertices.get(src);
		for(String nbr:vtx.nbrs.keySet()) {
			
			if(!processed.containsKey(nbr) && hasPath(nbr,dest,processed)) {
				return true;
			}
		}
		return false;
		
	}
	private class pair{
		String vname;
		String psf;
		String color;
	}
	public boolean BFS(String src,String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();

			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = src;
			sp.psf = src;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				
				continue;
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			if (containsedges(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			// add nbrs in queue
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
				}
			}

		}

		return false;

	}
	public boolean DFS(String src,String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();

			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = src;
			sp.psf = src;
			stack.addFirst(sp);
			// while queue is not Empty keep on removing pairs
			while (!stack.isEmpty()) {
				pair rp = new pair();
				rp = stack.removeFirst();

			if (processed.containsKey(rp.vname)) {
				
				continue;
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			if (containsedges(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}
			// add nbrs in queue
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					stack.addFirst(np);
				}
			}

		}

		return false;

	}

	public void BFT() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				
				continue;
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			System.out.println(key+" via "+rp.psf);
			// add nbrs in queue
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
				}
			}

		}
		}
			
	}

	public void DFT() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addFirst(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				
				continue;
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			System.out.println(key+" via "+rp.psf);
			// add nbrs in queue
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addFirst(np);
				}
			}

		}
	}
			
	}
	public boolean isCyclic() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		boolean flag=false;
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				flag=true;
				
				continue;
				
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			//System.out.println(key+" via "+rp.psf);
			// add nbrs in queue
			
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
					
				}
				
			}

		}
			
	}
		return flag;
			
	}
	public boolean isConnected() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		int count=0;
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			count++;
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
				
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			//System.out.println(key+" via "+rp.psf);
			// add nbrs in queue
			
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
					
				}
				
			}
			}
			
				
	}
		if(count>1) {
			return false;
		}else {
			return true;
		}
				
	}

	public void isTree() {
		
		if(isCyclic()==false && isConnected()==true) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
	}
	public ArrayList<ArrayList<String>> getCC(){
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>> ();
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			ArrayList<String> subans = new ArrayList<>();
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				continue;
				
			}
			// processed
			processed.put(rp.vname, true);

			// direct edge
			subans.add(rp.vname);
			
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
					
				}
				
			}
			}
		ans.add(subans);
		}
		return ans;
	}
		
	public boolean isBpartite() {
		HashMap<String, String> processed = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		
		for(String key:vertices.keySet()) {
			if(processed.containsKey(key)) {
				continue;
			}
			// make a new pair and put in queue
			pair sp = new pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);
			// while queue is not Empty keep on removing pairs
			while (!queue.isEmpty()) {
				pair rp = queue.removeFirst();

			if (processed.containsKey(rp.vname)) {
				
				String oc = processed.get(rp.color);
				String nc =rp.color;
				if(!oc.equals(nc)) {
					return false;
				}			
				continue;
			}
			// processed
			processed.put(rp.vname,rp.color);
			// direct edge
			System.out.println(key+" via "+rp.psf);
			// add nbrs in queue
			vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
			// eg.C if already have in queue so don't add in queue.
				if (!processed.containsKey(nbr)) {
					pair np = new pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					String nc = (rp.color=="r"?"g":"r");
					np.color=nc;
					queue.addLast(np);
				}
			}

		}
		}
		return true;
	}

}