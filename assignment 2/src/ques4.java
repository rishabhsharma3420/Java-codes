import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n = scn.nextInt();
		int i;
		if (n == 2) {
			System.out.println("2");
		} else {
			System.out.print("2");
			for (int a = 3; a <= n; a++) {
				for (i = 2; i <= a; i++) {
					int j = a % i;
					if (j != 0) {
						System.out.print(" "+a);
						break;
					}
				}
			}
		}
	}
}