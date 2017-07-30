package june7;

public class One {

	public static void main(String[] args) {
		// StringBuilder sb = new StringBuilder("aaabccbaa");
		// System.out.println(toggle(sb));
		// System.out.println(replace(sb));
		// System.out.println(q3(sb));
		// System.out.println(q9(sb));
		// System.out.println(q10(sb));
		// System.out.println(q8(sb));
		// int[] arr = { 1,1,1,1,1,1,1,1};
		// display(sort(arr));
		// display(sort(arr));
	}

	public static String toggle(StringBuilder sb) {
		StringBuilder sb1 = new StringBuilder();
		for (int i = sb.length() - 1; i >= 0; i--) {
			int j = sb.charAt(i);
			if (j >= 64 && j <= 91) {
				j += 32;
			} else {
				j -= 32;
			}
			sb1.insert(0, (char) j);
		}
		return sb1.toString();
	}

	public static String replace(StringBuilder sb) {
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			int j = sb.charAt(i);
			if (i % 2 == 0) {
				j--;
			} else {
				j++;
			}
			sb1.append((char) j);
		}
		return sb1.toString();
	}

	public static String q3(StringBuilder sb) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(sb.charAt(0));
		for (int i = 1; i < sb.length(); i++) {
			int j = sb.charAt(i);
			int l = sb.charAt(i - 1);
			int k = 0;
			k = j - l;
			sb1.append((int) k);
			sb1.append((char) j);

		}
		return sb1.toString();
	}

	public static String q9(StringBuilder sb) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(sb.charAt(0));
		for (int i = 1; i < sb.length(); i++) {
			int j = sb.charAt(i);
			int k = sb.charAt(i - 1);
			if (j == k) {
			} else {
				sb1.append((char) j);
			}
		}
		return sb1.toString();
	}

	public static String q10(StringBuilder sb) {
		StringBuilder sb1 = new StringBuilder();
		int m = 1;
		// sb1.append(sb.charAt(0));
		for (int i = 1; i < sb.length(); i++) {
			int j = sb.charAt(i);
			int k = sb.charAt(i - 1);
			if (j == k) {
				m++;
			} else {
				sb1.append((char) j);
				if (m > 1) {
					sb1.append((int) m);
					m = 1;
				}
			}
		}

		return sb1.toString();
	}

	public static int q8(StringBuilder sb) {
		int[] arr = new int[256];
		for (int i = 0; i < sb.length(); i++) {
			int j = sb.charAt(i);
			arr[j] += 1;
		}
		int k = getMax(arr);
		return k;

	}

	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int[] sort(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] == 1) {
				Swap(arr, i, j);
				j--;
			} else {
				i++;
			}
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + "\t");
		}
		System.out.println(".");
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] sort2(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int k = arr.length - 1;
		while (i < arr.length) {
			int l = j - 1;
			if (arr[i] == 2) {
				Swap(arr, k, l);
				k--;
			} else if (arr[i] == 1) {
				Swap(arr, i, j);
				j--;
			} else {
				i++;
			}
		}
		return arr;
	}

	public static int[] sort1(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		// int k=arr.length-1;
		while (i < arr.length) {
			if (arr[i] == 0) {
				Swap(arr, i, j);
				j--;
				// } else if(arr[i]==2){
				// Swap(arr,k,i);
				// Swap(arr,k,j);
				//
				// k--;
				// j--;
			} else {
				i++;
			}
		}
		return arr;
	}

}