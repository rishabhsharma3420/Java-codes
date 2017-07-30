package assignment6;

public class Practice {

	public static void main(String[] args) {
		// print(6);
		// patt2(1, 1, 5);
		// System.out.println(print(6, 0,0));
		int[] arr = { 1,4,2,3,5,0};
//		System.out.println(pall(arr, 0, arr.length-1));
		 int[] arr1=new int[arr.length];
		// System.out.println(arrcheck(arr, 1));
		// System.out.println(lindex(arr, arr.length - 1, 30));
		// display(allindex(arr, 0, 30, arr1, 0),0);
		display(inv(arr, 0, arr1),0);
	}

	public static void print1(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}

		print1(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

	public static void patt1(int col, int row, int endr) {
		if (row > endr) {
			return;
		}
		if (col > row) {
			System.out.println("");
			patt1(1, row + 1, endr);
			return;
		}
		System.out.print("*");
		patt1(col + 1, row, endr);
	}

	public static void patt2(int row, int col, int n) {
		if (row > n) {
			return;
		}
		if (col > row) {
			patt2(row + 1, 1, n);
			System.out.println("");
			return;
		}
		patt2(row, col + 1, n);
		System.out.print("*");
	}

	public static boolean arrcheck(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return false;
		}
		arrcheck(arr, vidx + 1);
		if (arr[vidx] < arr[vidx - 1]) {
			return false;
		}
		return true;
	}

	public static boolean find(int[] arr, int vidx, int find) {

		if (vidx == arr.length) {

			return false;
		}
		if (find == arr[vidx]) {
			return true;
		}
		// boolean a = find(arr, vidx + 1, find);
		// return a;
		return find(arr, vidx + 1, find);
	}

	public static int findex(int[] arr, int vidx, int find) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == find) {
			return vidx;
		}
		int ans = findex(arr, vidx + 1, find);
		return ans;
	}

	public static int lindex(int[] arr, int vidx, int find) {
		if (vidx < 0) {
			return -1;
		}
		if (arr[vidx] == find) {
			return vidx;
		}
		int ans = lindex(arr, vidx - 1, find);
		return ans;
	}

	public static int[] allindex(int[] arr, int vidx, int find, int[] arr1, int vidx1) {
		if (vidx == arr.length) {
			return arr1;
		}
		if (arr[vidx] == find) {
			arr1[vidx1] = vidx;
			vidx1++;
		}
		int[] ans = allindex(arr, vidx + 1, find, arr1, vidx1);
		return ans;
	}

	public static void display(int[] arr, int vidx) {
		if (vidx == arr.length) {
			return;
		}
//		if (arr[vidx] != 0)
			System.out.print(arr[vidx] + "\t");
		display(arr, vidx + 1);
	}

	public static boolean pall(int[] arr, int left, int right) {
		if (left == arr.length / 2) {
			return true;
		}
		if (arr[left] == arr[right]) {
			return pall(arr, left + 1, right - 1);
		} else {
			return false;
		}
	}

	public static int[] reverse(int[] arr,int left,int right){
		if(left==arr.length/2){
			return arr;
		}
		swap(arr,left, right);
		reverse(arr, left+1, right-1);
		
		return arr;
	}
	
	public static int[] swap(int[] arr,int j,int k){
		int temp=arr[j];
		arr[j]=arr[k];
		arr[k]=temp;
		return arr;
	}

	public static int[] inv(int[] arr,int left,int[] ar1){
		if(left==arr.length){
			return ar1;
		}
		ar1[arr[left]]=left;
		return inv(arr, left+1, ar1);
		
	}
	
}
