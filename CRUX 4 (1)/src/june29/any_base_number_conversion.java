package june29;

import java.util.Scanner;

public class any_base_number_conversion {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("");
		int sno = scn.nextInt();
		System.out.println("");
		int sb1 = scn.nextInt();
		System.out.println("");
		int sb2 = scn.nextInt();
		int a = decimal(sno, sb1);
		System.out.println(a + ":decimal form");
		int b = base(a, sb2);
		System.out.println(b + ":FINAL NUMBER");
	}
	public static int decimal(int sno, int sb1) {
		int dec = 0;
		int n, i = 1;
		while (sno != 0) {
			n = sno % 10;
			dec += n * i;
			sno = sno / 10;
			i = i * sb1;
		}
		return dec;
	}
	public static int base(int dec, int sb2) {
		int fno = 0;
		int o, j = 1;
		while (dec != 0) {
			o = dec % sb2;
			fno = fno + o * j;
			dec = dec / sb2;
			j = j * 10;
		}
		return fno;
	}
}