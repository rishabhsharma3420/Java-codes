package june1;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("");
		int n = scn.nextInt();
		int i = 1;
		while (i <= n) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("hi hello");
			} else if (i % 3 == 0) {
				System.out.println("hi");
			} else if (i % 5 == 0) {
				System.out.println("HELLO");
			} else {
				System.out.println(i);
			}
			i += 1;
		}
	}
}