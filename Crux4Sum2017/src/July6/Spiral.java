package July6;

public class Spiral {

	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		spiral(arr);
	}

	public static void spiral(int[][] arr) {
		int dir = 1;
		int i = 1;
		int col = 0;
		int row = 0;
		int cur = arr.length * arr[0].length;
		while (cur != 0) {

			int e1 = arr[0].length;
			int e2 = arr.length;
			if (dir == 1) {
				col++;
				System.out.print(arr[row][col] + " ");
				
				if (col == e1 - i) {
					dir = 2;
				}

			} else if (dir == 2) {
				row++;
				System.out.print(arr[row][col]+" ");
				if (row == e2 - i) {
					dir = 3;
				}

			} else if (dir == 3) {
				col--;
				System.out.print(arr[row][col]+" ");
				if (col == i - 1) {
					dir = 4;
				}
			} else {
				row--;
				System.out.print(arr[row][col]+" ");
				if (row == i - 1) {
					i++;
					dir = 1;
					
				}
				
			}

			cur--;
		}

	}
}
