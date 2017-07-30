package july16;

public class Lexico {

	public static void main(String[] args) {
		lexico(1, 1000);
	}

	public static void lexico(int curr, int end) {
		if (curr > end) {
			return;
		}
		System.out.println(curr);

		for (int i = 0; i < 10; i++) {
			if ((curr * 10) + i <= end) {
				lexico((curr * 10) + i, end);
			}
			
		}
		if (curr <9)
		lexico(curr + 1, end);
	}
}