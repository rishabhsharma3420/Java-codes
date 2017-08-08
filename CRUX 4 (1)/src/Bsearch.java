
public class Bsearch {

	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		int data=550;
		System.out.println(bsearch(arr,0,arr.length-1,data,false));
	}
	
	public static boolean bsearch(int[] arr,int left,int right,int data,boolean ans){
		if(right<left){
			return false;
		}
		int mid=(left+right)/2;
		if(arr[mid]==data){
			return true;
		}
		ans=bsearch(arr, mid+1, right, data, ans);
		if(ans==false){
			ans=bsearch(arr, left, mid, data, ans);
		}
		return ans;
	}

}
