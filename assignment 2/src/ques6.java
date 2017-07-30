import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("");
		int n=scn.nextInt();
		while(n%10==0){
			int b=0;
			int i=10;
			while(i<=n){
			int a=n%i;
			b=b+a;
		}
		}
	}

}
