package Generic;

import java.util.ArrayList;

import Generic.Cars;
import HashMap.HeapGeneric;
import HashMap.Heaptree;

public class HeapGenericClient {

	public static void main(String[] args) {
		HeapGeneric<Cars> hh = new HeapGeneric<>();

		// Cars[] ar = new Cars[5];
		// ar[0]=new Cars(1000,245,"black");
		// ar[1]=new Cars(4000,25,"red");
		// ar[2]=new Cars(50,2450,"blue");
		// ar[3]=new Cars(6000,645,"sliver");
		// ar[4]=new Cars(500,2451,"grey");
		// hh.add(ar[0]);
		// hh.add(ar[1]);
		// hh.add(ar[2]);
		// hh.add(ar[3]);
		// hh.add(ar[4]);
		// hh.display();
		// hh.remove();
		// hh.remove();
		// hh.remove();
		// hh.display();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(15);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(500);
		list2.add(1500);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(8);
		list3.add(9);
		list3.add(10);
		lists.add(list1);
		lists.add(list2);
		lists.add(list3);

		// mergesorted(lists);
		Kthlargest(list1, 3);

	}

	private static class pair implements Comparable<pair> {
		int data;
		int listno;
		int indexno;

		@Override
		public int compareTo(pair o) {

			return o.data - this.data;
		}
	}

	public static void mergesorted(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> list = new ArrayList<>();
		HeapGeneric<pair> heap = new HeapGeneric<>();
		for (int i = 0; i < lists.size(); i++) {
			pair np = new pair();
			np.data = lists.get(i).get(0);
			np.indexno = 0;
			np.listno = i;
			heap.add(np);
		}
		while (!heap.isEmpty()) {
			pair rp = heap.remove();
			list.add(rp.data);

			rp.indexno++;
			if (rp.indexno < lists.get(rp.listno).size()) {
				rp.data = lists.get(rp.listno).get(rp.indexno);
				heap.add(rp);
			}
		}

		System.out.println(list);
	}

	public static void Kthlargest(ArrayList<Integer> list, int k) {
		Heaptree heap = new Heaptree();
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}
		for (int i = k; i < list.size(); i++) {
			int minElment = heap.get();
			if (minElment < list.get(i)) {
				heap.remove();
				heap.add(list.get(i));
			}
		}
		while (!heap.isEmpty()) {
			ans.add(heap.remove());

		}

		System.out.println(ans);
	}

}
