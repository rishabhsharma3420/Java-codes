package assignment8a;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// // System.out.println(subseq("abcd"));
		// System.out.println(countsubseq("abcd"));
		// subs("abcd", "");
		System.out.println(toh(4, "", "", "", 0));
	}

	public static ArrayList<String> subseq(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = subseq(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (int i = 0; i < rr.size(); i++) {
			String req = rr.get(i);
			mr.add(req);
			mr.add(req + ch);
			mr.add((int) ch + req + ch);
		}
		return mr;
	}

	public static int countsubseq(String str) {
		int pow = (int) Math.pow(2, str.length());
		return pow;
	}

	public static void subs(String str, String ans) {
		if (str.length() == 0) {
			System.out.print(" { " + ans + " } ");
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		subs(ros, ans + ch);
		subs(ros, ans);
	}

	public static int toh(int n, String a, String b, String c, int count) {
		if (n == 0) {
			return count;
		}
		
		int ans1=toh(n - 1, a, c, b, count);
		
		int ans = toh(n - 1, c, b, a, count);
		
		return (ans+ans1+1);
	}
}
