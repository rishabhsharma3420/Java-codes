package July4;

public class Permutations {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		per(arr);
	}

	public static void per(int[] arr) {
		int[] a = new int[arr.length];
		int val = 1;
		for (int i = arr.length; i > 0; i--) {
			val *= i;
		}
		int counter = 0;
		for (int j = 0; j < val; j++) {
			for (int k = 0; k < arr.length; k++) {
					a[k] = arr[k];
					if(counter!=0){
						int y=1;
						int x=2;
					}
					counter++;
			}
			display(a);

		}
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.println("");
	}

	public static int[] swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}

	public static int[] rot(int[] arr) {
		int[] a = new int[arr.length];
		int val = 1;
		int counter = 0;
		for (int i = val; i < arr.length; i++) {
			a[counter] = arr[i];
			counter++;
		}
		for (int i = 0; i < val; i++) {
			a[counter] = arr[i];
			counter++;
		}
		return a;
	}

}