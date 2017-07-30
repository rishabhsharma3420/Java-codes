import java.util.Scanner;

public class Tesst {

	public static void main(String[] args) {
		int M = (int) Math.pow(10, 9);
		M += 7;
		Scanner scn = new Scanner(System.in);
		long[] arr = new long[1000001];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (i - 1) * arr[i - 2];
			arr[i] += arr[i - 1];
			arr[i] %= M;
		}
		int t = scn.nextInt();
		for (int q = 1; q <= t; q++) {
			int n = scn.nextInt();
			System.out.println(arr[n]);
		}
		scn.close();
	}
}