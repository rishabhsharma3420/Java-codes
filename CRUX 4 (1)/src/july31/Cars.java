package july31;

import java.util.Comparator;

public class Cars implements Comparable<Cars> {
	private int speed;
	private int price;
	private String name;
	public static final Carspeedcomparator csc = new Carspeedcomparator();
	public static final Carspeedrevcomparator csrc = new Carspeedrevcomparator();
	public static final Carpricecomparator cpc = new Carpricecomparator();
	public static final Carpricerevcomparator cprc = new Carpricerevcomparator();
	public static final Carnamecomparator cnc = new Carnamecomparator();
	public static final Carnamerevcomparator cnrc = new Carnamerevcomparator();

	public Cars(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String toString() {
		return "{" + this.name + " - " + this.speed + " - " + this.price + "}";
	}

	@Override
	public int compareTo(Cars o) {
		return o.price - this.price;
		// return this.speed - o.speed;
		// return this.name.compareTo(o.name);
	}

	public static class Carspeedcomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o1.speed - o2.speed;
		}
	}

	public static class Carspeedrevcomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o2.speed - o1.speed;
		}
	}

	public static class Carpricerevcomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o1.price - o2.price;
		}
	}

	public static class Carpricecomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o1.price - o2.price;
		}
	}

	public static class Carnamecomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	public static class Carnamerevcomparator implements Comparator<Cars> {
		@Override
		public int compare(Cars o1, Cars o2) {
			return o2.name.compareTo(o1.name);
		}
	}
}