package july13;

import java.util.ArrayList;

public class Maze {

	public static void main(String[] args) {
		System.out.println(maze(0, 0, 2, 2));
	}

	public static ArrayList<String> maze(int cc, int cr, int ec, int er) {

		if (cc == ec && cr == er) {
			ArrayList<String> req = new ArrayList<>();
			req.add("");
			return req;
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int i = 1; i < ec; i++) {
			if (cc < ec) {
				ArrayList<String> path = new ArrayList<>();
				path = maze(cc + i, cr, ec, er);
				for (String path1 : path) {
					mr.add("H" + path1);
				}
			}
			if (cr < er) {
				ArrayList<String> path = new ArrayList<>();
				path = maze(cc, cr + i, ec, er);
				for (String path1 : path) {
					mr.add("V" + path1);
				}
			}
			if (cr < er && cc < ec) {
				ArrayList<String> path = new ArrayList<>();
				path = maze(cc + i, cr + i, ec, er);
				for (String path1 : path) {
					mr.add("D" + path1);
				}
			}
		}
		return mr;
	}
}
