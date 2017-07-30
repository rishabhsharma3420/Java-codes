package july10;

public class One {

	public static void main(String[] args) {
		pdi(6);
//		System.out.println(pow(2,3));
//		System.out.println(log(2,32));
//		log(2,32);
//		System.out.println(pow1(5,4));
	}

	public static void pdi(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		pdi(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}
	
	public static int pow(int x,int n){
		if(n==0){
			return 1;
		}
		int ans=x*pow(x,n-1);
		return ans;
	}
	public static int fibo(int n){
		int i=0;
		int j=1;
//		int k=i+j;
//		fibo()
		return i;
	}
	public static int log(int x,int n){
		if(n==0){
			return 1;
		}
		int count=0;
		int ans=x*log(x,n/2);
		count++;
//		if(n%2==0){
//			
//			return ans;
//
//		}else{
//			return ans*x;
//		}
	System.out.println(count);
	return 1;
	}
	public static int pow1(int x,int n){
		if(n==0){
			return 1;
		}
		if(n%2==0){
			int ans=pow(x,n/2);
			return ans*ans;
		}else{
			int ans=x*pow(x,n/2);
			return ans*ans*x;
		}
	}
}
