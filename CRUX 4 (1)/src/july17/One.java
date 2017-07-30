package july17;

public class One {

	public static void main(String[] args) {
		// int[] one = { 10, 3, 45, 15, 7, 18, -1, 19 };
		// int[] two = { 11, 17, 23, 28, 35, 37, 48 };
		// display(merge(one, two));
		// quicksort(one, 0, one.length - 1);
		// display(one);
		System.out.println(getpol(2, 3, 1, 0));
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
		System.out.println(".");
	}

	public static int[] merge(int[] one, int[] two) {
		int[] arr = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				arr[k] = one[i];
				i++;
				k++;
			} else {
				arr[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			arr[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			arr[k] = one[j];
			j++;
			k++;
		}
		return arr;
	}

	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = lo;
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] f = mergesort(arr, lo, mid);
		int[] s = mergesort(arr, mid + 1, hi);
		int[] ans = merge(f, s);
		return ans;

	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo, right = hi;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		if (arr[right] == pivot) {
			right--;
		}
		if (arr[left] == pivot) {
			left++;
		}
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
	}

	public static int getpol(int x, int n, int j, int ans) {
		for(int i=1;i<n+1;i++){
			
		}
	}
}
