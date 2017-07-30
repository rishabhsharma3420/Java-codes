package oops;

public class Client {

	public static void main(String[] args) throws Exception {

		Stack f = new DynamicStack(5);
		for (int i = 1; i <= 6; i++) {
			f.push(i);
		}
		f.display();
	}

}
