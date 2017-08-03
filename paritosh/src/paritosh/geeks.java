package paritosh;

import java.util.Scanner;

public class geeks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
		int n = scn.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();

		// rotate logic shuru
		d = d % n;
		if (d < 0)
			d += n;
		for (int i = 0; i <= d / 2; i++) {
			int temp = a[i];
			a[i] = a[d - 1 - i];
			a[d - i - 1] = temp;
		}
		int left = d, right = n - 1;
		while (left <= right) {
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
		for (int i = 0; i <= n / 2; i++) {
			int temp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = temp;
		}
		// array printing
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		scn.close();
	}

}
