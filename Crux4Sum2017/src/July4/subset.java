package July4;

public class subset {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 ,40};
		sub(arr);
	}

	public static void display(int[] arr) {
		System.out.print("{  ");
		for (int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.println("}");
	}

	public static void sub(int[] arr) {
		int pow = (int) Math.pow(2, arr.length);
		System.out.println("NULL");
		int j = 0;
		int k = 1;
		for (int i = 0; i < pow - 2; i++) {
			if (j == arr.length) {
				k++;
				j = 0;
			} else {
				j++;
			}
			int[] a = new int[k];
			for (int x = 0; x < k; x++) {
				a[x] = arr[x];
				arr = rot(arr);
			}
			display(a);
		}
		display(arr);
	}

	public static int[] rot(int[] arr) {
		int[] a = new int[arr.length];
		int val = 1;
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
}