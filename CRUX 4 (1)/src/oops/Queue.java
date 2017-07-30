package oops;

public class Queue {
	int front = 0, size = 0;
	int[] data;

	Queue(int cap) {
		this.data = new int[cap];
	}

	public void add(int val) throws Exception {
		if (size == data.length) {
			throw new Exception("ERROR");
		}
		data[(front + size) % data.length] = val;
		size++;
	}

	public int delete() throws Exception {
		if (size == 0) {
			throw new Exception("ERROR");
		}
		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;
		return temp;
	}

	public int front() throws Exception {
		if (size == 0) {
			throw new Exception("ERROR");
		}
		return data[front];
	}

	public int size() {
		return size;
	}

	public boolean empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(data[(front + i) % data.length] + "\t");
		}
		System.out.println("\n------------");
	}
}
