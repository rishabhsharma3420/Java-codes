package assignment3;

import java.util.Scanner;

public class Ques13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("");
		int x = scn.nextInt();
		System.out.println("");
		int n = scn.nextInt();
		System.out.println(pow(x, n));
	}
	public static int pow(int a, int b) {
		int i = 2;
		int j = a;
		while (i <= b) {
			j = j * a;
			i++;
		}
		return j;
	}
}