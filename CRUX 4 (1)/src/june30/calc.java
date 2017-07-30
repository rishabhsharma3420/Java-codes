package june30;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class calc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(" ");
		char ch = scn.next().charAt(0);
		while (ch != 'x' && ch != 'X') {

			System.out.println("no1");
			float i = scn.nextInt();
			System.out.println("no2");
			float j = scn.nextInt();
			float ans = 0;

			if (ch == '+') {
				ans = i + j;
				System.out.println(ans);
			} else if (ch == '-') {
				ans = i - j;
				System.out.println(ans);
			} else if (ch == '*') {
				ans = i * j;
				System.out.println(ans);
			} else if (ch == '/') {
				float ft = i / j;
				System.out.println(ft);
			} else if (ch == '%') {
				float ft = i % j;
				System.out.println(ft);
			}
			System.out.println("give another input");
			char ch1 = scn.next().charAt(0);
			ch = ch1;
		}
		System.out.println("END");
	}
}