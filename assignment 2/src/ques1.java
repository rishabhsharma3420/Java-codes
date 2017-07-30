import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		int n,i;
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER THE NO");
		n = scn.nextInt();
		for(i = 2;i<n;i++)
		{
			if ( n%i != 0)
				{System.out.println("number is prime");
				
				}
			
		}
	}

}