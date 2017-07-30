package june1;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 8 };
		int data = 4;
		int add[] = { 1, 2, 3, 4 };
		display(arr);
		int maxvalue = getMax(arr);
		System.out.println(maxvalue);
		System.out.println(linearSearch(arr, 2));
		System.out.println(linearSearch(arr, 770));

		reverse(arr);
		// display(inverse(arr));
		display(arr);
		display(rotate(arr, data));
		Arrays.sort(arr);
		System.out.println(binary(arr, data));
		display(add(arr, add));
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
		System.out.println(".");
	}

	public static int getMax(int[] arr) {
		int j = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (j < arr[i]) {
				j = arr[i];
			}
		}
		return j;
	}

	public static int linearSearch(int[] arr, int no) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == no) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void reverse(int[] arr) {
		int right = arr.length - 1;
		for (int left = 0; left < arr.length / 2; left++) {
			int temp = arr[left];
			arr[left] = arr[right - left];
			arr[right - left] = temp;
		}
		display(arr);
	}
	//
	// public static int[] inverse(int[] arr) {
	// int[] inv;
	// inv = new int[arr.length];
	// for (int i = 0; i < arr.length; i++) {
	// inv[arr[i]] = i;
	// }
	// return inv;
	// }

	public static int[] rotate(int[] arr, int val) {
		int a[] = new int[arr.length];
		val %= arr.length;
		if (val < 0) {
			val += arr.length;
		}
		int j = 0;
		for (int i = val; i < arr.length; i++) {
			a[j] = arr[i];
			j++;
		}
		for (int i = 0; i < val; i++) {
			a[j] = arr[i];
			j++;
		}
		return a;
	}

	public static int binary(int[] a, int i) {
		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (mid == i) {
				return mid;
			} else if (mid < i) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		return -1;
	}

	public static int[] add(int[] a, int[] b) {
		int[] x;
		int m, n;
		if (a.length > b.length) {
			m = a.length;
			n = b.length;
		} else {
			m = b.length;
			n = a.length;
		}
		int d = 0;
		x = new int[m];
		for (int i = 0; i < x.length; i++) {
			int c = 0;
			if (i < n) {
				c = a[i] + b[i] + d;
				if (c <= 9) {
					x[i] = c;
					d = 0;
				} else {
					x[i] = c % 10;
					d = 1;
				}
			} else if (n <= i && i < m) {
				c = a[i] + d;
				d = 0;
			} else {
				c = d;
			}
		}
		for (int i = n; i < a.length; i++) {
			x[i] = a[i] + d;
		}
		return x;
	}
}