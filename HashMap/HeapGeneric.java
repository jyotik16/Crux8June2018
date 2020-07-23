package HashMap;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (islarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private int islarger(T t, T t2) {
		return t.compareTo(t2);
	}

	private void swap(int pi, int ci) {
		T ith = data.get(pi);
		T jth = data.get(ci);
		data.set(pi, jth);
		data.set(ci, ith);

	}

	public T remove() {
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < data.size() && islarger(data.get(lci), data.get(mini)) > 0) {
			mini = lci;

		}
		if (rci < data.size() && islarger(data.get(rci), data.get(mini)) > 0) {
			mini = rci;

		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);

		}
	}

	public void display() {
		System.out.println(data);
	}

	public boolean isEmpty() {

		return this.size() == 0;
	}

	private int size() {

		return data.size();
	}

}
