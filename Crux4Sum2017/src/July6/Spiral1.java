package July6;

public class Spiral1 {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		spiral(arr);
	}

	public static void spiral(int[][] arr) {
		int rmin = 0, rmax = arr.length - 1, cmin = 0, cmax = arr[0].length - 1;
		int count = 1, tne = arr.length * arr[0].length;
		while (count < tne) {

			// east
			for (int row = rmin; count < tne && row < rmax; row++) {
				System.out.print(arr[row][cmin] + " ");
			}
			cmin++;
			// south
			for (int col = cmax; count < tne && col > cmin; col--) {
				System.out.print(arr[rmax][col] + " ");
			}
			rmax--;
			// west
			for (int row = rmax; count < tne && row > rmin; row--) {
				System.out.print(arr[row][cmin] + " ");
			}
			cmax--;
			// north
			for (int col = cmin; count < tne && col > cmax; col++) {
				System.out.print(arr[rmin][col] + " ");
			}
			rmin++;

		}
	}
}