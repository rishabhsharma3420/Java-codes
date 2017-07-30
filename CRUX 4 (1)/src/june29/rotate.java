package june29;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("");
		int n = scn.nextInt();
		System.out.println("");
		int rot = scn.nextInt();
		int m = n;
		int nod = 0;
		while (m != 0) {
			m /= 10;
			nod += 1;
		}
		rot %= nod;
		if (rot < 0) {
			rot += nod;
		}
		int mul = (int) Math.pow(10, rot);
		int i = n / mul;
		int j = n % mul;
		int div = (int) Math.pow(10, nod - rot);
		j *= div;
		i += j;
		System.out.println(i);
	}
}