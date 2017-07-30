package July4;

public class one {

	public static void main(String[] args) {
		int[] arr = { 55, 11, 44, 33, 22 };
//		// display(bubblesort(arr));
//		display(selsort(arr));
		display(ins(arr));
	}

	public static int[] bubblesort(int[] arr) {
		int counter = 0;
		while (counter < arr.length - 1) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			counter++;
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			if(arr[val]!=0)
			System.out.print(val + "\t");
		}
		System.out.println(".");
	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] selsort(int[] arr) {
		int counter = 0;
		while (counter < arr.length - 1) {
			for (int i = counter; i < arr.length; i++) {
				if (arr[i] < arr[counter]) {
					swap(arr, i, counter);
				}
			}
			counter++;
		}
		return arr;
	}
	public static int[] selectsort(int[] arr){
		int counter=0;
		while(counter<arr.length-1){
			for(int i=counter;i>0;i++){
				if(arr[i]>arr[counter]){
					swap(arr,i,counter);
				}
			}
			counter++;
		}
		return arr;
	}
	public static int[] ins(int[] arr){
		int counter=1;
		while(counter<arr.length){
			for(int i=counter;i>0;i--){
				if(arr[i-1]>arr[i]){
					swap(arr,i,i-1);
				}else{
					break;
				}
			}
			counter++;
		}
		return arr;
	}
}
