package june1;

import java.util.Arrays;

public class Arrayops {
	public static void main(String[] args) {
		int[] arr={5,3,1,4,2,0};
		int data=3;
		int maxvalue=getMax(arr);
		System.out.println(maxvalue);
		System.out.println(linearSearch(arr,77));
		System.out.println(linearSearch(arr,770));
		reverse (arr);
		display(arr);
		display(inverse(arr));
		Arrays.sort(arr);
		System.out.println(binary(arr,data));
	}
	public static void display(int[] arr){
		for(int val:arr){
			System.out.print(val+"\t");
		}
		System.out.println(".");
	}
	public static int getMax(int[] arr){
		int ans=arr[0];
		for (int i=0;i<arr.length;i++){
			if(ans<arr[i]){
				ans=arr[i];
			}
		}
		return ans;
		}
	public static int linearSearch(int[] arr, int data){
		for (int i=1;i<arr.length;i++){
		if(arr[i] == data){
			return i;
		}
		}
		return -1;
	}
	public static void reverse(int[] arr){
		for (int i=0;i<arr.length/2;i++){
		   int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			}
		display(arr);
	}
	public static int[] inverse(int a[]){
		int[] b;
		b=new int[a.length];
		for (int i=0;i<a.length;i++){
		b[a[i]]=i;
		}
    return b;
	}
	public static int binary(int[] a,int data){
		int left=0;
		int right=a.length;
		while (true){
			int mid=(left+right)/2;
			if (a[mid]==data){
				return mid;
			}else if(a[mid]<data){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		}
}