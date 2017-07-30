package july10;

public class Arraysrec {
	public static int arr2[]=new int[10000];

	public static void main(String[] args) {
//		int[] arr = { 1,4, 3, 6,9, 5, 7, 8, 2 };
//		 System.out.println(getmax(arr,0,0));
		// System.out.println(find(arr,0,99));
		// System.out.println(findlast(arr,arr.length-1,8));
		// int n=maxval(arr,8,0);
		// display1(arr);
		// display1(ques(arr, 0, 8, 0));
//		display1(selsort(arr, 0,1));
//		int n=1;
//		for(int i=0;i<arr.length;i++){
//			n*=i;
//		}
//		System.out.println(fib(5));
//		subset(arr,0,1,n);
		design(1,1,5);
	}

	public static void display(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		System.out.println(arr[index]);
		display(arr, index++);
	}

	public static void display1(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
		System.out.println(".");
	}

	public static int getmax(int[] arr, int index) {

		if (index == arr.length - 1) {
			return arr[index];
		}
		int misa = getmax(arr, index + 1);
		if (misa > arr[index]) {
			return misa;
		} else {
			return arr[index];
		}
	}

	public static boolean find(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return false;
		}
		if (arr[vidx] == data) {
			return true;
		}
		return find(arr, vidx + 1, data);
	}

	public static int findfirst(int[] arr, int vidx, int data) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == data) {
			return vidx;
		}
		return findfirst(arr, vidx + 1, data);
	}

	public static int findlast(int[] arr, int vidx, int data) {
		if (vidx == 0) {
			return -1;
		}
		if (arr[vidx] == data) {
			return vidx;
		}
		return findlast(arr, vidx - 1, data);
	}

	public static int[] ques(int[] arr, int vidx, int data, int count) {

		if (vidx == arr.length) {
			return new int[count];
		}
		if (arr[vidx] == data) {
			count++;
		}
		int[] a = ques(arr, vidx + 1, data, count);
		if (arr[vidx] == data) {
			a[count - 1] = vidx;

		}
		return a;
	}

	public static int maxval(int[] arr, int val, int i) {
		if (i == arr.length) {
			return 0;
		}
		int a = maxval(arr, val, i + 1);
		if (arr[i] == val) {
			a++;
		}
		return a;
	}

	public static int[] bubsort(int[] arr, int vidx, int i) {
		if (vidx == arr.length) {
			return arr;
		}
		if (i == arr.length-1 ) {
			return arr;
		}

		if (arr[i + 1] < arr[i]) {
			swap(arr, i + 1, i);
		}

		bubsort(arr, vidx, i + 1);
		i = vidx;
		bubsort(arr, vidx + 1, i);

		return arr;
	}

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void subset(int[] arr,int val,int i,int n){
		if(val==arr.length){
			
		}
		if(i==arr.length){
			
		}
		subset(arr,val,i+1,n);
	}
	
	public static int fib(int n){
		if(n==0||n==1)
			return n;
		if(arr2[n]!=0)
			return arr2[n];
		return arr2[n]=fib(n-1)+fib(n-2);
	}

	public static void design(int r,int c,int n){
		if(r>n){
			r=n;
			c=n;
			return;
		}
		if(c>n-r){
			System.out.println();
			design(r+1,1,n);
		}
		System.out.print("*");
		design(r,c+1,n);
		
		System.out.print("*");
		if(r<0){
			return;
		}
		if(c<0){
			System.out.println();
			design(r-1,1,n);
			return ;
		}
	}
	
	public static int[] selsort(int[] arr, int vidx, int i) {
		if (vidx == arr.length) {
			return arr;
		}
		if (i == arr.length-1 ) {
			return arr;
		}

		if (arr[vidx] < arr[i]) {
			swap(arr, vidx, i);
		}

		selsort(arr, vidx, i+1);
		i=vidx;;
		selsort(arr, vidx+1 , i);

		return arr;
	}
}
