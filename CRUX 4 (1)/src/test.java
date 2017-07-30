import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("TYPE NUMBER OF ROWS");
		n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Error");

		} else {
			int star = n / 2, space = 1, i = 1;
			while (i <= n) {
				int j = 1;
				while (j <= star) {
					System.out.print("*");
					j++;
				}

				j = 1;
				while (j <= space) {
					System.out.print(" ");
					j++;
				}
				j = 1;
				while (j <= star) {
					System.out.print("*");
					j++;
				}
				if (i <= n / 2) {
					star--;
					space += 2;
				} else {
					star++;
					space -= 2;
				}
				System.out.print("\n");
				i++;
			}
		}
	}
}