package assignment7;

public class Practice {

	public static void main(String[] args) {
		String str = "abaaba(TEST)aaaaa";
		int[] arr={10,20,30};
		StringBuilder str1 = new StringBuilder();
//		System.out.println(matheq1(str, ""));
		printTargetSS(arr, 0,30, "");
	}

	public static int strsum(String str, int sum) {
		if (str.length() == 0) {
			return sum;
		}
		int ch = str.charAt(0) - '0';
		String rec = str.substring(1);
		return strsum(rec, sum + ch);
	}

	public static int conv(String str, int i) {
		if (str.length() == 0) {
			return i;
		}
		int ch = str.charAt(0) - '0';
		int one = (int) Math.pow(10, str.length() - 1);
		i += ch * one;
		String rec = str.substring(1);
		return conv(rec, i);
	}

	public static boolean strrev(String str, String str1) {
		if (str.length() == str1.length()) {
			if (str1.length() == 0) {
				return true;
			}
			char ch = str.charAt(0);
			char ch1 = str1.charAt(str1.length() - 1);
			if (ch1 != ch) {
				return false;
			}
			String rec = str.substring(1);
			String rec1 = str1.substring(0, str1.length() - 1);
			return strrev(rec, rec1);

		} else {
			return false;
		}
	}

	public static boolean palindrome(String str, int vidx) {
		if (vidx == str.length() / 2) {
			return true;
		}
		char ch = str.charAt(vidx);
		char ch1 = str.charAt(str.length() - vidx - 1);
		if (ch != ch1) {
			return false;
		}
		return palindrome(str, vidx + 1);
	}

	public static String add(String str, int vidx, StringBuilder str1) {
		if (vidx + 1 == str.length()) {
			str1.append(str.charAt(str.length() - 1));
			return str1.toString();
		}
		char ch = str.charAt(vidx);
		if (str.charAt(vidx) == str.charAt(vidx + 1)) {
			str1.append(ch + "*");
		} else {
			str1.append(ch);
		}
		return add(str, vidx + 1, str1);
	}

	public static String coff(String str, int vidx, StringBuilder str1) {
		if (vidx + 1 == str.length()) {
			str1.append(str.charAt(str.length() - 1));
			return str1.toString();
		}
		char ch = str.charAt(vidx);
		if (str.charAt(vidx) == str.charAt(vidx + 1)) {
		} else {
			str1.append(ch);
		}
		return coff(str, vidx + 1, str1);
	}

	public static String movx(StringBuilder str, int vidx, StringBuilder str1, int count) {
		if (vidx == str.length()) {
			for (int i = 0; i < count; i++) {
				str1.append("x");
			}
			return str1.toString();
		}
		char ch = str.charAt(vidx);
		if (str.charAt(vidx) == 'x') {
			count++;
		} else {
			str1.append(ch);
		}
		return movx(str, vidx + 1, str1, count);

	}

	public static int counthi(String str, int vidx, int i) {
		if (vidx + 1 == str.length()) {
			return i;
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			i++;
		}
		return counthi(str, vidx + 1, i);
	}

	public static String removehi(StringBuilder str, int vidx) {
		if (vidx + 1 == str.length()) {
			return str.toString();
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			str.delete(vidx, vidx + 2);
		}
		return removehi(str, vidx + 1);
	}

	public static String replacehi(StringBuilder str, int vidx) {
		if (vidx + 1 == str.length()) {
			return str.toString();
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			str.replace(vidx, vidx + 2, "BYE");
		}
		return replacehi(str, vidx + 1);
	}

	public static int counthit(StringBuilder str, int vidx, int count) {
		if (vidx + 1 == str.length()) {
			return count;
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i' && str.charAt(vidx + 2) == 't') {
		} else if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			count++;
		}
		return counthit(str, vidx + 1, count);
	}

	public static String removehit(StringBuilder str, int vidx) {
		if (vidx + 1 == str.length()) {
			return str.toString();
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i' && str.charAt(vidx + 2) == 't') {
		} else if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			str.delete(vidx, vidx + 2);
		}
		return removehit(str, vidx + 1);
	}

	public static String replacehit(StringBuilder str, int vidx) {
		if (vidx + 1 == str.length()) {
			return str.toString();
		}
		if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i' && str.charAt(vidx + 2) == 't') {
		} else if (str.charAt(vidx) == 'h' && str.charAt(vidx + 1) == 'i') {
			str.replace(vidx, vidx + 2, "BYE");
		}
		return replacehit(str, vidx + 1);
	}

	public static int twin(StringBuilder str, int vidx, int count) {
		if (vidx + 2 == str.length()) {
			return count;
		}
		if (str.charAt(vidx) == str.charAt(vidx + 2)) {
			count++;
		}
		return twin(str, vidx + 1, count);
	}

	public static int threea(StringBuilder str, int vidx, int count) {
		if (vidx + 2 == str.length()) {
			return count;
		}
		if (str.charAt(vidx) == 'a' && str.charAt(vidx + 1) == 'a' && str.charAt(vidx + 2) == 'a') {
			count++;
		}
		return threea(str, vidx + 1, count);
	}

	public static int splthreea(StringBuilder str, int vidx, int count) {
		if (vidx + 2 >= str.length()) {
			return count;
		}
		if (str.charAt(vidx) == 'a' && str.charAt(vidx + 1) == 'a' && str.charAt(vidx + 2) == 'a') {
			count++;
			vidx = vidx + 2;
		}
		return splthreea(str, vidx + 1, count);
	}

	public static char cases(String str) {
		int ch = str.charAt(0) - '0';
		char ans;
		if (str.length() - 1 == 0) {
			ans = (char) (ch + 'a' - 1);
			return ans;
		} else {
			int ch1 = str.charAt(1) - '0';
			ans = (char) (ch1 + (ch * 10) + 'a' - 1);
			return ans;
		}
	}

	public static void keys(String str) {

	}

	public static String paren(StringBuilder str, int vidx, StringBuilder str1) {
		if (vidx == str.length()) {
			return str1.toString();
		}
		if (str.charAt(vidx) == '(') {
			int i = vidx + 1;
			while (str.charAt(i) != ')') {
				str1.append(str.charAt(i));
				i++;
			}
		}
		return paren(str, vidx + 1, str1);
	}

	public static boolean cond(String str, int vidx) {
		if (vidx == str.length()) {
			return true;
		}
		if (str.charAt(0) != 'a') {
			return false;
		} else {
			if (str.charAt(vidx) == 'a') {
				if (vidx + 1 == str.length() || str.charAt(vidx + 1) == 'a') {
					return cond(str, vidx + 1);
				} else if (str.charAt(vidx + 1) == 'b' && str.charAt(vidx + 2) == 'b') {
					return cond(str, vidx + 1);
				} else {
					return false;
				}
			}
		}
		return true;// temporary
	}

	public static boolean matheq(String str, int c1, int c2, int c3) {
		if (str.length() == 0) {
			if (c1 % 2 == 0 && c2 % 2 == 0 && c3 % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
		char ch = str.charAt(0);
		String rec = str.substring(1);
		if (ch == '(' || ch == ')') {
			c1++;
		}
		if (ch == '{' || ch == '}') {
			c2++;
		}
		if (ch == '[' || ch == ']') {
			c3++;
		}
		boolean ans = matheq(rec, c1, c2, c3);

		return ans;
	}

	public static boolean matheq1(String str, String i) {
		if (str.length() == 0) {
			if (i.length() != 0) {
				return false;
			} else {
				return true;
			}
		}
		char ch = str.charAt(0);
		String x = str.substring(1);
		if ("({[".indexOf(ch) != -1) {
			return matheq1(x, i + ch);
		} else if (")}]".indexOf(ch) != -1) {
			if (i.length() == 0) {
				return false;
			}
			String lob = i.substring(i.length() - 1);
			if (")}]".indexOf(ch) != "({[".indexOf(lob)) {
				return false;
			} else {
				return matheq1(x, i.substring(0, i.length() - 1));
			}
		} else {
			return matheq1(x, i);
		}
	}

	public static void printTargetSS(int[] arr, int vidx, int tar, String ans) {
		if (vidx == arr.length) {
			if (tar == 0) {
				System.out.println(ans);
				return;
			}

			return;
		}

		printTargetSS(arr, vidx + 1, tar - arr[vidx], ans + " " + arr[vidx]);
		printTargetSS(arr, vidx + 1, tar, ans);
	}
}
