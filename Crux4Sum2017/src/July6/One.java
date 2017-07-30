package July6;

public class One {

	public static void main(String[] args) {
		int[] arr={10,20,30};
		subset(arr);
	}
	public static void subset(int[] arr){
		int i=0;
		int pow=(int)Math.pow(2, arr.length);
		while(i<pow){
			int temp=i;
			for(int j=0;j<arr.length;j++){
				int rem=temp%2;
				if(rem==1){
					System.out.print(arr[j]+ " ");
				}
				temp/=2;
			}
			System.out.println("");
			
			i++;
		}
	}
}