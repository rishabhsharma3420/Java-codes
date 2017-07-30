package june1;

import java.util.Scanner;

public class ques19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("numbers?");
		int n = scn.nextInt();
		System.out.println("first num");
		int prev = scn.nextInt();
		int curr = 0;
		boolean direction = true; // true means south
		int counter = 2;
		while (counter <= n) {
			System.out.println("ENTER THE NUMBER");
			curr = scn.nextInt();
			if (direction) {
				if (curr < prev) {
				} else {
					direction = false; // DIRECTION FALSE MEANS NORTH
				}
			} else {
				if (curr > prev) {
				} else {
					System.out.println("False");
					return;
				}
			}
			prev = curr;
			counter++;
		}
	}
}