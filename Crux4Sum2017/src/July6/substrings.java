package July6;

public class substrings {

	public static void main(String[] args) {

		String str = "abc";
		printsubstring(str);
//		System.out.println(pall(str));
//		pallc(str);

	}

	public static void printsubstring(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

	public static boolean pall(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}

	public static void pallc(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
					System.out.println("True");
				}
			}
		}

	}
}