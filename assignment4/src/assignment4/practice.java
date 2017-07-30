package assignment4;

//import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// Scanner scn = new Scanner(System.in);
		// System.out.println("NO. OF ELEMENTS?");
		// int n = scn.nextInt();
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// System.out.println("ENTER THE " + (i + 1) + " ELEMENT");
		// arr[i] = scn.nextInt();
		// }
		// System.out.println(max(arr));
		//
		// System.out.println("enter the number to search:");
		// int a = scn.nextInt();
		// System.out.println(linsearch(arr, a));
		// Arrays.sort(arr);
		// System.out.println("BINARY SEARCH");
		// int b = scn.nextInt();
		// System.out.println(binsearch(arr, b));
		// display(rev(arr));
		int[] arr1 = { 0, 1, 2, 3, 4 };
		// int [] arr2=inverse(arr1);
		// display(arr2);
		// boolean x=true;
		// for(int i=0;i<arr1.length;i++){
		// if(arr1[i]==arr2[i]){
		//
		// }else{
		// x=false;
		// break;
		// }
		// }
		// System.out.println(x);
		//// scn.close();
		// display(bubsort(arr1));
		display()
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.println("");
	}

	public static int[] bubsort(int[] arr) {
		int a = 0;
		while (a < arr.length - 1) {
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, a, i);
				}
			}
			a++;
		}
		return arr;
	}

	public static int[] swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;

	}

	public static int max(int[] arr) {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (ans < arr[i]) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static int linsearch(int[] arr, int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				return i;
			}
		}
		return -1;
	}

	public static int binsearch(int[] arr, int a) {
		int left = 0;
		int right = arr.length - 1;
		for (int i = left; i <= right; i++) {
			int mid = (left + right) / 2;
			if (arr[mid] == a) {
				return mid;
			} else if (arr[mid] < a) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int[] rev(int[] arr) {
		int a[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[i] = arr[arr.length - i - 1];
		}
		return a;
	}

	public static int[] inverse(int[] arr) {
		int a[];
		a = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			a[arr[i]] = i;
		}
		return a;
	}
}