package aug5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import july31.GenericHeap;

public class RemoveEndK {

	public static void main(String[] args) {
		ArrayList<Integer> zero = new ArrayList<>(Arrays.asList(10, 15, 20, 25));
		ArrayList<Integer> one = new ArrayList<>(Arrays.asList(9, 18, 24, 27));
		ArrayList<Integer> two = new ArrayList<>(Arrays.asList(5, 7, 28, 40));
		ArrayList<Integer> three = new ArrayList<>(Arrays.asList(17, 19, 21, 28));
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>(Arrays.asList(zero, one, two, three));
		System.out.println(mergeKlists(lists));
	}

	public static ArrayList<Integer> mergeKlists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> list = new ArrayList<>();
		GenericHeap<Pair> heap = new GenericHeap<>(Pair.comparator);
		for (int i = 0; i < lists.size(); i++) {
			Pair main = new Pair();
			main.data = lists.get(i).get(0);
			main.lno = i;
			main.ino = 0;
			heap.add(main);
		}
		while (heap.size() != 0) {
			Pair top = heap.remove();
			list.add(top.data);
			top.ino++;
			if (top.ino < lists.size()) {
				top.data = lists.get(top.lno).get(top.ino);
				heap.add(top);
			}
		}
		return list;
	}

	private static class Pair {
		int data;
		int lno;
		int ino;
		public static final Paircomparator comparator = new Paircomparator();

		private static class Paircomparator implements Comparator<Pair> {
			public int compare(Pair o1, Pair o2) {
				return o2.data - o1.data;
			}
		}

	}
}
