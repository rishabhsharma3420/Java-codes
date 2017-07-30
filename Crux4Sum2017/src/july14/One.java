package july14;

public class One {

	public static void main(String[] args) {
		String str = "";
		// int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		// int[] arr1 = new int[1000];
		// printboardpaths(0,10,str);
		// printtargetss(arr, 0, 70, arr1, 0);
		jumps(0, 0, 2, 2, str);
	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String str = ques.substring(1);

		print(str, ans);// no
		print(str, ans + ch);// yes
	}

	public static void printkpc(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char key = ques.charAt(0);
		String get = getcode(key);
		String qnew = ques.substring(1);

		for (int i = 0; i < get.length(); i++) {
			char path = get.charAt(i);
			printkpc(qnew, ans + path);
		}
	}

	public static String getcode(char key) {
		if (key == '1') {
			return "abc";
		} else if (key == '2') {
			return "def";
		} else if (key == '3') {
			return "ghi";
		} else if (key == '4') {
			return "jkl";
		} else if (key == '5') {
			return "mno";
		} else if (key == '6') {
			return "pqrs";
		} else if (key == '7') {
			return "tuv";
		} else if (key == '8') {
			return "wx";
		} else if (key == '9') {
			return "yz";
		} else if (key == '0') {
			return ".,";
		} else {
			return "";
		}
	}

	public static void printboardpaths(int curr, int end, String path) {
		if (curr == end) {
			System.out.println(path);
			return;
		}

		int dice = 1;
		while (dice <= 6 && curr + dice <= end) {

			printboardpaths(curr + dice, end, path + dice);
			dice++;
		}

	}

	public static void printarrss(int[] arr, int vidx, int target, String str) {
		if (vidx == arr.length) {
			System.out.println(str);
			return;
		}
		int ch = arr[vidx];
		printarrss(arr, vidx + 1, target, str + ch);// yes
		printarrss(arr, vidx + 1, target, str);// no
	}

	public static void printtargetss(int[] arr, int vidx, int target, int[] arr1, int i) {
		if (vidx == arr.length) {
			if (add(arr1, i) == target) {
				display(arr1, i);
			}
			return;
		}

		int ch = arr[vidx];
		arr1[i] = ch;
		printtargetss(arr, vidx + 1, target, arr1, i + 1);// yes
		printtargetss(arr, vidx + 1, target, arr1, i);// no

	}

	public static int add(int[] arr, int k) {
		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans += arr[i];
		}
		return ans;
	}

	public static void display(int[] arr, int k) {
		for (int i = 0; i < k; i++) {

			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public static void jumps(int cc, int cr, int ec, int er, String path) {
		if (cc == ec && cr == er) {
			System.out.println(path);
			return;
		}
		for (int i = 1; i <= ec; i++) {
			if (cc < ec) {
				String str = path + i + "H ";
				jumps(cc + i, cr, ec, er, str);
			}
		}
		for (int i = 1; i <= er; i++) {
			if (cr < er) {
				String str = path + i + "V ";
				jumps(cc, cr + i, ec, er, str);
			}

			if (cc < ec && cr < er) {
				String str = path + i + "D ";
				jumps(cc + i, cr + i, ec, er, str);
			}
		}
	}

	public static void queen(boolean[][] arr, int qpsf, String config) {

	}
}
