package July4;

public class MatrixMul {

	public static void main(String[] args) {
		int[][] one = { { 10, 0, 20, 0 }, { 0, 30, 0, 40 } };
		int[][] two = { { 1, 0, 2 }, { 0, 0, 0 }, { 2, 3, 1 }, { 0, 1, 4 } };
		int[][] result = matmul(one, two);
		display(result);
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println("");
		}
	}

	public static int[][] matmul(int[][] one, int[][] two) {
		int or = one.length;
		int oc = one[0].length;
		int tr = two.length;
		int tc = two[0].length;
		if (oc != tr) {
			return null;
		} else {
			int a[][] = new int[or][tc];
			for (int row = 0; row < or; row++) {
				for (int col = 0; col < tc; col++) {
					int sum = 0;
					for (int k = 0; k < oc; k++) {
						sum += one[row][k] * two[k][col];
					}
					a[row][col] = sum;
				}
			}
			return a;
		}
	}
}
