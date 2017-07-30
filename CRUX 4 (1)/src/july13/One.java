package july13;

import java.util.ArrayList;

public class One {

	public static void main(String[] args) {
		int[] a = { 0, 0, 6, 0, 0, 8, 0, 0, 0, 0, 0 };
		ArrayList<String> arr = ludo(0, 10, a);
		System.out.println(arr);
	}

	public static ArrayList<String> ludo(int i, int j, int[] lad) {
		if (i == j) {
			ArrayList<String> paths = new ArrayList<>();
			paths.add("");
			return paths;
		}

		ArrayList<String> mr = new ArrayList<>();

		if (lad[i] != 0) {
			ArrayList<String> paths = new ArrayList<>();
			paths=ludo(lad[i], j, lad);
				mr.add( "L"+paths.toString());
			
		} else {
			int a = 1;
			while (a <= 6 && i + a <= j) {
				ArrayList<String> paths = new ArrayList<>();
				paths = ludo(i + a, j, lad);

				for (String path : paths) {
					mr.add(a + path);
				}
				a++;
			}
		}
		return mr;
	}
}
