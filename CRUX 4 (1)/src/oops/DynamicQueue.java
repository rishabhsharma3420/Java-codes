package oops;

public class DynamicQueue extends Queue {

	public DynamicQueue(int cap) {
		super(cap);
	}
	@Override//checks spelling
	public void add(int val) {
		if (size == data.length) {
			int[] oa = data;
			data = new int[data.length * 2];
			for (int i = 0; i < size; i++) {
				data[i] = oa[(front + i) % oa.length];
			}
			front = 0;
		}
		data[(front + size) % data.length] = val;
		size++;
	}
}
