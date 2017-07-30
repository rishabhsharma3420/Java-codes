package july11;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Arraylist {

	public static void main(String[] args) {
		int[] one = { 1, 1, 2, 2, 2, 3, 5 };
		int[] two = { 1, 1, 1, 2, 2, 3, 4, 5 };
		System.out.println(intersection(one, two));
	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {
		ArrayList<Integer> a = new ArrayList<>();
		int j = 0;
		int i = 0;
		while (i < one.length && j < two.length) {
			if (one[i] == two[j]) {
				a.add(one[i]);

				i++;
				j++;
			} else if (one[i] > two[j]) {
				j++;
			} else {
				i++;
			}
		}
		return a;
	}
}
