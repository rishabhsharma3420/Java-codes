import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		int n, i = 1, lh = 1, rh;
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		rh = n;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				if (j == lh)
					System.out.print("*");
				else if (j == rh)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}
			lh++;
			rh--;
			i++;
			System.out.print("\n");
		}
	}
}