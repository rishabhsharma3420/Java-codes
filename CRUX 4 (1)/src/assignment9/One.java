package assignment9;

public class One {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 4, 5, 6, 7, 410 };
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.println(arr[a] + "\t");
		}
	}

	public static boolean dup(int[] arr){
		int i=0;
		
		return false;
	} 
}
