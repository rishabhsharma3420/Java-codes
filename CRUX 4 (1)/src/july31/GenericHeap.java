package july31;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericHeap<T> {
	private ArrayList<T> data = new ArrayList<>();
	private Comparator<T> ctor;

	public GenericHeap(Comparator<T> ctor) {
		this.ctor = ctor;

	}

	public int size() {
		return data.size();
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

	public void display() {
		System.out.println(data);
	}

	public void add(T value) {

		data.add(value);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (higherP(ci, pi)) {
			swap(ci, pi);
			upheapify(pi);
		}
		return;
	}

	public T remove() {
		T a = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);
		downheapify(0);
		return a;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int max = pi;
		if (lci < data.size() && higherP(lci, max)) {
			max = lci;
		}
		if (rci < data.size() && higherP(rci, max)) {
			max = rci;
		}
		if (max != pi) {
			swap(pi, max);
			downheapify(max);
		}
	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);

		data.set(i, jth);
		data.set(j, ith);
	}

	private boolean higherP(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		if (ctor.compare(ith, jth) > 0) {
			return true;
		} else {
			return false;
		}
	}
}