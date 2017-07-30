import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int n,i;
		Scanner scn = new Scanner(System.in);
		System.out.println();
		n = scn.nextInt();
		if(n==0)
			System.out.print("0");
		while(n%10==0)
			n=n/10;
		while (n> 0)
		{
			i = n % 10;
			System.out.print(i);
			n = n / 10 ;
		}
		scn.close();
	}
}