package july18;

import java.util.Arrays;

public class One {
	public static void main(String[] args) {
		// long start = System.currentTimeMillis();
		// sieve(100000);
		// long end = System.currentTimeMillis();
		// System.out.println(end - start);
		System.out.println(palcount("abbaba"));
	}

	public static void sieve(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		for (int i = 2; i * i <= n; i++) {
			if (arr[i] == false) {
				continue;
			}
			for (int j = 2; j * i < n; j++) {
				arr[j * i] = false;
			}
		}
		for (int i = 2; i < n; i++) {
			if (arr[i]) {
				// System.out.println(i);
			}
		}
	}

	public static int palcount(String str) {
		int index = 0;
		int count = 0;

		for (index = 0; index < str.length(); index++) {
			int orbit = 0;
			while (true) {
				if (index + orbit == str.length()) {
					break;
				}
				if (index - orbit < 0) {
					break;
				}
				if (str.charAt(index + orbit) == str.charAt(index - orbit)) {
					count++;
				} else {
					break;
				}
				orbit++;

			}
		}
		double axis = 0.5;

		for (int i = 0; i < str.length() - 1; i++) {
			double orb = 0.5;

			while (true) {
				if (axis + orb >= str.length()) {
					break;
				}
				if (axis - orb < 0) {
					break;
				}
				if (str.charAt((int) (axis + orb)) == str.charAt((int) (axis - orb))) {
					count++;
				} else {
					break;
				}
				orb += 1.0;
			}
			axis += 1.0;
		}

		return count;
	}

}
