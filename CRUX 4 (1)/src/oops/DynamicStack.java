package oops;

public class DynamicStack extends Stack {

	public DynamicStack(int cap) {
		super(cap);
	}
	@Override
	public void push(int value) {
		if (tos == data.length - 1) {
			int[] oa = data;
			data = new int[data.length * 2];
			for (int i = 0; i < oa.length; i++) {
				data[i] = oa[i];
			}
		}
		this.tos++;
		this.data[tos] = value;
	}
}
