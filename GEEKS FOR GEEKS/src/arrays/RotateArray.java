package arrays;

class RotateArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		rotate(arr, arr.length, 3);
		display(arr);
	}

	public static void rotate(int arr[], int n, int d) {
		int i, j, k, temp;
		for (i = 0; i < gcd(d, n); i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n) {
					k -= n;
				}
				if (k == i) {
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + "   ");
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
