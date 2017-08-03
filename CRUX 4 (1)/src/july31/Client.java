package july31;

import java.util.Comparator;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Cars car[] = new Cars[5];
		car[0] = new Cars("Audi", 300, 2);
		car[1] = new Cars("Lamborghini", 350, 20);
		car[2] = new Cars("Ferrari", 250, 200);
		car[3] = new Cars("Dodge", 301, 1);
		car[4] = new Cars("Mustang", 275, 5);
//		display(car);
//		bubsort(car);
//		display(car);
		Scanner scn = new Scanner(System.in);
		System.out.println("CAR KIS TYPE SE SORT KRNI HAI:\n1-SPEED\n2-Price\n3-name");
		int type = scn.nextInt();
		System.out.println("SEEDHA YA ULTA\nTRUE : SEEDHA\nFALSE : ULTA");
		boolean priority = scn.nextBoolean();
		if (type == 1 && priority) {
			bubsort1(car, Cars.csc);
			display(car);
		} else if (type == 1 && !priority) {
			bubsort1(car, Cars.csrc);
			display(car);
		} else if (type == 2 && priority) {
			bubsort1(car, Cars.cpc);
			display(car);
		} else if (type == 2 && !priority) {
			bubsort1(car, Cars.cprc);
			display(car);
		} else if (type == 3 && priority) {
			bubsort1(car, Cars.cnc);
			display(car);
		} else if (type == 3 && !priority) {
			bubsort1(car, Cars.cnrc);
			display(car);
		} else {
			System.out.println("KYA KRRA HAI GALAT KAAM NAA KR");
		}

		scn.close();

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.print(val + "   ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void bubsort(T[] arr) {
		int count = 0;
		while (count < arr.length) {
			for (int i = 0; i < arr.length - count - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			count++;
		}
	}

	public static <T> void bubsort1(T[] arr, Comparator<T> ctor) {
		int count = 0;
		while (count < arr.length) {
			for (int i = 0; i < arr.length - count - 1; i++) {
				if (ctor.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			count++;
		}
	}
}
