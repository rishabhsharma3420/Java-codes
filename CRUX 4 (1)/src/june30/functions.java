package june30;

public class functions {

	public static void main(String[] args) {
		int x=5;
		int n=2;
		int pow=Power(x,n);
		int log=Log(pow,x);
		System.out.println(pow);
		System.out.println(log);
		
	}
	
	public static int Power(int x,int y){
		for(int i=2;i<=y;i++){
			x*=x;
		}
		return x;
	}
	
	public static int Log(int x,int y){
		int ans;
		int i;
		for(i=1;true;i++){
			ans = Power(y,i);
			if(ans == x){
				return i;
			}
		}
	}
}