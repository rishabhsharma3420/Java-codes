package july11;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		String sb = new String("abcd");
		System.out.println(per(sb));
		// ArrayList<String> ab=maze(0,0,2,2);
		// System.out.println(ab.size());
		// System.out.println(ludo(0, 10));
	}

	public static ArrayList<String> ss(String sb) {
		if (sb.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = sb.charAt(0);
		String newstr = sb.substring(1);

		ArrayList<String> recres = ss(newstr);
		ArrayList<String> finres = new ArrayList<String>();

		for (String ret : recres) {
			finres.add(ret);
			finres.add(ch + ret);
		}

		return finres;
	}

	public static ArrayList<String> per(String sb) {

		if (sb.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = sb.charAt(0);
		String newsb = sb.substring(1);

		ArrayList<String> rr = per(newsb);
		ArrayList<String> mr = new ArrayList<>();

		for (String temp : rr) {
			for (int i = 0; i <= temp.length(); i++) {
				StringBuilder str = new StringBuilder(temp);
				str.insert(i, ch);
				mr.add(str.toString());
			}
		}
		return mr;
	}

	public static ArrayList<String> maze(int cc, int cr, int ec, int er) {
		if (cc == ec && cr == er) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		if (cc < ec) {
			ArrayList<String> col = maze(cc + 1, cr, ec, er);
			for (String path1 : col) {
				mr.add("H" + path1);
			}
		}
		if (cr < er) {
			ArrayList<String> row = maze(cc, cr + 1, ec, er);
			for (String path1 : row) {
				mr.add("V" + path1);
			}
		}
		if (cc < ec && cr < er) {
			ArrayList<String> diag = maze(cc + 1, cr + 1, ec, er);
			for (String path1 : diag) {
				mr.add("D" + path1);
			}
		}
		return mr;
	}

	public static ArrayList<String> ludo(int i, int end) {
		if (i == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();
		int dice = 1;
		while (dice <= 6 && i + dice <= end) {
			ArrayList<String> rr = ludo(dice + i, end);
			for (String path : rr) {
				mr.add(dice + path);
			}
			dice++;
		}
		return mr;
	}

}