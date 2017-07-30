package june30;

public class function2 {
	public static void main(String[] args) {
		int x = 15;
		int y=3;
		boolean i = IsPrime(x);
		System.out.println(i);
		CheckPrime(y,x);
	}
public static boolean IsPrime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
}

public static void CheckPrime(int a,int b){
	for(int i=a;i<=b;i++){
		boolean j = IsPrime(i);
		if (j==true){
			System.out.println(i);
		}
	}
}
}