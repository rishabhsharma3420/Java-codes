package oops;

public class Stack {
	int[] data;
	int tos = -1;

	public Stack(int cap) {
		this.data = new int[cap];
	}

	public void push(int val) throws Exception {
		if (this.tos == data.length - 1) {
			throw new Exception("STACK OVERFLOW");
		}
		this.tos++;
		this.data[tos] = val;

	}

	public int top() throws Exception {
		if (this.tos == -1) {
			throw new Exception("MAX VALUE REACHED");
		}
		return this.data[this.tos];
	}

	public int pop() throws Exception {
		if (this.tos == -1) {
			throw new Exception("NOTHING TO POP");
		}
		int temp = this.data[this.tos];
		this.tos--;
		return temp;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isempty() {
		if (this.tos == -1) {
			return true;
		}
		return false;
	}

	public void display() {
		System.out.println(
				"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i]);
		}

		System.out.println(
				"\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
