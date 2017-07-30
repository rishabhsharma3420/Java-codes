package assignment5;

public class Practice {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("HeLLo");
		System.out.print(freq(sb));
	}

	public static boolean pal(StringBuilder sb) {
		for (int i = 0; i < sb.length() / 2; i++) {
			if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static int palcount(StringBuilder sb) {
		int count = 0;
		for (int i = 0; i < sb.length() / 2; i++) {
			if (sb.charAt(i) == sb.charAt(sb.length() - i - 1)) {
				count++;
			}
		}
		return count;
	}

	public static StringBuilder toggle(StringBuilder sb) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			int j = sb.charAt(i);
			if (j > 'a' && j <= 'z') {
				j -= (int) ('a' - 'A');
			} else if (j > 'A' && j <= 'Z') {
				j += (int) ('a' - 'A');
			}
			s.append((char) j);
		}
		return s;
	}

	public static StringBuilder incdec(StringBuilder sb) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			int j = sb.charAt(i);
			if (i % 2 == 0) {
				j++;
			} else {
				j--;
			}
			s.append((char) j);
		}
		return s;
	}

	public static StringBuilder btw(StringBuilder sb) {
		StringBuilder s = new StringBuilder();
		for (int i = 1; i < sb.length(); i++) {
			int j;
			j = sb.charAt(i) - sb.charAt(i - 1);
			s.append(sb.charAt(i - 1));
			s.append(' ');
			s.append(j);
			s.append(' ');
		}
		s.append(sb.charAt(sb.length() - 1));
		return s;
	}
	
	public static int freq(StringBuilder sb){
		int[] arr=new int[256];
		for(int i=0;i<sb.length();i++){
			int j=sb.charAt(i);
			arr[j]+=1;
		}
		int k=july10.Arraysrec.getmax(arr, 0);
		return k;
	}
}
